import logging

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