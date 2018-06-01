package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label outputLabel;
    @FXML
    private Label auxiliaryLabel;
    @FXML
    private Button cancelButton;

    private String operator = "";
    private double initialNum = 0;

    private Model model = new Model();

//    FXMLLoader fourFunction = new FXMLLoader(getClass().getResource("4function.fxml"));
//    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("----.fxml"));


/*        while (!auxiliaryLabel.getText().isEmpty() || !outputLabel.getText().isEmpty()) {
            cancelButton.setText("C");
        }*/

    public void switchScene() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("----.fxml"));


//        Scene scene = .getScene();
//        Window window = scene.getWindow();
//        Stage stage = (Stage) window;


    }


    public void calculations(ActionEvent event) {

        String operatorVal = ((Button) event.getSource()).getText();

        if (!"=".equals(operatorVal)) {
            if (!operator.isEmpty()) {
                operator = operatorVal;
                outputLabel.setText(String.valueOf(model.functions(initialNum, Double.parseDouble(outputLabel.getText()), operator)));
            }
            operator = operatorVal;
            initialNum = Double.parseDouble(outputLabel.getText());
            auxiliaryLabel.setText(outputLabel.getText() + " " + operator);
            outputLabel.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
                outputLabel.setText(String.valueOf(model.functions(initialNum, Double.parseDouble(outputLabel.getText()), operator)));
                operator = "";
        }
    }

    @FXML
    public void enterNumber(ActionEvent event) {

        final Button button = (Button) event.getSource();
        final String endValue = button.getText();

        outputLabel.setText(outputLabel.getText() + endValue);

    }

    public void clear() throws InterruptedException{

        // clear();
//        outputLabel.setText("CLEARED");
//
//
//        Thread.sleep(3000);

        outputLabel.setText("");
        auxiliaryLabel.setText("");

    }

    public void delete() {
        outputLabel.setText(outputLabel.getText().substring(0, outputLabel.getText().length()-1));

    }


}
