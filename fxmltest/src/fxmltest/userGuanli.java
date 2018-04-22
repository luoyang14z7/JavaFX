/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmltest;
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
import java.sql.*;
import javafx.scene.Scene;
import check.Check;
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
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Administrator
 */
public class userGuanli  implements Initializable{
    @FXML private Label username1,username2,username3,username4,username5,username6,username7;
    @FXML private TextField password1,password2,password3,password4,password5,password6,password7;
    @FXML private TextField job1,job2,job3,job4,job5,job6,job7;
    @FXML private Button xiugai1,xiugai2,xiugai3,xiugai4,xiugai5,xiugai6,xiugai7;
    @FXML private Label tishi1;
    @FXML private Button shanchu1,shanchu2,shanchu3,shanchu4,shanchu5,shanchu6,shanchu7;
    @FXML private TextField usernameadd,userpassadd,userjobadd;
    @FXML private Button add;

    Check sql = new Check();
    
    public void initialize(URL url, ResourceBundle rb) { 
    

       show();
        
        
    }
    
    //显示用户信息
    public void show(){
        try {
             Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select username,password,job,uid from users where uid=?;";
            int id=1;
              int uid;
              String un,pwd,j;
              do {   
                PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                sql.rs=ps.executeQuery();
                sql.rs.next();
             

                uid = sql.rs.getInt("uid");
               un = sql.rs.getString("username");
               pwd = sql.rs.getString("password");
               j = sql.rs.getString("job");
        switch(uid) {
                case 1:       
                    username1.setText(un);
                    password1.setText(pwd);
                    job1.setText(j);
                    break;
                case 2:
                    username2.setText(un);
                    password2.setText(pwd);
                    job2.setText(j);
                    break;
                case 3:
                    username3.setText(un);
                    password3.setText(pwd);
                    job3.setText(j);
                    break;
                case 4:
                    username4.setText(un);
                    password4.setText(pwd);
                    job4.setText(j);
                    break;
                case 5:
                    username5.setText(un);
                    password5.setText(pwd);
                    job5.setText(j);
                    break;
                case 6:
                    username6.setText(un);
                    password6.setText(pwd);
                    job6.setText(j);
                    break;
                case 7:
                    username7.setText(un);
                    password7.setText(pwd);
                    job7.setText(j);
                    break;
                default:
                     break;
        }
                    id++;
              } while (id<13);      
        } catch (Exception e) {
            e.printStackTrace(); 
        }
          
    }
    
    
    //用户修改按钮
    public void xiugai1(ActionEvent event){
         
             String un = username1.getText();
             String pwd = password1.getText();
             String j = job1.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
         
    }
    public void xiugai2(ActionEvent event){
     
             String un = username2.getText();
             String pwd = password2.getText();
             String j = job2.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
         
    }
    public void xiugai3(ActionEvent event){
        
             String un = username3.getText();
             String pwd = password3.getText();
             String j = job3.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
         
    }
    public void xiugai4(ActionEvent event){
      
             String un = username4.getText();
             String pwd = password4.getText();
             String j = job4.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
      
    }
    public void xiugai5(ActionEvent event){
        
             String un = username5.getText();
             String pwd = password5.getText();
             String j = job5.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
      
    }
    public void xiugai6(ActionEvent event){
         
             String un = username6.getText();
             String pwd = password6.getText();
             String j = job6.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
   
    }
    public void xiugai7(ActionEvent event){
         
             String un = username7.getText();
             String pwd = password7.getText();
             String j = job7.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update users set password=?,job=? where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, pwd);
                ps.setString(2, j);
                ps.setString(3, un);
                ps.executeUpdate();
                tishi1.setText("修改成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
     
    }
    
    //用户删除按钮
    public void shanchu1(ActionEvent event){
        
             String un = username1.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
       
    }
    public void shanchu2(ActionEvent event){
         
             String un = username2.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
       
    }
    public void shanchu3(ActionEvent event){
         
             String un = username3.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
       
    }
    public void shanchu4(ActionEvent event){
        
             String un = username4.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
        
    }
    public void shanchu5(ActionEvent event){
         
             String un = username5.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
       
    }
    public void shanchu6(ActionEvent event){
      
             String un = username6.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
          
    }
    public void shanchu7(ActionEvent event){
        
             String un = username7.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "delete from users where username=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.executeUpdate();
                tishi1.setText("删除成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
        
    }
    
    //用户添加按钮
    public void add(ActionEvent event){
         
             String un = usernameadd.getText();
             String pwd = userpassadd.getText();
             String j = userjobadd.getText();
             try {
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into users(username,password,job) value(?,?,?); ";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setString(1, un);
                ps.setString(2, pwd);
                ps.setString(3, j);
                ps.executeUpdate();
                tishi1.setText("添加成功！请重新打开此窗口即可显示！");
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
         
    }
    
    
    

    
   
    
    
    
    
    
    
    
    
    
    
    
    
}
