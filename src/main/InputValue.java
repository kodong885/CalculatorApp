package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValue {

    public static Integer getNum(int sequence) {

        try {
            // I divided it into two cases, the one of these cases is setting "num1",
            // the other one is setting num2 in the main method.
            if (sequence == 1) {
                System.out.println("Enter num1 >>");
            } else if (sequence == 2) {
                System.out.println("Enter num2 >>");
            } else {
                System.out.println("Error");
            }

            Integer num;
            num = ScannerClass.sc.nextInt();
            ScannerClass.sc.nextLine();
            ProcessMessage.processMessage += num; // 형변환..? ( 정수 → 문자열) 자동으로 해주는 듯..?
            return num;

        } catch (InputMismatchException e) {

            System.out.println("Enter Integer again!");
            ScannerClass.sc.nextLine();

            if (sequence == 1) {
                return getNum(1);

            } else if (sequence == 2) {
                return getNum(2);

            } else {
                return null;
            }
        }
    }

    public static String getMethod() {
        System.out.println("Enter Method >> ");
        System.out.println("Addition / Subtraction / Multiplication / Division");

        String method;

        try{
            method = ScannerClass.sc.nextLine();

            if (method.equals("Addition") || method.equals("Subtraction") || method.equals("Multiplication") || method.equals("Division")) {
                switch (method) {
                    case "Addition" :
                        ProcessMessage.processMessage += " + ";
                        break;

                    case "Subtraction" :
                        ProcessMessage.processMessage += " - ";
                        break;

                    case "Multiplication" :
                        ProcessMessage.processMessage += " x ";
                        break;

                    case "Division" :
                        ProcessMessage.processMessage += " / ";
                        break;
                    default:
                        System.out.println("You didn't any right method ! ");
                }

                return method;

            } else if (method.equals("stop") || method.equals("Stop")) {
                // if user enter "stop", this program will stop
                CalculatorApplication.isRunning = false;
                return null;

            } else {
                System.out.println("Enter one of 'Addition', 'Subtraction', 'Multiplication', 'Division'");
                return getMethod();

            }

        } catch (InputMismatchException e) {
            // if user didn't enter proper value, Integer or String, method 'getMethod()' will call again.
            System.out.println("Enter Method String Format ! ");
            return getMethod();

        }
    }
}


class ScannerClass {

    static Scanner sc = new Scanner(System.in);


}

// 자바에서 필드 선언 시, 실행문 사용 불가능;