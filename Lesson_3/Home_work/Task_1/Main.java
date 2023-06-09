package Lesson_3.Home_work.Task_1;



public class Main {
    public static void main(String[] args) {
        Person  per_1=new Person("Ваня",23,"Петров");
        Person  per_2=new Person("Илья",21,"Васильев");
        per_1.friend=per_2;

        per_1.GoForAWalk();

    }
}
