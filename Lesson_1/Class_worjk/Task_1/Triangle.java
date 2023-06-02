package Lesson_1.Class_worjk.Task_1;

public class Triangle extends Shape {
    String style;
    String  a ="Triangle";
    public  Triangle(){
        super();
        this.style="none";
    }
    public  Triangle(double x){
        super(x);
        this.style="none";
    }
    public Triangle(double width, double height, String style) {
        super(width, height);

        this.style = style;
    }

    double area() {
        return this.getWidth() * this.getHeight() / 2;
    }

    void show_style() {
        System.out.println(style);
    }

    @Override
    void show_shape() {
        // clearScreen();//Очищаем консоль
        System.out.println("Гипотенуза = " + Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight()));
    }
    void show_a(){
        System.out.println(this.a);
        System.out.println(super.a);
    }
}