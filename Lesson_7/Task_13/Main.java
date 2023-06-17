package Lesson_7.Task_13;

abstract class Product {
    public abstract void doSomething();
}

class ConcreteProductA extends Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteProductA");
    }
}

class ExtendedConcreteProductA extends ConcreteProductA {
    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("Adding additional functionality in ExtendedConcreteProductA");
    }
    public void print_type(){
        System.out.println();
    }

    public void additionalMethod() {
        System.out.println("Additional method in ExtendedConcreteProductA");
    }
}

class Factory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ExtendedFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ExtendedConcreteProductA();
    }
}

public class Main {
    public static void main(String[] args) {
        Factory factory = new ExtendedFactory();
        Product product = factory.createProduct();
        product.doSomething(); // Output: Doing something in ConcreteProductA
        //         Adding additional functionality in ExtendedConcreteProductA

        if (product instanceof ExtendedConcreteProductA) {
            ExtendedConcreteProductA extendedProduct = (ExtendedConcreteProductA) product;
            extendedProduct.additionalMethod(); // Output: Additional method in ExtendedConcreteProductA
        }
    }
}