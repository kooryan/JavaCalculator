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
    @FXML
    private Button cancelButton;

    private String operator = "";
    private double initialNum = 0;

    private Model model = new Model();


    // switch to scene 2


/*        while (!auxiliaryLabel.getText().isEmpty() || !outputLabel.getText().isEmpty()) {
            cancelButton.setText("C");
        }*/

/** resize text according to the amount of text in the label */

//    public void initialize() {
//        Double fontSize = outputLabel.getFont().getSize();
//        String clippedText = Utils.computeClippedText( outputLabel.getFont(), outputLabel.getText(), outputLabel.getWidth(), outputLabel.getTextOverrun(), outputLabel.getEllipsisString() );
//        Font newFont = outputLabel.getFont();
//
//
//        outputLabel.textProperty().addListener((observable, oldValue, newValue) -> {
//            System.out.println( "fontSize = " + fontSize + ", clippedText = " + clippedText );
//            fontSize = fontSize - 0.05;
//            newFont = Font.font( outputLabel.getFont().getFamily(), fontSize );
//            clippedText = Utils.computeClippedText( newFont, outputLabel.getText(), outputLabel.getWidth(), outputLabel.getTextOverrun(), outputLabel.getEllipsisString() );
//        });
//        outputLabel.setFont( newFont );
//    }


    public void calculations(ActionEvent event) {

        String operatorVal = ((Button) event.getSource()).getText();

//        Button allButtons = (Button) event.getSource();

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

            //test : shorten later
            auxiliaryLabel.setText(auxiliaryLabel.getText() + " " + outputLabel.getText() + " = " + String.valueOf(model.functions(initialNum, Double.parseDouble(outputLabel.getText()), operator)) + "  ");
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

    public void clear() {
        outputLabel.setText("");
        auxiliaryLabel.setText("");

    }

    public void delete() {
        if (!"".equals(outputLabel.getText())) {
            outputLabel.setText(outputLabel.getText().substring(0, outputLabel.getText().length() - 1));
        } else {

        }
    }

    public void plus_negative() {
        if ("".equals(outputLabel.getText())) {

        } else {
            outputLabel.setText("-" + outputLabel.getText());
        }
    }
}
