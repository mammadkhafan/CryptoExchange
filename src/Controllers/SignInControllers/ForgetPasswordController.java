package Controllers.SignInControllers;


import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ForgetPasswordController extends SignInMethods{
    @FXML
    private Label 
            emailMessage, 
            codeMessage, 
            newPasswordMessage, 
            repeatPasswordMessage;

    @FXML
    private TextField emailTextField;
    @FXML
    private PasswordField 
            codePasswordField, 
            newPasswordPasswordField, 
            repeatPasswordPasswordField;
    @FXML 
    private Button submitButton, loginButton;
    
    @FXML
    private FontAwesomeIcon backIcon;


    public void checkEmail() {
        check(emailTextField, emailMessage, Regex.emailRegex, ErrorMessage.emailErrorMessage);
    }

    public void checkCode() {

    }

    public void checkNewPassword() {
        check(newPasswordPasswordField, newPasswordMessage,Regex.passwordRegex, ErrorMessage.passwordErrorMessage);
    }

    public void checkRepeatPassword() {
        check(repeatPasswordPasswordField, repeatPasswordMessage, Regex.passwordRegex, ErrorMessage.passwordErrorMessage);
    }

    public void afterSubmit() {

    }

    public void afterLogin() {
        
    }

    public void afterBack(MouseEvent event) {
        System.out.println("back");
    }
}
