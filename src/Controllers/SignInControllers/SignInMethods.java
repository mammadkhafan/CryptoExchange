package Controllers.SignInControllers;


import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class SignInMethods {

    public boolean isValid(String input, String regex){
        return input.matches(regex);
    }

    protected final String emailRegex = "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$";
    protected final String usernameRegex = "[a-zA-Z]{1,1}[a-zA-Z0-9_]{2,12}";
    protected final String passwordRegex = "^[a-zA-Z0-9]{5,15}$";
    protected final String nameRegex = "^[a-zA-Z ]{2,20}$";
    protected final String phoneNumberRegex = "^[0-9]{4,10}$";

    public boolean isEmailValid(String input){
        return isValid(input, "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$");
    }

    public boolean isUsernameValid(String input){
        return isValid(input, "[a-zA-Z]{1,1}[a-zA-Z0-9_]{2,12}");
    }

    public boolean isPasswordValid(String input){
        return isValid(input, "^[a-zA-Z0-9]{5,15}$");
    }

    public boolean isNameValid(String input){
        return isValid(input, "^[a-zA-Z ]{2,20}$");
    }

    public boolean isPhoneNumberValid(String input){
        return isValid(input, "^[0-9]{4,10}$");
    }
    //-------------------------------------------------
    public void fillToError(Label label) {
        Color red = Color.web("#FF6347");
        label.setTextFill(red);
    }

    public void toCorrect(Label label) {
        Color green = Color.web("#7CFC00");
        label.setTextFill(green);

        label.setText("Valid Input");
    }
}
