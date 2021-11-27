package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private TextField myTextField2;
    @FXML
    private Button myButton;

    int firstNumber;
    int secondNumber;

    public void submit(ActionEvent event) {
        try {
            firstNumber = Integer.parseInt(myTextField.getText());
            secondNumber = Integer.parseInt(myTextField2.getText());
            int sum=firstNumber+secondNumber;
            myLabel.setText("Your answer is "+sum);

        }
        catch(NumberFormatException e){
            myLabel.setText("Enter number.");
        }
        catch(Exception e){
            myLabel.setText("Error");
        }
    }
}
