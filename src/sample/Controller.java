package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class Controller {
    public Button button;
    public Label label;
    public PasswordField password;
    private String correctPassword = "ton";

    public void buttonClicked(ActionEvent actionEvent) {

        if (password.getText().equals(correctPassword)) {
            label.setText("CORRECTOMUNDO");
        } else {
            label.setText("WRONG PASSWORD");
        }

    }
}
