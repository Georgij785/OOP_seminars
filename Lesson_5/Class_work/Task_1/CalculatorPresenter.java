package Lesson_5.Class_work.Task_1;

public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double number = view.getDouble();
        char operator = view.getInputOperator();
        view.scan.nextLine();//строка, без которой, почему-то второй getDouble сразу закрывает скан, попадает в кетч и только после этогьо нормально захватывает
        double number_2 = view.getDouble_2();
        model.setResult(number);

        switch (operator) {
            case '+':
                model.add(number_2);
                break;
            case '-':
                model.minus(number_2);
                break;
            case '*':
                model.mult(number_2);
                break;
            case '/':
                model.division(number_2);
                break;


        }

        view.displayResult(model.getResult());

    }
}