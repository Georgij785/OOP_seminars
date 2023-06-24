import CalculatorPresenter
import logging

class ExpandedCalculatorPresenter(CalculatorPresenter):
    def __init__(self, model_1, view_1):
        self.model = model_1
        self.view = view_1

    # мы, без изменения основного класса расширили его функционал
    # (Принцип открытости/закрытости (Open Closed Principle))
    #
    # так же этот дочерний класс расширяет базовый , я использовал так же
    # Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)

    def performCalculation(self):
        number = self.view.getDouble()
        operator = self.view.getInputOperator_1()

        self.model.setResult(number);
        number_2 = 0
        logging.basicConfig(level=logging.INFO, filename="calc_log_2.log", filemode="w")

        logger = logging.getLogger("log_2")
        if operator == "+":
            number_2 = self.view.getDouble_2()
            self.model.add(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif operator == "-":
            number_2 = self.view.getDouble_2()
            self.model.minus(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif operator == "*":
            number_2 = self.view.getDouble_2()
            self.model.mult(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif operator == "/":
            number_2 = self.view.getDouble_2();
            self.model.division(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif operator == "sqrt":
            self.model.sqrt()
            logger.info('"квадратный корень из числа {0}  = {1}'.format(number, self.model.getResult()))

        elif operator == "pow":
            number_2 = self.view.getInt()
            self.model.power(number_2)
            logging.DEBUG(str(number) + "в степени " + str(number_2) + "=" + str(self.model.getResult()))
            logger.info(' {0} в степени {1} = {2}'.format(number, number_2, self.model.getResult()))

        self.view.displayResult(self.model.getResult())