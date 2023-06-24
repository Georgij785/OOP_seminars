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
