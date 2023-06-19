package Lesson_6.HomeTask.Task_2;
// доп комментарий по SOLID только в файле A
public class Gen<T> {
    T ob;

    Gen(T o){
        ob=o;
    }

    static void test(Gen<?extends A> a){

    }

}
