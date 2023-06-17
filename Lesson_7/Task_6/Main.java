package Lesson_7.Task_6;

// Абстрактный класс продукта
abstract class Product {
    public abstract void doSomething();
}

// Конкретный класс продукта A
class ConcreteProductA extends Product {
    public void doSomething() {
        System.out.println("Выполнение операции в конкретном продукте A.");
    }
}

// Конкретный класс продукта B
class ConcreteProductB extends Product {
    public void doSomething() {
        System.out.println("Выполнение операции в конкретном продукте B.");
    }
}

// Абстрактный класс создателя
abstract class Creator {
    public abstract Product createProduct();

    public void doSomethingWithProduct() {
        Product product = createProduct();
        product.doSomething();
    }
}

// Конкретный класс создателя A
class ConcreteCreatorA extends Creator {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

// Конкретный класс создателя B
class ConcreteCreatorB extends Creator {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.doSomethingWithProduct();

        System.out.println();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.doSomethingWithProduct();
    }
}