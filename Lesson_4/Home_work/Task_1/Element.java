package Lesson_4.Home_work.Task_1;

public class Element <T>{
    T t;
    Element(T t ){
        this.t=t;
    }
    public void printElement(){
        System.out.println(t);
        System.out.println(t.getClass());
    }
}
