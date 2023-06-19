package Lesson_6.HomeTask.Task_1;

/*
* Весь этот проект это пример
* Принципа единственной ответственности (Single Responsibility Principle)
* т.к. калькулятор можно написать и в один класс, но мы разделяем его на View для общения с пользователем и
* модель, чтобы написать основные функции
*  presenter, чтобы управлять калькулятором
*
* если комментарии не видно, то они внутри свёрнутых улучшенных классах
*  */
public class Calc {
    public static void main(String[] args) {
        ExpandedCalculatorView view = new ExpandedCalculatorView();
        ExpandedCalculatorModel model = new ExpandedCalculatorModel();
        ExpandedCalculatorPresenter presenter = new ExpandedCalculatorPresenter(view, model);
        presenter.performCalculation();
    }
}
