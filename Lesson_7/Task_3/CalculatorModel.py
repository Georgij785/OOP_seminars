import CalculatorView
class CalculatorModel :
    result=0;

    def add(self,number) :
        self.result += number

    def minus(self, number):
        self.result += number

    def division(self,number) :

        while (number == 0) :
            print("Cannot divide by zero, please enter another number");
            number = CalculatorView.getDouble();

        self.result /= number;


    def mult(self, number):
        self.result *= number


    def getResult(self) :
        return self.result


    def setResult(self,result) :
        self.result = result;


