import logging


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


view = CalculatorView()
model = CalculatorModel()
presenter = CalculatorPresenter(model, view)
while not (presenter.operator == "stop"):
    presenter.performCalculation()
