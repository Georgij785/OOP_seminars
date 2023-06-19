package Lesson_6.HomeTask.Task_1;

import java.util.Scanner;

public class CalculatorView {
    Scanner scan = new Scanner(System.in);

    public String getInputOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        String c = scan.next();
        switch (c) {

            case "+":
                return c;
            case "*":
                return c;
            case "/":
                return c;
            case "-":
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
            System.out.println(m);
            return m;
        } catch (Exception err) {

            except();
            return getDouble();
        }
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

class ExpandedCalculatorView extends CalculatorView {
    /*мы, без изменения основного класса расширили его функционал
(Принцип открытости/закрытости (Open Closed Principle))

также я написал GetInt как отдельный метод, чтобы метод geyDouble не проверял отдельно оператор и и это я ипользовал
Принцип единственной ответственности (Single Responsibility Principle)

так же этот дочерний класс расширяет базовый и он может оиспользоватся вместо базового , я использовал так же
Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
*/
    Scanner scan = new Scanner(System.in);

    public String getInputOperator_1() {
        System.out.print("Enter an operator (+, -, *, /): ");
        String c = scan.nextLine();
        switch (c) {
            case "+":
                return c;
            case "*":
                return c;
            case "/":
                return c;
            case "-":
                return c;
            case "sqrt":
                return c;
            case "pow":
                return c;
            default:
                System.out.println("Invalid operator, try again");
                return getInputOperator_1();
        }
    }

    public double getInt() {
        System.out.print("Enter a number 1: ");
        try {
            String n = scan.nextLine();
            int m = Integer.parseInt(n);
            System.out.println(m);
            return m;
        } catch (Exception err) {
            except();
            return getInt();
        }
    }
}