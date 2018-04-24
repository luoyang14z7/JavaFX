package fxmltest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


/**
 *
 * @author itwang
 */
public class LoginController implements Initializable {
    @FXML private TextField account;
    @FXML private PasswordField password;
     private FXMLTest application;
  //   String ac = account.getText();
    
    
    public void setApp(FXMLTest application){
        this.application = application;
    }
    @FXML
    public void LOGIN_M(ActionEvent event) {
        
        application.userlogin(account.getText(), password.getText());
       
  
        
    }
    
    @FXML
    private void CLEAR_M(ActionEvent event) {
        account.setText(null);
        password.setText(null);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
               

    }    
}
