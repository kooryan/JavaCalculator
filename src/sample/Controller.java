package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label outputLabel;

    @FXML
    private Label auxiliaryLabel;

    private String operator = "";

    private double initialNum = 0;

    private Model model = new Model();

    public void calculations(ActionEvent event) {

        String operatorVal = ((Button) event.getSource()).getText();


        if (!"=".equals(operatorVal)) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = operatorVal;
            initialNum = Double.parseDouble(outputLabel.getText());
            outputLabel.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }

            outputLabel.setText(String.valueOf(model.functions(initialNum, Double.parseDouble(outputLabel.getText()),operator)));
            operator = "";
        }
    }


    @FXML
    public void enterNumber(ActionEvent event) {

        final Button button = (Button) event.getSource();
        final String endValue = button.getText();

        outputLabel.setText(outputLabel.getText() + endValue);

    }

    public void clear() {
        // clear();
        outputLabel.setText("");

    }


    public void delete() {
        outputLabel.setText( outputLabel.getText().substring(0, outputLabel.getText().length()-1));

    }


}
