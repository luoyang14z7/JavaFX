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
import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import java.time.format.DateTimeFormatter;
import javafx.util.StringConverter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author Administrator
 */
public class dingdanGuanli implements Initializable{
   @FXML private TextField time;
   @FXML private DatePicker timecheck;
   @FXML private Label weixin,zhifubao,tuangou,xianjin,dazhong,meituan,zengyin,all;
   @FXML private Label naishuangnum1,naishuangnum2,naishuangnum3,naishuangnum4,naishuangnum5,naishuangnum6,naishuangnum7,naishuangnum8,naishuangpre1,naishuangpre2,naishuangpre3,naishuangpre4,naishuangpre5,naishuangpre6,naishuangpre7,naishuangpre8;
   @FXML private Label naichanum1,naichanum2,naichanum3,naichanum4,naichanum5,naichanum6,naichanum7,naichanum8,naichapre1,naichapre2,naichapre3,naichapre4,naichapre5,naichapre6,naichapre7,naichapre8,naichapre9,naichapre10,naichanum9,naichanum10;
   @FXML private Label shuiguonum1,shuiguonum2,shuiguonum3,shuiguonum4,shuiguonum5,shuiguonum6,shuiguonum7,shuiguonum8,shuiguopre1,shuiguopre2,shuiguopre3,shuiguopre4,shuiguopre5,shuiguopre6,shuiguopre7,shuiguopre8,shuiguopre9,shuiguopre10,shuiguonum9,shuiguonum10;
   @FXML private Label kafeinum1,kafeinum2,kafeinum3,kafeinum4,kafeinum5,kafeinum6,kafeinum7,kafeipre1,kafeipre2,kafeipre3,kafeipre4,kafeipre5,kafeipre6,kafeipre7;
   @FXML private Label bingshanum1,bingshanum2,bingshanum3,bingshanum4,bingshanum5,bingshanum6,bingshanum7,bingshanum8,bingshapre1,bingshapre2,bingshapre3,bingshapre4,bingshapre5,bingshapre6,bingshapre7,bingshapre8;
   @FXML private Label tianpinnum1,tianpinnum2,tianpinnum3,tianpinnum4,tianpinnum5,tianpinnum6,tianpinpre1,tianpinpre2,tianpinpre3,tianpinpre4,tianpinpre5,tianpinpre6;

   
      private final String pattern = "yyyy-MM-dd";

    Check sql = new Check();
    
