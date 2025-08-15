package main;

public class CalculatorApplication {

    public static Boolean isRunning = true;

    public static void main(String[] args) {

        ProcessMessage pm = new ProcessMessage();
        pm.sayInitialMessage();

        Integer justWhileNum = 0;

        while (isRunning) {
            justWhileNum += 1;

            if (justWhileNum.equals(1)) {
                // get 'num1', 'method', 'num2';
                Integer num1;
                num1 = InputValue.getNum(1);
                ProcessMessage.printProcessMessage();
                String method;
                method = InputValue.getMethod();
                ProcessMessage.printProcessMessage();
                Integer num2;
                num2 = InputValue.getNum(2);
                ProcessMessage.printProcessMessage();

                // calculate these values
                Calculator.calculate(num1, num2, method);

            } else {
                // method / num2
                String method;
                method = InputValue.getMethod();

                if (CalculatorApplication.isRunning == false) {
                    ProcessMessage.printResult();
                    break;

                } else {
                    ProcessMessage.printProcessMessage();
                    Integer num2;
                    num2 = InputValue.getNum(2);
                    ProcessMessage.printProcessMessage();
                }
            }
        }
    }
}
