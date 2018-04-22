package fxmltest;

import check.Check;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javax.security.auth.login.AccountException;
import javafx.scene.control.MenuItem;





/**
 *
 * @author itwang
 */
public class FXMLTest extends Application {
      
 //    String ac="123";
   
     
    private Stage stage;
    private final double MINIMUM_WINDOW_WIDTH = 400.0;
    private final double MINIMUM_WINDOW_HEIGHT = 250.0;
    

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("点单收银系统");
        stage.setMinWidth(MINIMUM_WINDOW_WIDTH);
        stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);
        gotologin();
             
        stage.show();

        
    }
    public void gotologin(){
      try {
            LoginController login = (LoginController) replaceSceneContent("FXML_LOGIN.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotomain(){
     try {
            MainController main = (MainController) replaceSceneContentman("FXML_MAIN.fxml");
                        
            main.setApp(this);
            
        } catch (Exception ex) {
            Logger.getLogger(FXMLTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void userlogin(String account,String password){
        
      
    if(Check.checkreturn(account,password)){
       

        t_alert_informationDialog("登陆成功","欢迎登陆:" + account);
  
         gotomain();
         

    } 
   
    else {
          f_alert_informationDialog("登录失败！", "您的用户名或密码错误，请检查后重新登录！");
    }
    


    }
    public void useroutmain(){
      gotologin();
    }
   public Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = FXMLTest.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(FXMLTest.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
        Scene scene = new Scene(page, 600, 400);
        stage.setScene(scene);
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
      private Initializable replaceSceneContentman (String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = FXMLTest.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(FXMLTest.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        } 
       Scene scene = new Scene(page, 1400, 900);
       stage.setX(260);
       stage.setY(30);
       stage.setScene(scene);
               stage.setResizable(false);  
       stage.sizeToScene();
   //     stage.setMaximized(true);   

        return (Initializable) loader.getController();
    }
    
    public static void main(String[] args) {
        launch(args);
         System.exit(0);
    }

 public void t_alert_informationDialog(String p_header, String p_message){
        Alert _alert = new Alert(Alert.AlertType.INFORMATION);
        _alert.setTitle("信息");
        _alert.setHeaderText(p_header);
        _alert.setContentText(p_message);
        _alert.initOwner(stage);
        _alert.show();
    }
public void f_alert_informationDialog(String p_header, String p_message){
        Alert _alert = new Alert(Alert.AlertType.INFORMATION);
        _alert.setTitle("信息");
        _alert.setHeaderText(p_header);
        _alert.setContentText(p_message);
        _alert.initOwner(stage);
        _alert.show();
        gotologin();
    }
}
