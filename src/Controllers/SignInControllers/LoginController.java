package Controllers.SignInControllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class LoginController extends SignInMethods{
    @FXML
    private Button  
            loginButton,
            signUpButton,
            forgetPasswordButton;
    @FXML
    private PasswordField  
            passwordPasswordField,
            captchaCodePasswordField;
    @FXML
    private Label   
            usernameMessage,
            passwordMessage,
            captchaCodeMessage;

    @FXML
    private TextField usernameTextField; 

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void checkUsername(KeyEvent event){
        check(usernameTextField, usernameMessage, Regex.usernameRegex, ErrorMessage.usernameErrorMessage);
    }

    public void checkPassword(KeyEvent event){
        check(passwordPasswordField, passwordMessage,Regex.passwordRegex, ErrorMessage.passwordErrorMessage);
    }

    public void afterLogin(ActionEvent event){
        System.out.println("change scene to user pannl");
    }

    public void afterSignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../../FXMLFiles/SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void afterForgetPassword(ActionEvent event){

    }
    
                        
}

