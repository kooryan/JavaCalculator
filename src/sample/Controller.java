package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {

    @FXML
    public Label finalLabel;


    ArrayList<Double> calcList = new ArrayList<Double>();


    public void numbersAddition () {
        int sum = 0;
        for (double i : calcList) {
            sum += i;
        }

        finalLabel.textProperty().bind(new SimpleIntegerProperty(sum).asString());
    }


// inefficient change into one method and add to array

    public void addNumber0 () {
        calcList.add(0.0);
    }

    public void addNumber1 () {
        calcList.add(1.0);
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
    }


}
