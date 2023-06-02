package Lesson_1.Home_work.Task_2;
//Задача 2:
//        Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
//
//        Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//        Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//        Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//        Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//        Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
public class Rectangle {
    private double width;

    private double height;



    Rectangle(double width,double height){
        this.setWidth(width);
        this.setHeight(height);

    }
    Rectangle(){
        this.setWidth(10);
        this.setHeight(5);
    }


    public double calculateArea(){
        return this.getWidth()*this.getHeight();
    }

    public double calculatePerimeter(){
        return 2*(this.getWidth()+this.getHeight());
    }

    public void getInfo(){
        System.out.printf("Прямоугольник со сторонами %s и %s , площадь: %s , периметр: %s",this.getWidth(),this.getHeight(),this.calculateArea(),this.calculatePerimeter());
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
