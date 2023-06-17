package Lesson_4.Home_work.Task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> ar_i = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Array<Integer> a_1 = new Array<Integer>(ar_i);

        ArrayList<String> ar_S = new ArrayList<>(Arrays.asList("text", "kjdf", "jkhsdohd"));
        Array<String> a_2 = new Array<String>(ar_S);


        a_1.printArray();
        a_2.printArray();
    }

}
