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
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author itwang
 */
public class MainController implements Initializable{
    private FXMLTest application;
    @FXML private Label MAIN_Time;
    @FXML private Label MAIN_Date;
    @FXML private Button naishuang1,naishuang2,naishuang3,naishuang4,naishuang5,naishuang6,naishuang7,naishuang8,naishuang9,naishuang10,naishuang11,naishuang12;
    @FXML private Button naicha1,naicha2,naicha3,naicha4,naicha5,naicha6,naicha7,naicha8,naicha9,naicha10,naicha11,naicha12;
    @FXML private Button shuiguo1,shuiguo2,shuiguo3,shuiguo4,shuiguo5,shuiguo6,shuiguo7,shuiguo8,shuiguo9,shuiguo10,shuiguo11,shuiguo12;
    @FXML private Button kafei1,kafei2,kafei3,kafei4,kafei5,kafei6,kafei7,kafei8,kafei9,kafei10,kafei11,kafei12;
    @FXML private Button bingsha1,bingsha2,bingsha3,bingsha4,bingsha5,bingsha6,bingsha7,bingsha8,bingsha9,bingsha10,bingsha11,bingsha12;
    @FXML private Button tianpin1,tianpin2,tianpin3,tianpin4,tianpin5,tianpin6,tianpin7,tianpin8,tianpin9,tianpin10,tianpin11,tianpin12;
    @FXML private Label id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,shopname1,shopname2,shopname3,shopname4,shopname5,shopname6,shopname7,shopname8,shopname9,shopname10,shopname11,pre1,pre2,pre3,pre4,pre5,pre6,pre7,pre8,pre9,pre10,pre11,mess1;
    @FXML private Label beizhu1,beizhu2,beizhu3,beizhu4,beizhu5,beizhu6,beizhu7,beizhu8,beizhu9,beizhu10,beizhu11;
    @FXML private Label preall;
    @FXML private MenuItem exit,about,useradmin,kucun,dingdan;
    @FXML private Label zhi;


    
  Check sql = new Check();

  
//  @FXML private TextField account;

            
    public void setApp(FXMLTest application){
        this.application = application;
    }
    
    
   @FXML
    private void OUT_M(ActionEvent event) {
       application.useroutmain();
    }
    @Override
   public void initialize(URL url, ResourceBundle rb) {  
          // 以下是奶霜系列菜单
        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopid=?;";  
             int id=1;
              String shopname;
              String price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           naishuang1.setText(shopname); 
                           break;
                       case 2:
                           naishuang2.setText(shopname); 
                           break;
                       case 3:
                           naishuang3.setText(shopname);
                           break;
                        case 4:
                           naishuang4.setText(shopname);
                           break;
                        case 5:
                           naishuang5.setText(shopname);
                           break;
                        case 6:
                           naishuang6.setText(shopname);
                           break;
                        case 7:
                           naishuang7.setText(shopname);
                           break;
                        case 8:
                           naishuang8.setText(shopname);
                           break;
                        case 9:
                           naishuang9.setText(shopname);
                           break;
                        case 10:
                           naishuang10.setText(shopname);
                           break;
                        case 11:
                           naishuang11.setText(shopname);
                           break;
                        case 12:
                           naishuang12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
           // 以下是经典奶茶菜单
         try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopid=?;";  
             int id=1;
              String shopname;
              String price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           naicha1.setText(shopname); 
                           break;
                       case 2:
                           naicha2.setText(shopname); 
                           break;
                       case 3:
                           naicha3.setText(shopname);
                           break;
                        case 4:
                           naicha4.setText(shopname);
                           break;
                        case 5:
                           naicha5.setText(shopname);
                           break;
                        case 6:
                           naicha6.setText(shopname);
                           break;
                        case 7:
                           naicha7.setText(shopname);
                           break;
                        case 8:
                           naicha8.setText(shopname);
                           break;
                        case 9:
                           naicha9.setText(shopname);
                           break;
                        case 10:
                           naicha10.setText(shopname);
                           break;
                        case 11:
                           naicha11.setText(shopname);
                           break;
                        case 12:
                           naicha12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
           // 以下是水果茶菜单
         try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopid=?;";  
             int id=1;
              String shopname;
              String price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           shuiguo1.setText(shopname); 
                           break;
                       case 2:
                           shuiguo2.setText(shopname); 
                           break;
                       case 3:
                           shuiguo3.setText(shopname);
                           break;
                        case 4:
                           shuiguo4.setText(shopname);
                           break;
                        case 5:
                           shuiguo5.setText(shopname);
                           break;
                        case 6:
                           shuiguo6.setText(shopname);
                           break;
                        case 7:
                           shuiguo7.setText(shopname);
                           break;
                        case 8:
                           shuiguo8.setText(shopname);
                           break;
                        case 9:
                           shuiguo9.setText(shopname);
                           break;
                        case 10:
                           shuiguo10.setText(shopname);
                           break;
                        case 11:
                           shuiguo11.setText(shopname);
                           break;
                        case 12:
                           shuiguo12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
         // 以下是咖啡拿铁菜单
                try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopid=?;";  
             int id=1;
              String shopname;
              String price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           kafei1.setText(shopname); 
                           break;
                       case 2:
                           kafei2.setText(shopname); 
                           break;
                       case 3:
                           kafei3.setText(shopname);
                           break;
                        case 4:
                           kafei4.setText(shopname);
                           break;
                        case 5:
                           kafei5.setText(shopname);
                           break;
                        case 6:
                           kafei6.setText(shopname);
                           break;
                        case 7:
                           kafei7.setText(shopname);
                           break;
                        case 8:
                           kafei8.setText(shopname);
                           break;
                        case 9:
                           kafei9.setText(shopname);
                           break;
                        case 10:
                           kafei10.setText(shopname);
                           break;
                        case 11:
                           kafei11.setText(shopname);
                           break;
                        case 12:
                           kafei12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }  
       //以下是冰沙菜单
        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopid=?;";  
             int id=1;
              String shopname;
              String price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           bingsha1.setText(shopname); 
                           break;
                       case 2:
                           bingsha2.setText(shopname); 
                           break;
                       case 3:
                           bingsha3.setText(shopname);
                           break;
                        case 4:
                           bingsha4.setText(shopname);
                           break;
                        case 5:
                           bingsha5.setText(shopname);
                           break;
                        case 6:
                           bingsha6.setText(shopname);
                           break;
                        case 7:
                           bingsha7.setText(shopname);
                           break;
                        case 8:
                           bingsha8.setText(shopname);
                           break;
                        case 9:
                           bingsha9.setText(shopname);
                           break;
                        case 10:
                           bingsha10.setText(shopname);
                           break;
                        case 11:
                           bingsha11.setText(shopname);
                           break;
                        case 12:
                           bingsha12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                //以下是甜品菜单
        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopid=?;";  
             int id=1;
              String shopname;
              int price;
              int shopid;  
              do {               
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
              ps.setInt(1, id);
                   sql.rs=ps.executeQuery();
                   sql.rs.next();
             shopid = sql.rs.getInt("shopid");
         
              shopname = sql.rs.getString("shopname");
                   switch(shopid) {
                       case 1:         
                           tianpin1.setText(shopname); 
                           break;
                       case 2:
                           tianpin2.setText(shopname); 
                           break;
                       case 3:
                           tianpin3.setText(shopname);
                           break;
                        case 4:
                           tianpin4.setText(shopname);
                           break;
                        case 5:
                           tianpin5.setText(shopname);
                           break;
                        case 6:
                           tianpin6.setText(shopname);
                           break;
                        case 7:
                           tianpin7.setText(shopname);
                           break;
                        case 8:
                           tianpin8.setText(shopname);
                           break;
                        case 9:
                           tianpin9.setText(shopname);
                           break;
                        case 10:
                           tianpin10.setText(shopname);
                           break;
                        case 11:
                           tianpin11.setText(shopname);
                           break;
                        case 12:
                           tianpin12.setText(shopname);
                           break;
                        default:

                             break;
                   }
                  id++;
                 
            } while (id<13); 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
        
         
     
         
         
         
         
         
         
         
         
         
         
         
         
         
        
