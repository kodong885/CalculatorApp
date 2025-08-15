package main;

public class Calculator {

    public static void calculate(Integer num1, Integer num2, String method) {

        switch (method) {
            case "Addition" :
                ResultCalculated.result = num1 + num2;
                break;

            case "Subtraction" :
                ResultCalculated.result = num1 - num2;
                break;

            case "Multiplication" :
                ResultCalculated.result = num1 * num2;
                break;

            case "Division" :
                ResultCalculated.result = num1 % num2;
                break;
            default:
                System.out.println("You didn't any right method ! ");

        }
    }
}
