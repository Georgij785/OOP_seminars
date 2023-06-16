package Lesson_5.Class_work.Task_1;

public class CalculatorModel {
    private double result;

    public void add(double number) {
        result += number;
    }

    public void minus(double number) {
        result -= number;
    }

    public void division(double number) {
        CalculatorView localNumber = new CalculatorView();
        while (number == 0) {
            System.out.println("Cannot divide by zero, please enter another number");
            number = localNumber.getDouble_2();
        }
        result /= number;
    }

    public void mult(double number) {
        result *= number;
    }


    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
