import math
import CalculatorModel

class ExpandedCalculatorModel(CalculatorModel):
    def power(self, number):
        self.setResult(math.pow(self.getResult(), number))

    def sqrt(self):
        self.setResult(math.sqrt(self.getResult()))