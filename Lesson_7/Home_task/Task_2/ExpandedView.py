import CalculatorView


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
            CalculatorView.CalculatorView.except_err()
            return self.get_int()
