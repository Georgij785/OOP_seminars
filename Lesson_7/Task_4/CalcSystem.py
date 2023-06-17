# Модель (Model) - отвечает за логику вычислений
class CalculatorModel:
    def add(self, num1, num2):
        return num1 + num2

    def subtract(self, num1, num2):
        return num1 - num2

    def multiply(self, num1, num2):
        return num1 * num2

    def divide(self, num1, num2):
        if num2 != 0:
            return num1 / num2
        else:
            return "Ошибка: деление на ноль"


# Представление (View) - отображает пользовательский интерфейс и обрабатывает ввод пользователя
class CalculatorView:
    def get_input(self):
        num1 = float(input("Введите первое число: "))
        operator = input("Введите оператор (+, -, *, /): ")
        num2 = float(input("Введите второе число: "))
        return num1, operator, num2

    def display_result(self, result):
        print("Результат:", result)


# Презентер (Presenter) - связывает модель и представление, обрабатывает бизнес-логику
class CalculatorPresenter:
    def __init__(self, model, view):
        self.model = model
        self.view = view

    def calculate(self):
        num1, operator, num2 = self.view.get_input()

        if operator == "+":
            result = self.model.add(num1, num2)
        elif operator == "-":
            result = self.model.subtract(num1, num2)
        elif operator == "*":
            result = self.model.multiply(num1, num2)
        elif operator == "/":
            result = self.model.divide(num1, num2)
        else:
            result = "Ошибка: некорректный оператор"

        self.view.display_result(result)


# Создание объектов модели, представления и презентера
model = CalculatorModel()
view = CalculatorView()
presenter = CalculatorPresenter(model, view)

# Вызов метода для выполнения вычислений
presenter.calculate()