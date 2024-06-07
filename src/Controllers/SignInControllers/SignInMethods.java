

package Controllers.SignInControllers;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SignInMethods {

    public enum Regex {
        emailRegex("^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$"),
        usernameRegex("[a-zA-Z]{1,1}[a-zA-Z0-9_]{2,12}"),
        passwordRegex("^[a-zA-Z0-9]{5,15}$"),
        nameRegex("^[a-zA-Z ]{2,20}$"),
        phoneNumberRegex("^[0-9]{4,10}$");

        public String regexStr;

        Regex(String regex) {
            this.regexStr = regex;
        }
    }

    public enum ErrorMessage {
        emailErrorMessage("at least a letter, digit, -/_/. and @yyy.zzz"),
        usernameErrorMessage("start with letter contain letter, digit, _"),
        passwordErrorMessage("letter, digit length between 6 to 15"),
        nameErrorMessage("Just letters and space"),
        phoneNumberErrorMessage("Just numbers between 4 to 10");

        public String errorMessage;

        ErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }
    }

    public boolean isValid(String input, String regex){
        return input.matches(regex);
    }

    public void check(TextField textField, Label label, Regex reg, ErrorMessage errMsg) {
        String input = textField.getText();
        String regex = reg.regexStr;
        if(!isValid(input, regex)){
            toError(label, errMsg);
        } else if (isValid(input, regex)) {
            toCorrect(label);
        }
    }

    // public boolean isEmailValid(String input){
    //     return isValid(input, "^[a-zA-Z]{1,1}[a-zA-Z0-9-_.]{4,63}@[a-zA-Z]+\\.[a-zA-z]+$");
    // }

    // public boolean isUsernameValid(String input){
    //     return isValid(input, "[a-zA-Z]{1,1}[a-zA-Z0-9_]{2,12}");
    // }

    // public boolean isPasswordValid(String input){
    //     return isValid(input, "^[a-zA-Z0-9]{5,15}$");
    // }

    // public boolean isNameValid(String input){
    //     return isValid(input, "^[a-zA-Z ]{2,20}$");
    // }

    // public boolean isPhoneNumberValid(String input){
    //     return isValid(input, "^[0-9]{4,10}$");
    // }
    //-------------------------------------------------
    public void toError(Label label, ErrorMessage errMsg) {
        Color red = Color.web("#FF6347");
        label.setTextFill(red);

        label.setText(errMsg.errorMessage);
    }

    public void toCorrect(Label label) {
        Color green = Color.web("#7CFC00");
        label.setTextFill(green);

        label.setText("Valid Input");
    }
}
