import CalculatorView
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
