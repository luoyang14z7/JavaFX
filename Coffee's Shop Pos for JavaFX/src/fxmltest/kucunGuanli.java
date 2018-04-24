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
import java.util.Date; 
import java.text.SimpleDateFormat; 

/**
 *
 * @author Administrator
 */
public class kucunGuanli  implements Initializable{
    @FXML private Label boba,zhishi,hongcha,lvcha,ningmeng,jinju,niunai,hongdou,guotang;
    @FXML private TextField num1,num2,num3,num4,num5,num6,num7,num8,num9;
    @FXML private Label time;
    @FXML private Button save,clearall;


    Check sql = new Check();
    
    public void initialize(URL url, ResourceBundle rb) { 
    

       show();
        
        
    }
    
    //显示用户信息
    public void show(){
        try {
             Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select name,num,date,sid from kucun where sid=?;";
            int id=1;
              int sid;
              String name,num;
              Date date;
              do {   
                PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                sql.rs=ps.executeQuery();
                sql.rs.next();
             

                sid = sql.rs.getInt("sid");
               name = sql.rs.getString("name");
               num = sql.rs.getString("num");
               date = sql.rs.getTimestamp("date");
               String dateString =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        switch(sid) {
                case 1:       
                    boba.setText(name);
                    num1.setText(num);
                    time.setText(dateString);
                    break;
                case 2:
                    zhishi.setText(name);
                    num2.setText(num);
                    time.setText(dateString);
                    break;
                case 3:
                    hongcha.setText(name);
                    num3.setText(num);
                    time.setText(dateString);
                    break;
                case 4:
                    lvcha.setText(name);
                    num4.setText(num);
                    time.setText(dateString);
                    break;
                case 5:
                    ningmeng.setText(name);
                    num5.setText(num);
                    time.setText(dateString);
                    break;
                case 6:
                    jinju.setText(name);
                    num6.setText(num);
                    time.setText(dateString);
                    break;
                case 7:
                    niunai.setText(name);
                    num7.setText(num);
                    time.setText(dateString);
                    break;
                case 8:
                    hongdou.setText(name);
                    num8.setText(num);
                    time.setText(dateString);
                    break;
                case 9:
                    guotang.setText(name);
                    num9.setText(num);
                    time.setText(dateString);
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
    //保存按钮
     public void save(ActionEvent event){
       

             Date timenow = new Date();
             java.sql.Timestamp sqlDate = new java.sql.Timestamp(timenow.getTime());
             
             try {
                    String name = boba.getText();
                    String num = num1.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                          try {
                    String name = zhishi.getText();
                    String num = num2.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                       try {
                    String name = hongcha.getText();
                    String num = num3.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                    try {
                    String name = lvcha.getText();
                    String num = num4.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                                 try {
                    String name = ningmeng.getText();
                    String num = num5.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                                              try {
                    String name = jinju.getText();
                    String num = num6.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                                                           try {
                    String name = niunai.getText();
                    String num = num7.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                                                                        try {
                    String name = hongdou.getText();
                    String num = num8.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
                                                                                                                     try {
                    String name = guotang.getText();
                    String num = num9.getText();
                    int n = Integer.parseInt(num);
                 Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "update kucun set num=?,date=? where name=?;";  
              PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                ps.setInt(1, n);
                ps.setTimestamp(2, sqlDate);
                ps.setString(3, name);
                ps.executeUpdate();
                sql.conn.close();
             } catch (Exception e) {
                   e.printStackTrace();
             }
             
             
        
    }
    
    public void clearall(ActionEvent event){
            num1.setText("0");
            num2.setText("0");
            num3.setText("0");
            num4.setText("0");
            num5.setText("0");
            num6.setText("0");
            num7.setText("0");
            num8.setText("0");
            num9.setText("0");
            
           
    }
    
    
    
   
    
    
    
    
    
    
    
    
  
    
    
    
}
