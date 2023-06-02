package Lesson_1.Class_worjk.Task_1;

public class Shape {
    private double width;
    private double height;
    String  a ="Shape";
    public Shape(){
        height=width=0;

    }
    public Shape(double x ){
        height=width=x;

    }
    public Shape(double width, double height) {
        this.height = height;
        this.width = width;
    }

    void show_shape() {
        // clearScreen();//Очищаем консоль
        System.out.println("Ширина = " + width);
        System.out.println("Высота = " + height);
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    // Метод очистки консоли терминала
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}