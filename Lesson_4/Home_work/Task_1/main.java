package Lesson_4.Home_work.Task_1;
import Lesson_4.Home_work.Task_1.Element;

public class main {
    public static void main(String[] args) {
        Element<Integer> e_1=new Element<Integer>(1);
        Element<String> e_2=new Element<String>("text");
        Element<Double> e_3=new Element<Double>(12.3);

        e_1.printElement();
        e_2.printElement();
        e_3.printElement();
    }
}
