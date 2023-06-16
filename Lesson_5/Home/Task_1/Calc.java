package Lesson_5.Home.Task_1;

public class Calc {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        presenter.performCalculation();
    }
}
