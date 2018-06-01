package sample;

public class Model {

    public double functions(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "×" :
                return num1 * num2;
            case "÷" :
                if (num2 == 0) {
                    System.err.println("System Error: Number is undefined");
//                    return (Integer) null;  -> return error or something
                    return 420;
                }
                return num1 / num2;
        }

        return 0;
    }
}
