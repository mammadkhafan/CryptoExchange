package Controllers.SignInControllers;


import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;

public class SignUpController extends SignInMethods{
    @FXML
    private Label firstNameMessage, lastNameMessage, usernameMessage, emailMessage, phoneNumberMessage, passwordMessage, repeatPasswordMessage, captchaMessage, profileImageName;

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

    @FXML
    private void checkFirstName(KeyEvent event) {
        // Implement your logic here
        String input = firstNameMessage.getText();
        String regex = "^[a-zA-Z ]{2,12}$";
        if(!isValid(input, regex)){
                usernameMessage.setText("Error");
        }
    }

    @FXML
    private void checkUsername(KeyEvent event) {
        // Implement your logic here
        String input = firstNameMessage.getText();
        String regex = "^[a-zA-Z ]{2,12}$";
        if(!isValid(input, regex)){
                usernameMessage.setText("Error");
        }
    }

    @FXML
    private void checkPhoneNumber(KeyEvent event) {
        // Implement your logic here
        
    }

    @FXML
    private void checkLastName(KeyEvent event) {
        // Implement your logic here
    }

    @FXML
    private void checkEmail(KeyEvent event) {
        // Implement your logic here
    }

    @FXML
    private void checkPassword(KeyEvent event) {
        // Implement your logic here
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
    private void afterBack(MouseEvent event) {
        // Implement your logic here
    }
}
