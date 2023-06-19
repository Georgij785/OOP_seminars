package Lesson_6.HomeTask.Task_1;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public CalculatorPresenter() {
        return;
    }

    public void performCalculation() {
        double number = view.getDouble();
        String operator = view.getInputOperator();
        view.scan.nextLine();//строка, без которой, почему-то второй getDouble сразу закрывает скан, попадает в кетч и только после этогьо нормально захватывает
        double number_2 = view.getDouble_2();
        model.setResult(number);

        switch (operator) {
            case "+":
                model.add(number_2);
                break;
            case "-":
                model.minus(number_2);
                break;
            case "*":
                model.mult(number_2);
                break;
            case "/":
                model.division(number_2);
                break;


        }

        view.displayResult(model.getResult());

    }
}

class ExpandedCalculatorPresenter extends CalculatorPresenter {
    /*мы, без изменения основного класса расширили его функционал
(Принцип открытости/закрытости (Open Closed Principle))

так же этот дочерний класс расширяет базовый , я использовал так же
Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
*/
    private ExpandedCalculatorView view_1;
    private ExpandedCalculatorModel model_1;

    public ExpandedCalculatorPresenter(ExpandedCalculatorView view, ExpandedCalculatorModel model) {
        this.view_1 = view;
        this.model_1 = model;
    }

    @Override
    public void performCalculation() {
        double number = view_1.getDouble();
        String operator = view_1.getInputOperator_1();
        view_1.scan.nextLine();//строка, без которой, почему-то второй getDouble сразу закрывает скан, попадает в кетч и только после этогьо нормально захватывает

        model_1.setResult(number);
        double number_2 = 0;
        switch (operator) {
            case "+":
                number_2 = view_1.getDouble_2();
                model_1.add(number_2);
                break;
            case "-":
                number_2 = view_1.getDouble_2();
                model_1.minus(number_2);
                break;
            case "*":
                number_2 = view_1.getDouble_2();
                model_1.mult(number_2);
                break;
            case "/":
                number_2 = view_1.getDouble_2();
                model_1.division(number_2);
                break;
            case "sqrt":

                model_1.sqrt();
                break;
            case "pow":
                number_2 = view_1.getInt();
                model_1.power(number_2);


        }

        view_1.displayResult(model_1.getResult());

    }
}