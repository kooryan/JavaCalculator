package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {

    @FXML
    public Label outputLabel;

    @FXML
    public Button b1;


    ArrayList<Double> calcList = new ArrayList<Double>();

    public void operations() {

        // switch function here
    }

// A list does not work

    public void addition() {
        int sum = 0;
        for (double i : calcList) {
            sum += i;
        }

        String result = Integer.toString(sum);

        outputLabel.setText(result);
    }

    public void subtraction() {
        int sum = 0;
        for (double i : calcList) {
            sum -= i;
        }
        String result = Integer.toString(sum);

        outputLabel.setText(result);
    }



// inefficient change into one method and add to array

    public void enterNumber(java.awt.event.ActionEvent event) {

        // add switch statement

    }

    public void addNumber0 () {

    }
    public void addNumber1 () {
     calcList.add(1.0);
     String output = outputLabel.getText() + b1.getText();
     outputLabel.setText(output);
    }

    public void addNumber2 () {
        calcList.add(2.0);
    }
    public void addNumber3 () {
        calcList.add(3.0);
    }
    public void addNumber4 () {
        calcList.add(4.0);
    }
    public void addNumber5 () {
        calcList.add(5.0);
    }
    public void addNumber6 () {
        calcList.add(6.0);
    }
    public void addNumber7 () {
        calcList.add(7.0);
    }
    public void addNumber8 () {
        calcList.add(8.0);
    }
    public void addNumber9 () {
        calcList.add(9.0);
    }

    public void clear () {
        calcList.clear();
        outputLabel.setText("0");

    }


}
