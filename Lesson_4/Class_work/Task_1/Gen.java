package Lesson_4.Class_work.Task_1;

public class Gen<T, Y> {//название любое
    T ob;
    Y ob_2;

    Gen(T o, Y o_2) {
        ob = o;
        ob_2 = o_2;
    }

    T GetOb() {
        return ob;
    }
    Y GetOb_2() {
        return ob_2;
    }
    public void ShowType() {
        System.out.println("Тип T - Это " + ob.getClass().getName());
        System.out.println("Тип Y - Это " + ob_2.getClass().getName());
    }
}