    public void initialize(URL url, ResourceBundle rb) { 
    
        zhuanhuan();

        
        
        
        
 
Thread t1 = new Thread(new ThreadTest1()); //新建一个线程类
 t1.start();
                     

    }
    
    

  
    //日期转换并提示
    public void zhuanhuan(){
           StringConverter converter = new StringConverter<LocalDate>() {
           DateTimeFormatter dateFormatter =
               DateTimeFormatter.ofPattern(pattern);
           @Override
           public String toString(LocalDate date) {
               if (date != null) {
                   return dateFormatter.format(date);
               } else {
                   return "";
               }
           }
    
                    @Override
           public LocalDate fromString(String string) {
               if (string != null && !string.isEmpty()) {
                   return LocalDate.parse(string, dateFormatter);
               } else {
                   return null;
               }
           }
       };          
       //    timecheck.set
     timecheck.setValue(LocalDate.now());
         timecheck.setConverter(converter);
}
    
    

    
       public class ThreadTest1 implements Runnable{ 
       @Override
public void run() {  
    while(true){ 
        try {
              Platform.runLater(new Runnable() {  
      @Override  
      public void run() {            
          ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = timecheck.getValue();
        ZonedDateTime zdt = localDate.atStartOfDay(zoneId);
        Date date = Date.from(zdt.toInstant());    
               SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
               String dateString = formatter.format(date);
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                  
                   int weixinpay;
                   //每种付款方式各收款金额
               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "微信付款");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               weixin.setText(weixinpa + "   RMB");
                sql.conn.close();
          } catch (Exception e) {
          }
               
               
                             try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "支付宝付款");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               zhifubao.setText(weixinpa + "   RMB");
                sql.conn.close();
          } catch (Exception e) {
          }  
                
               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "现金付款");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               xianjin.setText(weixinpa + "   RMB");
                sql.conn.close();
          } catch (Exception e) {
          }    
               
               
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "大众点评");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               dazhong.setText(weixinpa + "   RMB");
                sql.conn.close();
          } catch (Exception e) {
          }  
                
                
                            try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "美团");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               meituan.setText(weixinpa + "   RMB");
                sql.conn.close();
          } catch (Exception e) {
          }  
               
                            try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "团购");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tuangou.setText(weixinpa + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }  
               
                                           try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select COUNT(*) from shoporder where opaydate=? and opayname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate);
             ps.setString(2, "赠饮");
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               zengyin.setText(weixinpa + "   单");
               sql.conn.close();
          } catch (Exception e) {
          }  
             //总销售额
               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(opre) from shoporder where opaydate=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               all.setText(weixinpa + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }  
               
               
               //奶霜每个商品销量和金额
             try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·白桃乌龙"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum1.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               naishuangpre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }  
                               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·和风抹茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum2.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               naishuangpre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }        
                                                   try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·轻乌龙"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum3.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               naishuangpre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }         
                        
              try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·茉莉绿妍"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum4.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               naishuangpre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                         
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·四季春"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum5.setText(weixinpa);
               int pre = weixinpay * 13;
               String weixinpb = String.valueOf(pre);
               naishuangpre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                        
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·荔枝乌龙"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum6.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               naishuangpre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }  
                          try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芝士·醇香可可"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum7.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               naishuangpre7.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }        
                
                
                           try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "1/2の诱惑"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naishuangnum8.setText(weixinpa);
               int pre = weixinpay * 20;
               String weixinpb = String.valueOf(pre);
               naishuangpre8.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }              
                           
                
                //奶茶商品销量和金额
         try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "努瓦拉醇香奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum1.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }       
          try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "四季春奶绿"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum2.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                
           try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "黄金波霸奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum3.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                          
            try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "红豆乌龙奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum4.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                          
             try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "招牌小芋圆奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum5.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          } 
              try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "海盐芝士奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum6.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               naichapre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }            
               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "全套奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum7.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre7.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }           
 
               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "红豆奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum8.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre8.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }            
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "椰果奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum9.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre9.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }  
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "布丁奶茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               naichanum10.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               naichapre10.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                
                
            
           
      //水果茶商品销量和金额  
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "鲜桔柠檬汁"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum1.setText(weixinpa);
               int pre = weixinpay * 9;
               String weixinpb = String.valueOf(pre);
               shuiguopre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                   
                
                 try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "冰柠檬·红茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum2.setText(weixinpa);
               int pre = weixinpay * 11;
               String weixinpb = String.valueOf(pre);
               shuiguopre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                 
                  try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "冰柠檬·四季春"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum3.setText(weixinpa);
               int pre = weixinpay * 11;
               String weixinpb = String.valueOf(pre);
               shuiguopre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                    
                  try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "波霸轻乌龙"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum4.setText(weixinpa);
               int pre = weixinpay * 10;
               String weixinpb = String.valueOf(pre);
               shuiguopre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                   
                  try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "百香凤梨水果茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum5.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               shuiguopre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                        
                   try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "金桔柠檬水果茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum6.setText(weixinpa);
               int pre = weixinpay * 13;
               String weixinpb = String.valueOf(pre);
               shuiguopre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                
                            try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "桃乐柚柚水果茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum7.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               shuiguopre7.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }        
                             try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "蜂蜜柚子水果茶"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum8.setText(weixinpa);
               int pre = weixinpay * 13;
               String weixinpb = String.valueOf(pre);
               shuiguopre8.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }              
                              try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "鲜榨一颗柠檬"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum9.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               shuiguopre9.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                           
                              try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "满满红柚四季春"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               shuiguonum10.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               shuiguopre10.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                 
                            
          //咖啡商品销量和金额                          
                               try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "努瓦拉红茶拿铁"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum1.setText(weixinpa);
               int pre = weixinpay * 13;
               String weixinpb = String.valueOf(pre);
               kafeipre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                            
                                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "和风抹茶拿铁"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum2.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               kafeipre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                            
                                 try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "可可芭蕾拿铁"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum3.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               kafeipre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                            
                                  try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "现磨咖啡拿铁"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum4.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               kafeipre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                             
                                   try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "特调现磨咖啡"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum5.setText(weixinpa);
               int pre = weixinpay * 10;
               String weixinpb = String.valueOf(pre);
               kafeipre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                              
                                    try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "特调云朵咖啡"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum6.setText(weixinpa);
               int pre = weixinpay * 14;
               String weixinpb = String.valueOf(pre);
               kafeipre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                               
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "经典美式咖啡"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               kafeinum7.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               kafeipre7.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                  
   //冰沙商品销量和金额 
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "抹茶鲜奶思慕雪"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum1.setText(weixinpa);
               int pre = weixinpay * 13;
               String weixinpb = String.valueOf(pre);
               bingshapre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          } 
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "可可鲜奶思慕雪"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum2.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               bingshapre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          } 
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "芒果鲜奶思慕雪"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum3.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               bingshapre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          } 
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "红豆鲜奶思慕雪"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum4.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               bingshapre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }    
   
                                     try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "超级芒果百乐冰"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum5.setText(weixinpa);
               int pre = weixinpay * 11;
               String weixinpb = String.valueOf(pre);
               bingshapre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }    
                                      try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "和风抹茶百乐冰"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum6.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               bingshapre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }     
                                       try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "可可牛奶百乐冰"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum7.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               bingshapre7.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }    
                                       try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "红豆牛奶百乐冰"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               bingshanum8.setText(weixinpa);
               int pre = weixinpay * 11;
               String weixinpb = String.valueOf(pre);
               bingshapre8.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }   

            //甜品商品销量和金额      
                                          try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "杨枝甘露"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum1.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               tianpinpre1.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                     
                                          try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "多芒小丸子"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum2.setText(weixinpa);
               int pre = weixinpay * 15;
               String weixinpb = String.valueOf(pre);
               tianpinpre2.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                       
                                           try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "多芒红豆捞"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum3.setText(weixinpa);
               int pre = weixinpay * 12;
               String weixinpb = String.valueOf(pre);
               tianpinpre3.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                        
                                           try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "榴莲蜜月"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum4.setText(weixinpa);
               int pre = weixinpay * 19;
               String weixinpb = String.valueOf(pre);
               tianpinpre4.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                        
                                            try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "黄桃班戟"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum5.setText(weixinpa);
               int pre = weixinpay * 10;
               String weixinpb = String.valueOf(pre);
               tianpinpre5.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }                                       
                                             try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
             sql.sql = "select sum(oshopnum) from shoporderlist where oshopdate=? and oshopname=?;";
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             ps.setDate(1, sqlDate); 
             ps.setString(2, "榴莲巧克力千层"); 
               sql.rs=ps.executeQuery();
               sql.rs.next();
               weixinpay=sql.rs.getInt(1);  
               String weixinpa = String.valueOf(weixinpay);
               tianpinnum6.setText(weixinpa);
               int pre = weixinpay * 28;
               String weixinpb = String.valueOf(pre);
               tianpinpre6.setText(weixinpb + "   RMB");
               sql.conn.close();
          } catch (Exception e) {
          }              
                           
                
      }
      
              }); Thread.sleep(500);
              
              
        } catch (Exception e) {
        }
   }
}
   }
    
    
    
    
   


    

    
    
    
}

