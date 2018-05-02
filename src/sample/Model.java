package sample;

public class Model {

    public double functions(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "x" :
                if (num1 == 0 || num2 ==0) {
                    return 0;
                }
                return num1 * num2;
            case "÷" :
                if (num1 == 0) {
                    return 0;
                } else if (num2 == 0) {
                    System.err.println("Undefined");
                }
                return num1 / num2;
        }

        return 0;
    }
}
