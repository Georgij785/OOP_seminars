package Lesson_2.Class_work.Task_1;

public class Main {
    public static void main(String[] args) {
        Numeric n =new Numeric();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значенте : %d\n",n.GetNext());

        }
        System.out.println("сброс");
        n.reset();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значенте : %d\n",n.GetNext());

        }
        System.out.println("Начальное значение 100");
        n.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значенте : %d\n",n.GetNext());

        }
    }
}
