class CalculatorView ():




# //    public String getOperate() {
# //        System.out.print("Enter an operator (+, -, *, /): ");
# //        return scan.nextLine();
# //    }


    def getInputOperator(self):
        print("Enter an operator (+, -, *, /): ");
        c = input()
        if c=="+"or c=="-" or c=="/" or c=="*":
            return c
        else:
            print("Invalid operator, try again");
            return self.getInputOperator()



    def displayResult(self,result) :
        print("Result: " + result);


    def error_text(self) :
        print("Введено не число\nвведите число");



    def  getDouble(self) :

        print("Enter a number 1: ");


        try:
            n=input()
            return n
        except :

            Exception
            self.error_text()
            return self.getDouble()