     Date time = new Date();
       java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");        
       String stime = f.format(time);      
       MAIN_Date.setText(stime); 
   //    LoginController lo = new LoginController();
  //     String ac = account.getText();
    //  MAIN_User.setText(lo.ac);
       
        exit();
        about();
        useradmin();
        kucun();
        dingdan();
   //    adminlogin();
   //   usersguanli();
               
       
 Thread t1 = new Thread(new ThreadTest1()); //新建一个线程类
 t1.start(); //线程启动
  Thread t2 = new Thread(new ThreadTest2()); //新建一个线程类
 t2.start(); //线程启动
    }  
   //时间刷新线程
   public class ThreadTest1 implements Runnable{ 
       @Override
public void run() {  
    while(true){ 
        try {
              Platform.runLater(new Runnable() {  
      @Override  
      public void run() {            
                Date time = new Date();              
    java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("HH:mm:ss");
       String stime = f.format(time);
          MAIN_Time.setText(stime); 
      }
              }); Thread.sleep(1000);
        } catch (Exception e) {
        }
   }
}
   }
   //价格计算线程
    public class ThreadTest2 implements Runnable{ 
       @Override
public void run() {  
    while(true){ 
        try {
              Platform.runLater(new Runnable() {  
      @Override  
      public void run() {            
                      int listpre1 = Integer.parseInt(pre1.getText());
        int listpre2 = Integer.parseInt(pre2.getText());
         int listpre3 = Integer.parseInt(pre3.getText());
         int listpre4 = Integer.parseInt(pre4.getText());
         int listpre5 = Integer.valueOf(pre5.getText());
         int listpre6 = Integer.valueOf(pre6.getText());
         int listpre7 = Integer.valueOf(pre7.getText());
         int listpre8 = Integer.valueOf(pre8.getText());
         int listpre9 = Integer.valueOf(pre9.getText());
         int listpre10 = Integer.valueOf(pre10.getText());
         int listpre11 = Integer.valueOf(pre11.getText());  
         
       int listpreall = listpre1+listpre2+listpre3+listpre4+listpre5+listpre6+listpre7+listpre8+listpre9+listpre10+listpre11;
         preall.setText(String.valueOf(listpreall)); 
      
      }
              }); Thread.sleep(100);
        } catch (Exception e) {
        }
   }
}
   }
   
            //点击奶霜商品后添加至菜单
     
      @FXML private void Naishuang1(ActionEvent event) {   
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
      
}
      @FXML private void Naishuang2(ActionEvent event) {
               
          
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
       
}
      @FXML private void Naishuang3(ActionEvent event) {
              
           
           
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
      
}
      @FXML private void Naishuang4(ActionEvent event) {
                
          
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
     
}
      @FXML private void Naishuang5(ActionEvent event) {

        
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
    
}
      @FXML private void Naishuang6(ActionEvent event) {
               
           
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
           
     
}
      @FXML private void Naishuang7(ActionEvent event) {
              
     
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
              
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naishuang8(ActionEvent event) {

               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naishuang where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naishuang8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      
      
         //点击奶茶商品后添加至菜单
      @FXML private void Naicha1(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha2(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha3(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha4(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha5(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha6(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Naicha7(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha8(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Naicha9(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Naicha10(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from naicha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = naicha10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      
      
        //点击水果商品后添加至菜单
      @FXML private void Shuiguo1(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
                sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Shuiguo2(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Shuiguo3(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Shuiguo4(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Shuiguo5(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Shuiguo6(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Shuiguo7(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Shuiguo8(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Shuiguo9(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo9.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Shuiguo10(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from shuiguo where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = shuiguo10.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      
      
      //点击咖啡商品后添加至菜单
      @FXML private void Kafei1(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Kafei2(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Kafei3(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Kafei4(ActionEvent event) {

               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Kafei5(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Kafei6(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Kafei7(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from kafei where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = kafei7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));   sql.conn.close();
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      
      
      //点击冰沙商品后添加至菜单
      @FXML private void Bingsha1(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }

}
      @FXML private void Bingsha2(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha3(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha4(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha5(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha6(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha7(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha7.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Bingsha8(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from bingsha where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = bingsha8.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      
      
      //点击甜品商品后添加至菜单
      @FXML private void Tianpin1(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin1.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Tianpin2(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin2.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Tianpin3(ActionEvent event) {

               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin3.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Tianpin4(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin4.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Tianpin5(ActionEvent event) {

               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin5.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      @FXML private void Tianpin6(ActionEvent event) {
               String idnull1= id1.getText();
               String idnull2= id2.getText();
               String idnull3= id3.getText();
               String idnull4= id4.getText();
               String idnull5= id5.getText();
               String idnull6= id6.getText();
               String idnull7= id7.getText();
               String idnull8= id8.getText();
               String idnull9= id9.getText();
               String idnull10= id10.getText();
               String idnull11= id11.getText();
               if (idnull1=="") {
                     try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id1.setText("1");
  
             shopname1.setText(shopname);
             num1.setText("x1");
             pre1.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               else if (idnull2=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id2.setText("2");
  
             shopname2.setText(shopname);
             num2.setText("x1");
             pre2.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
              else   if (idnull3=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id3.setText("3");
  
             shopname3.setText(shopname);
             num3.setText("x1");
             pre3.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
            else   if (idnull4=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id4.setText("4");
  
             shopname4.setText(shopname);
             num4.setText("x1");
             pre4.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull5=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id5.setText("5");
  
             shopname5.setText(shopname);
             num5.setText("x1");
             pre5.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull6=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id6.setText("6");
  
             shopname6.setText(shopname);
             num6.setText("x1");
             pre6.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull7=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id7.setText("7");
  
             shopname7.setText(shopname);
             num7.setText("x1");
             pre7.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull8=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id8.setText("8");
  
             shopname8.setText(shopname);
             num8.setText("x1");
             pre8.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull9=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id9.setText("9");
  
             shopname9.setText(shopname);
             num9.setText("x1");
             pre9.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull10=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id10.setText("10");
  
             shopname10.setText(shopname);
             num10.setText("x1");
             pre10.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
             else  if (idnull11=="") {
                                 try {
                      Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "select shopid,shopname,price from tianpin where shopname=?;";  
               PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
                          String shopname = tianpin6.getText();
              ps.setString(1, shopname);
              int price;
               sql.rs=ps.executeQuery();
                   sql.rs.next();
              price = sql.rs.getInt("price");
                id11.setText("11");
  
             shopname11.setText(shopname);
             num11.setText("x1");
             pre11.setText(String.valueOf(price));
               } catch (Exception e) {
               }
               }
               
             else{   mess1.setText("当前最多支持11件商品"); }
}
      
      
       //菜单删除按钮
     @FXML private void delete1(ActionEvent event) {
       id1.setText("");
       shopname1.setText("");
       num1.setText("");
       pre1.setText("0");
       beizhu1.setText("");
    }
     @FXML private void delete2(ActionEvent event) {
       id2.setText("");
       shopname2.setText("");
       num2.setText("");
       pre2.setText("0");
       beizhu2.setText("");
    }
     @FXML private void delete3(ActionEvent event) {
       id3.setText("");
       shopname3.setText("");
       num3.setText("");
       pre3.setText("0");
       beizhu3.setText("");
    }
     @FXML private void delete4(ActionEvent event) {
       id4.setText("");
       shopname4.setText("");
       num4.setText("");
       pre4.setText("0");
       beizhu4.setText("");
    }
     @FXML private void delete5(ActionEvent event) {
       id5.setText("");
       shopname5.setText("");
       num5.setText("");
       pre5.setText("0");
       beizhu5.setText("");
    }
     @FXML private void delete6(ActionEvent event) {
       id6.setText("");
       shopname6.setText("");
       num6.setText("");
       pre6.setText("0");
       beizhu6.setText("");
    }
     @FXML private void delete7(ActionEvent event) {
       id7.setText("");
       shopname7.setText("");
       num7.setText("");
       pre7.setText("0");
       beizhu7.setText("");
    }
     @FXML private void delete8(ActionEvent event) {
       id8.setText("");
       shopname8.setText("");
       num8.setText("");
       pre8.setText("0");
       beizhu8.setText("");
    }
     @FXML private void delete9(ActionEvent event) {
       id9.setText("");
       shopname9.setText("");
       num9.setText("");
       pre9.setText("0");
       beizhu9.setText("");
    }
     @FXML private void delete10(ActionEvent event) {
       id10.setText("");
       shopname10.setText("");
       num10.setText("");
       pre10.setText("0");
       beizhu10.setText("");
    }
     @FXML private void delete11(ActionEvent event) {
       id11.setText("");
       shopname11.setText("");
       num11.setText("");
       pre11.setText("0");
       beizhu11.setText("");
    }
     
     
      //菜单清空按钮
          @FXML private void clearall(ActionEvent event) {
       id1.setText("");id2.setText("");id3.setText("");id4.setText("");id5.setText("");id6.setText("");id7.setText("");id8.setText("");id9.setText("");id10.setText("");id11.setText("");
       shopname1.setText("");shopname2.setText("");shopname3.setText("");shopname4.setText("");shopname5.setText("");shopname6.setText("");shopname7.setText("");shopname8.setText("");shopname9.setText("");shopname10.setText("");shopname11.setText("");
       num1.setText("");num2.setText("");num3.setText("");num4.setText("");num5.setText("");num6.setText("");num7.setText("");num8.setText("");num9.setText("");num10.setText("");num11.setText("");
       pre1.setText("0");pre2.setText("0");pre3.setText("0");pre4.setText("0");pre5.setText("0");pre6.setText("0");pre7.setText("0");pre8.setText("0");pre9.setText("0");pre10.setText("0");pre11.setText("0");
       beizhu1.setText("");beizhu2.setText("");beizhu3.setText("");beizhu4.setText("");beizhu5.setText("");beizhu6.setText("");beizhu7.setText("");beizhu8.setText("");beizhu9.setText("");beizhu10.setText("");beizhu11.setText("");
    }
          
                 
      //商品属性按钮
                @FXML private void wutang(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "无糖|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "无糖|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "无糖|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "无糖|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "无糖|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "无糖|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "无糖|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "无糖|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "无糖|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "无糖|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "无糖|");    
                       }
                 
    }
                @FXML private void sanfen(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "三分|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "三分|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "三分|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "三分|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "三分|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "三分|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "三分|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "三分|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "三分|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "三分|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "三分|");    
                       }
                 
    }
                @FXML private void wufen(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "五分|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "五分|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "五分|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "五分|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "五分|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "五分|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "五分|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "五分|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "五分|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "五分|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "五分|");    
                       }
                 
    }
                @FXML private void qifen(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "七分|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "七分|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "七分|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "七分|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "七分|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "七分|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "七分|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "七分|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "七分|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "七分|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "七分|");    
                       }
                 
    }
                @FXML private void zhengchang(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "正常|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "正常|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "正常|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "正常|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "正常|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "正常|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "正常|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "正常|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "正常|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "正常|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "正常|");    
                       }
                 
    }
                @FXML private void jiabing(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "加冰|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "加冰|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "加冰|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "加冰|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "加冰|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "加冰|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "加冰|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "加冰|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "加冰|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "加冰|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "加冰|");    
                       }
                 
    }
                @FXML private void shaobing(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "少冰|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "少冰|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "少冰|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "少冰|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "少冰|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "少冰|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "少冰|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "少冰|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "少冰|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "少冰|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "少冰|");    
                       }
                 
    }
                @FXML private void qubing(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "去冰|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "去冰|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "去冰|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "去冰|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "去冰|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "去冰|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "去冰|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "去冰|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "去冰|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "去冰|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "去冰|");    
                       }
                 
    }
                @FXML private void wen(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "温|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "温|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "温|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "温|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "温|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "温|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "温|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "温|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "温|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "温|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "温|");    
                       }
                 
    }
                @FXML private void re(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "热|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "热|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "热|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "热|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "热|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "热|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "热|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "热|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "热|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "热|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "热|");    
                       }
                 
    }
                @FXML private void boba(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "波霸|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "波霸|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "波霸|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "波霸|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "波霸|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "波霸|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "波霸|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "波霸|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "波霸|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "波霸|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "波霸|");    
                       }
                 
    }
                @FXML private void buding(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "布丁|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "布丁|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "布丁|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "布丁|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "布丁|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "布丁|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "布丁|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "布丁|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "布丁|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "布丁|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "布丁|");    
                       }
                 
    }
                @FXML private void hongdou(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "红豆|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "红豆|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "红豆|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "红豆|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "红豆|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "红豆|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "红豆|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "红豆|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "红豆|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "红豆|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "红豆|");    
                       }
                 
    }
                @FXML private void yeguo(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "椰果|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "椰果|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "椰果|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "椰果|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "椰果|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "椰果|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "椰果|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "椰果|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "椰果|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "椰果|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "椰果|");    
                       }
                 
    }
                @FXML private void xiaoyuyuan(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "小芋圆|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "小芋圆|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "小芋圆|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "小芋圆|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "小芋圆|");    
                       }
                 
    }
                @FXML private void qguo(ActionEvent event) {
                       if (id1.getText()!=""  && id2.getText()=="") {
                           String beizhu = beizhu1.getText();
                           beizhu1.setText(beizhu + "Q果|"); 
                       }
                       else  if (id2.getText()!=""  && id3.getText()=="") {
                           String beizhu = beizhu2.getText();
                           beizhu2.setText(beizhu + "Q果|");                                                    
                       }
                        else  if (id3.getText()!=""  && id4.getText()=="") {
                           String beizhu = beizhu3.getText();
                           beizhu3.setText(beizhu + "Q果|");                                                    
                       }
                        else  if (id4.getText()!=""  && id5.getText()=="") {
                           String beizhu = beizhu4.getText();
                           beizhu4.setText(beizhu + "Q果|");    
                       }
                       else  if (id5.getText()!=""  && id6.getText()=="") {
                           String beizhu = beizhu5.getText();
                           beizhu5.setText(beizhu + "Q果|");    
                       }
                       else  if (id6.getText()!=""  && id7.getText()=="") {
                           String beizhu = beizhu6.getText();
                           beizhu6.setText(beizhu + "Q果|");    
                       }
                       else  if (id7.getText()!=""  && id8.getText()=="") {
                           String beizhu = beizhu7.getText();
                           beizhu7.setText(beizhu + "Q果|");    
                       }
                       else  if (id8.getText()!=""  && id9.getText()=="") {
                           String beizhu = beizhu8.getText();
                           beizhu8.setText(beizhu + "Q果|");    
                       }
                       else  if (id9.getText()!=""  && id10.getText()=="") {
                           String beizhu = beizhu9.getText();
                           beizhu9.setText(beizhu + "Q果|");    
                       }
                       else  if (id10.getText()!=""  && id11.getText()=="") {
                           String beizhu = beizhu10.getText();
                           beizhu10.setText(beizhu + "Q果|");    
                       }
                       else  if (id11.getText()!="") {
                           String beizhu = beizhu11.getText();
                           beizhu11.setText(beizhu + "Q果子|");    
                       }
                 
    }
                 
                
                 //付款按钮
                @FXML private void weixin(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="微信付款";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                     System.out.println("------------------------------");
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
                             System.out.println("------------------------------"); 
                            clearall(event);
                            mess1.setText("订单已完成！");
                            
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                @FXML private void zhifubao(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="支付宝付款";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                    System.out.println("------------------------------");
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname1.getText() + "    " +  beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname3.getText() + "    " +  beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname4.getText() + "    " +  beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname6.getText() + "    " +  beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname11.getText() + "    " + beizhu11.getText() );
                            }

                            System.out.println("------------------------------");
                            clearall(event);
                            mess1.setText("订单已完成！");
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                @FXML private void xianjin(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="现金付款";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                   System.out.println("------------------------------"); 
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
            System.out.println("------------------------------"); 
          clearall(event);
                            mess1.setText("订单已完成！");
             
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                @FXML private void dazhong(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="大众点评";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                               System.out.println("------------------------------"); 
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                        System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
            
                     System.out.println("------------------------------"); 
              clearall(event);
                            mess1.setText("订单已完成！");
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                @FXML private void meituan(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="美团";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                       System.out.println("------------------------------"); 
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname10.getText() +  "    " + beizhu10.getText() ); 
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
            
             System.out.println("------------------------------"); 
              clearall(event);
                            mess1.setText("订单已完成！");
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                @FXML private void tuangou(ActionEvent event) {
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,?,?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="团购";
           int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
             ps.setInt(2, opre);
           ps.setDate(3, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                   System.out.println("------------------------------"); 
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
            System.out.println("------------------------------"); 
          clearall(event);
                            mess1.setText("订单已完成！");
             
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
    }
                 
                //赠饮按钮
                @FXML private void free(ActionEvent event) {
                     
                        try {
            Class.forName(sql.NAME);
            sql.conn = (Connection) DriverManager.getConnection(sql.URL, sql.USER, sql.PASS); 
              sql.sql = "insert into shoporder(opayname,opre,opaydate) values (?,'0',?);";  
             PreparedStatement ps = sql.conn.prepareStatement(sql.sql);
             String opayname="赠饮";
        //   int opre =  Integer.parseInt(preall.getText());
              long time = System.currentTimeMillis();
       java.sql.Date date = new java.sql.Date(time);                
             ps.setString(1, opayname);
         //    ps.setInt(2, opre);
           ps.setDate(2, date);
                   ps.executeUpdate();
                   String sql2;
                   int oshopnum=1;
                   
                        System.out.println("------------------------------"); 
                            if (id1.getText() != "") {
                                String shopname = shopname1.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname1.getText() +  "    " + beizhu1.getText() );
                            }
                if (id2.getText() != "") {
                                String shopname = shopname2.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname2.getText() +  "    " + beizhu2.getText() );
                            }
                 if (id3.getText() != "") {
                                String shopname = shopname3.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname3.getText() +  "    " + beizhu3.getText() );
                            }
                  if (id4.getText() != "") {
                                String shopname = shopname4.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname4.getText() +  "    " + beizhu4.getText() );
                            }
                   if (id5.getText() != "") {
                                String shopname = shopname5.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname5.getText() +  "    " + beizhu5.getText() );
                            }
                    if (id6.getText() != "") {
                                String shopname = shopname6.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname6.getText() +  "    " + beizhu6.getText() );
                            }
                     if (id7.getText() != "") {
                                String shopname = shopname7.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname7.getText() +  "    " + beizhu7.getText() );
                            }
                      if (id8.getText() != "") {
                                String shopname = shopname8.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname8.getText() +  "    " + beizhu8.getText() );
                            }
                       if (id9.getText() != "") {
                                String shopname = shopname9.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname9.getText() +  "    " + beizhu9.getText() );
                            }
                        if (id10.getText() != "") {
                                String shopname = shopname10.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname10.getText() +  "    " + beizhu10.getText() );
                            }
                         if (id11.getText() != "") {
                                String shopname = shopname11.getText();
                                sql2 = "insert into shoporderlist(oshopname,oshopnum,oshopdate) values (?,?,?);";
                                 PreparedStatement ps2 = sql.conn.prepareStatement(sql2);
                                 ps2.setString(1, shopname);
                                  ps2.setInt(2, oshopnum);
                                 ps2.setDate(3, date);
                                       ps2.executeUpdate();
                                       System.out.println(shopname11.getText() +  "    " + beizhu11.getText() );
                            }
                 System.out.println("------------------------------"); 
          clearall(event);
                            mess1.setText("订单已完成！");
             
                 
             
        } catch (Exception e) {
             e.printStackTrace();  
        }
             
finally{  
            //最后一定要关闭链接  
            if (sql.conn != null){  
                try {  
                    sql.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                    }  
            }  
            if(sql.rs != null){  
                try {  
                    sql.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
                 
  
                 
                 
    }
                
                
                //菜单功能
                public void exit() {
                 exit.setOnAction((ActionEvent t) -> {
                System.exit(0);
                        });          
                }
                
                
                
                //about菜单
                 public void about() {
                 about.setOnAction((ActionEvent t)  -> {
                aboutClicked();
                        });          
                }
         @FXML    private void aboutClicked(){
        try {
            //一定需要使用try-catch
            //下段实现的内容和Main.java中其实是一样的
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("about.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("About");
            anotherStage.setScene(new Scene(anotherRoot, 600, 400));
            anotherStage.setResizable(false);  
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
                      
    }
                 
         //用户管理菜单
             public void useradmin() {
                 useradmin.setOnAction((ActionEvent t)  -> {
                userlogin();
                        });          
                }    
         @FXML    private void userlogin(){
        try {
            //一定需要使用try-catch
            //下段实现的内容和Main.java中其实是一样的
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("adminlogin.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("用户验证");
            anotherStage.setScene(new Scene(anotherRoot, 600, 400));
            anotherStage.setResizable(false);  
            anotherStage.show();
      
        } catch (Exception e){
            e.printStackTrace();
        }
                      
    }
         
        //库存管理菜单
                      public void kucun() {
                 kucun.setOnAction((ActionEvent t)  -> {
                kucunlogin();
                        });          
                }    
         @FXML    private void kucunlogin(){
        try {
            //一定需要使用try-catch
            //下段实现的内容和Main.java中其实是一样的
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("kucunlogin.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("用户验证");
            anotherStage.setScene(new Scene(anotherRoot, 600, 400));
            anotherStage.setResizable(false);  
            anotherStage.show();
      
        } catch (Exception e){
            e.printStackTrace();
        }
                      
    }
            
             
         //订单查看菜单
          public void dingdan() {
                 dingdan.setOnAction((ActionEvent t)  -> {
                dingdanlogin();
                        });          
                }    
         @FXML    private void dingdanlogin(){
        try {
            //一定需要使用try-catch
            //下段实现的内容和Main.java中其实是一样的
            Parent anotherRoot = FXMLLoader.load(getClass().getResource("dingdanlogin.fxml"));
            Stage anotherStage = new Stage();
            anotherStage.setTitle("用户验证");
            anotherStage.setScene(new Scene(anotherRoot, 600, 400));
            anotherStage.setResizable(false);  
            anotherStage.show();
      
        } catch (Exception e){
            e.printStackTrace();
        }
                      
    }
              
                

        //计算器
         
         //计算按钮
                         @FXML private void jisuan(ActionEvent event) {
                  int  jisuanall= Integer.parseInt(preall.getText());
                  int jisuanzhi = Integer.parseInt(zhi.getText());
                  int jisuanyu = jisuanzhi - jisuanall;
                  zhi.setText(String.valueOf(jisuanyu)); 
    }

         //清空按钮
                         @FXML private void jisuanclear(ActionEvent event) {
                     zhi.setText("0"); 
    }

         //0-9按钮
                   @FXML private void jisuan1(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("1");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "1"); 
                    }              
    }
                   @FXML private void jisuan2(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("2");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "2"); 
                    }              
    }
                   @FXML private void jisuan3(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("3");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "3"); 
                    }              
    }
                   @FXML private void jisuan4(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("4");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "4"); 
                    }              
    }
                   @FXML private void jisuan5(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("5");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "5"); 
                    }              
    }
                   @FXML private void jisuan6(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("6");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "6"); 
                    }              
    }
                   @FXML private void jisuan7(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("7");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "7"); 
                    }              
    }
                   @FXML private void jisuan8(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("8");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "8"); 
                    }              
    }
                   @FXML private void jisuan9(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("9");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "9"); 
                    }              
    }
                   @FXML private void jisuan0(ActionEvent event) {
                    if("0".equals(zhi.getText())){
                        zhi.setText("0");
                    }
                    else {
                         String jisuanzhi = zhi.getText();
                           zhi.setText(jisuanzhi + "0"); 
                    }              
    }
                   
                   


}
               
   
   

   

 

