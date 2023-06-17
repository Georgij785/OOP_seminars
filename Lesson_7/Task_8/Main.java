package Lesson_7.Task_8;

// Абстрактный класс фабрики
interface TransportFactory {
    Transport createTransport();
}

// Конкретная фабрика для создания автомобилей
class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

// Конкретная фабрика для создания велосипедов
class BikeFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}

// Интерфейс транспортного средства
interface Transport {
    void drive();
}

// Конкретный класс автомобиля
class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

// Конкретный класс велосипеда
class Bike implements Transport {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}

// Клиентский код
public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.drive(); // Driving a car

        TransportFactory bikeFactory = new BikeFactory();
        Transport bike = bikeFactory.createTransport();
        bike.drive(); // Riding a bike
    }
}