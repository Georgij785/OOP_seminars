package Lesson_5.Class_work.Task_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorView {

    Scanner scan = new Scanner(System.in);


//    public String getOperate() {
//        System.out.print("Enter an operator (+, -, *, /): ");
//        return scan.nextLine();
//    }

    public char getInputOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        char c = scan.next().charAt(0);
        switch (c) {
            case '+':
                return c;
            case '*':
                return c;
            case '/':
                return c;
            case '-':
                return c;
            default:
                System.out.println("Invalid operator, try again");
                return getInputOperator();
        }
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    void except() {
        System.out.println("Введено не число\nвведите число");

    }

    public double getDouble() {

        System.out.print("Enter a number 1: ");


        try {
            String n = scan.nextLine();
            double m = Double.parseDouble(n);
            return m;
        } catch (Exception err) {

            except();
            return getDouble();
        }
    }

    public void ytr(double x) {
        System.out.println(x);
    }

    public double getDouble_2() {

        System.out.print("Enter a number 2:");

        try {
            String n = scan.nextLine();
            double m = Double.parseDouble(n);
            return m;
        } catch (Exception err) {
            except();
            return getDouble_2();
        }
    }
}
