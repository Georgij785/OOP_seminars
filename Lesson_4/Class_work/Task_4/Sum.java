package Lesson_4.Class_work.Task_4;

import Lesson_4.Class_work.Task_2.Numeric;

public class Sum {
    int Sum;

    <T extends Number>Sum(T a){
        Sum=0;
        for (int i = 0; i <=a.intValue(); i++) {
            Sum+=i;
        }

    }
     int getSum(){
        return Sum;
    }

}
