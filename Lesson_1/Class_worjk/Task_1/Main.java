package Lesson_1.Class_worjk.Task_1;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3);
        Triangle t3 = new Triangle(3, 2.5, "empty");

        Shape.clearScreen();

        t1.show_style();
        t1.show_shape();
        System.out.println(t1.area());

        t2.show_style();
        t2.show_shape();
        System.out.println(t2.area());

        t3.show_style();
        t3.show_shape();
        System.out.println(t3.area());

        t1.show_a();
    }
}
