package Lesson_4.Class_work.Task_1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer,String> iob=new Gen<>(88,"текст");
        iob.ShowType();
        int v=iob.GetOb();
        String str = iob.GetOb_2();
        System.out.printf("Значение v = %s, Значение str = %s",v,str);



    }

}
