package Lesson_4.Home_work.Task_2;

import java.util.ArrayList;

public class Array<T> {
    ArrayList<T> objects = new ArrayList<>();

    Array(ArrayList<T> a) {
        objects = a;
    }

    public void printArray() {
        for (T i : objects
        ) {
            System.out.println(i);
            System.out.println(i.getClass());

        }
    }
}
