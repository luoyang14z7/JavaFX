/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltest;
import com.sun.javafx.font.FontConstants;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Date;
import javafx.scene.Parent;
import check.Check;
import javafx.application.Platform;
import fxmltest.FXMLTest;
import javafx.scene.control.TextField;
import fxmltest.LoginController;
import java.sql.*;
import javafx.scene.Scene;
import check.Check;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import fxmltest.FXMLTest;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import fxmltest.MainController;
import javafx.scene.control.Alert;
/**
 *
 * @author Administrator
 */
    
public class adminlogin {
    @FXML private TextField adminname;
    @FXML private PasswordField adminpass;
    @FXML private Button login;
    
       public void adminlogin(ActionEvent event) {
                
                     try {
                                     Check sql = new Check();
             Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select username,password,job from users where username=? and password=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
               String adminusername = adminname.getText();
               String adminuserpass = adminpass.getText();
                ps.setString(1, adminusername);
                ps.setString(2, adminuserpass);
                sql.rs=ps.executeQuery();
                sql.rs.next();
                String yunxu = (String)(sql.rs.getString("job")).trim();
                sql.conn.close();
                 if ("店长".equals(yunxu)) {
                 usersguanli();
             }
                     } catch (Exception e) {
                           e.printStackTrace();
                     }
                              
                }
         
           @FXML   private void usersguanli(){
        try {
            //一定需要使用try-catch
            //下段实现的内容和Main.java中其实是一样的
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("userGuanli.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("用户管理");
            anotherStage.setScene(new Scene(anotherRoot, 840, 750));
            anotherStage.setResizable(false);  
            anotherStage.show();

           
        } catch (Exception e){
            e.printStackTrace();
        }
                      
    }
           
           
           
           
           
           
}
