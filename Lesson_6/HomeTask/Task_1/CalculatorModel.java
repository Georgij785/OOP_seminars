package Lesson_6.HomeTask.Task_1;

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
class ExpandedCalculatorModel extends CalculatorModel{
    /*мы, без изменения основного класса расширили его функционал
(Принцип открытости/закрытости (Open Closed Principle))

так же этот дочерний класс расширяет базовый и он может оиспользоватся вместо базового , я использовал так же
Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
*/

    public void power(double number){
        setResult(Math.pow(getResult(),number));
    }
    public void sqrt(){
        setResult(Math.sqrt(getResult()));
    }

}