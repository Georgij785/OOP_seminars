package Lesson_5.Class_work.Task_1;

import java.text.DecimalFormat;

public class Calc {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);
        presenter.performCalculation();
    }
}
