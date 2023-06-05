package Lesson_2.Home_work.Task_1;

public abstract class Abstract_have_life {
    abstract void eat();

    abstract void sleep();

    void drink(){
        System.out.println("Животное пьёт из реки");//в персон перегружаем на попить воды например из стакана
    };
}
