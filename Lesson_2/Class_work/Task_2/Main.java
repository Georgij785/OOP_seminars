package Lesson_2.Class_work.Task_2;

import Lesson_2.Class_work.Task_1.I_Oper;

public class Main implements I_Const {
    public static void main(String[] args)  {
        int[] nums=new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i>=MAX)System.out.println(ERROR);
            else {
                nums[i]=i;
                System.out.println(nums[i]);

            }

        }

    }


}
