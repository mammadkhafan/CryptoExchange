package Controllers.SignInControllers;

import java.io.IOException;
import java.util.Random;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class SignUpController extends SignInMethods{
    @FXML
    private Label firstNameMessage, lastNameMessage, usernameMessage, emailMessage, phoneNumberMessage, passwordMessage, repeatPasswordMessage, captchaMessage, profileImageName, captchaImage;

    @FXML
    private TextField firstNameTextField, lastNameTextField, usernameTextField, emailTextField, phoneNumberTextField;

    @FXML
    private PasswordField passwordPasswordField, repeatPasswordPasswordField, captchaCodePasswordField;

    @FXML
    private Button pickFileButton, createMyAccountButton;

    @FXML
    private FontAwesomeIcon backIcon;

    @FXML
    private ImageView captchaImageView;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void checkFirstName(KeyEvent event) {
        check(firstNameTextField, firstNameMessage, Regex.nameRegex, ErrorMessage.nameErrorMessage);
    }

    @FXML
    private void checkUsername(KeyEvent event) {
        check(usernameTextField, usernameMessage, Regex.usernameRegex, ErrorMessage.usernameErrorMessage);
    }

    @FXML
    private void checkPhoneNumber(KeyEvent event) {
        check(phoneNumberTextField, phoneNumberMessage, Regex.phoneNumberRegex, ErrorMessage.phoneNumberErrorMessage);
        
    }

    @FXML
    private void checkLastName(KeyEvent event) {
        check(lastNameTextField, lastNameMessage, Regex.nameRegex, ErrorMessage.nameErrorMessage);
    }

    @FXML
    private void checkEmail(KeyEvent event) {
        check(emailTextField, emailMessage, Regex.emailRegex, ErrorMessage.emailErrorMessage);    
    }

    @FXML
    private void checkPassword(KeyEvent event) {
        check(passwordPasswordField, passwordMessage, Regex.passwordRegex, ErrorMessage.passwordErrorMessage);
    }

    @FXML
    private void checkCaptchaCode(ActionEvent event) {
        // Implement your logic here
    }

    @FXML
    private void checkRepeatPassword(KeyEvent event) {
        // Implement your logic here
    }

    @FXML
    private void afterPickFile(ActionEvent event) {
        // Implement your logic here
    }

    @FXML
    private void afterCreateMyAccount(ActionEvent event) {
        
        // Implement your logic here
    }

    @FXML
    private void afterBack(MouseEvent event) throws IOException {
        // Implement your logic here
        root = FXMLLoader.load(getClass().getResource("../../FXMLFiles/LoginPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        
        stage.show();

    }
    
    
    

    

}
