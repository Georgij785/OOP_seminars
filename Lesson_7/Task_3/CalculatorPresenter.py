from CalculatorModel import  CalculatorModel
from  CalculatorView import CalculatorView

class CalculatorPresenter :

    def __init__(self, model_1, view_1):
        self.model = model_1
        self.view = view_1



    def performCalculation(self):
        number =CalculatorView.getDouble()
        operator = CalculatorView.getInputOperator()
        number_2 = CalculatorView.getDouble()
        CalculatorModel.setResult(number)

        if operator=="+":
            CalculatorModel.add(number_2)

        if operator=="-":
            CalculatorModel.minus(number_2)

        if operator=="*":
            CalculatorModel.mult(number_2)

        if operator=="/":
            CalculatorModel.division(number_2)
        CalculatorView.displayResult(CalculatorModel.getResult())



