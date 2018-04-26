package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {

    @FXML
    private Label outputLabel;


    ArrayList<Double> calcList = new ArrayList<Double>();

// A list does not work

//    public void addition() {
//        int sum = 0;
//        for (double i : calcList) {
//            sum += i;
//        }
//
//        String result = Integer.toString(sum);
//
//        outputLabel.setText(result);
//    }

//    public void subtraction() {
//        int sum = 0;
//        for (double i : calcList) {
//            sum -= i;
//        }
//        String result = Integer.toString(sum);
//
//        outputLabel.setText(result);
//    }

    public void functions() {

    }

    @FXML
    public void enterNumber(ActionEvent event) {

        final Button button = (Button) event.getSource();
        final String endValue = button.getText();

        outputLabel.setText(outputLabel.getText() + endValue);

    }


    public void addNumber0 () {

    }

    public void addNumber1 () {
     calcList.add(1.0);
     String output = outputLabel.getText();
     outputLabel.setText(output);
    }


    public void clear () {
        calcList.clear();
        outputLabel.setText("");

    }


}
