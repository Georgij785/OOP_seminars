from CalculatorModel import  CalculatorModel
from  CalculatorView import CalculatorView
from CalculatorPresenter import CalculatorPresenter

view = CalculatorView()
model =CalculatorModel()
presenter =CalculatorPresenter(view, model)
presenter.performCalculation()


