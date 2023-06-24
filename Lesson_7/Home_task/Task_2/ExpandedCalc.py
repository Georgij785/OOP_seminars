
import CalculatorModel
import CalculatorPresenter
import math
import logging

class CalculatorView:

    def getInputOperator(self):
        print("Enter an operator (+, -, *, /): ")
        c = input()

        if c == "+" or c == "-" or c == "/" or c == "*" or c=="stop":
            return c
        print("Invalid operator, try again");
        return self.getInputOperator()

    def displayResult(self, result):
        print("Result: " + str(result))

    def except_err(self):
        print("Введено не число\nвведите число");

    def getDouble(self):
        print("Enter a number 1: ");
        try:
            n = input()
            m = int(n)
            return m
        except (Exception):
            self.except_err()
            return self.getDouble()

    def getDouble_2(self):

        print("Enter a number 2:");

        try:
            n = input()
            m = int(n)
            return m
        except (Exception):
            self.except_err()
            return self.getDouble()
class CalculatorModel:
    def __init__(self):
        self.result = 0

    def add(self, number):
        self.result += number

    def minus(self, number):
        print(number)
        a = self.result - number
        self.result = a

    def division(self, number):
        localNumber = CalculatorView()
        while number == 0:
            print("Cannot divide by zero, please enter another number")
            number = localNumber.getDouble_2()
        self.result /= number

    def mult(self, number):
        self.result *= number

    def getResult(self):
        return self.result

    def setResult(self, result):
        self.result = result
class CalculatorPresenter:
    def __init__(self, model_1, view_1,number=90):
        self.model = model_1
        self.view = view_1
        self.operator=number
    def performCalculation(self):
        logging.basicConfig(level=logging.INFO, filename="calc_log_1.log", filemode="w")

        logger = logging.getLogger("log_1")
        number = self.view.getDouble()
        self.operator = self.view.getInputOperator()
        number_2 = self.view.getDouble_2()
        self.model.setResult(number)

        if self.operator == "+":
            self.model.add(number_2)

        elif self.operator == '-':
            self.model.minus(number_2)
        elif self.operator == "*":
            self.model.mult(number_2)
        elif self.operator == "/":
            self.model.division(number_2)
        elif self.operator=="stop":
            return
        logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2,self.model.getResult()))
        self.view.displayResult(self.model.getResult())
class ExpandedView(CalculatorView):
    def getInputOperator_1(self):
        print("Enter an operator (+, -, *, /): ")
        c = input()
        if c == "+" or c == "-" or c == "/" or c == "*" or c == "pow" or c == "sqrt" or c == "stop":
            return c
        print("Invalid operator, try again")
        return self.getInputOperator_1()

    def get_int(self):
        print("Enter a number 1: ")
        try:
            n = input()
            m = int(n)
            print(m)
            return m
        except:
            CalculatorView.except_err()
            return self.get_int()


class ExpandedModel(CalculatorModel):
    def power(self, number):
        self.setResult(math.pow(self.getResult(), number))

    def sqrt(self):
        self.setResult(math.sqrt(self.getResult()))


class ExpandedPresenter(CalculatorPresenter):
    def __init__(self, model_1, view_1,e=0):
        self.model = model_1
        self.view = view_1
        self.operator=e

    # мы, без изменения основного класса расширили его функционал
    # (Принцип открытости/закрытости (Open Closed Principle))
    #
    # так же этот дочерний класс расширяет базовый , я использовал так же
    # Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)

    def performCalculation(self):
        number = self.view.getDouble()
        self.operator = self.view.getInputOperator_1()

        self.model.setResult(number);
        number_2 = 0
        logging.basicConfig(level=logging.INFO, filename="calc_log_2.log", filemode="w")

        logger = logging.getLogger("log_2")
        if self.operator == "+":
            number_2 = self.view.getDouble_2()
            self.model.add(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif self.operator == "-":
            number_2 = self.view.getDouble_2()
            self.model.minus(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif self.operator == "*":
            number_2 = self.view.getDouble_2()
            self.model.mult(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif self.operator == "/":
            number_2 = self.view.getDouble_2();
            self.model.division(number_2)
            logger.info('{0} {1} {2} = {3}'.format(number, self.operator, number_2, self.model.getResult()))
        elif self.operator == "sqrt":
            self.model.sqrt()
            logger.info('"квадратный корень из числа {0}  = {1}'.format(number, self.model.getResult()))

        elif self.operator == "pow":
            number_2 = self.view.getInt()
            self.model.power(number_2)
            logger.info(' {0} в степени {1} = {2}'.format(number, number_2, self.model.getResult()))
        elif self.operator=="stop":
            return

        self.view.displayResult(self.model.getResult())


view = ExpandedView()
model = ExpandedModel()
presenter = ExpandedPresenter(model, view)
while not (presenter.operator == "stop"):
    presenter.performCalculation()
