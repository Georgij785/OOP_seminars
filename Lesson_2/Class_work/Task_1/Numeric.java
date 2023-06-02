package Lesson_2.Class_work.Task_1;

public class Numeric implements I_Oper{
    int start;
    int val;

    int prev;

    Numeric(){
        start=0;
        val=0;
        prev=-2;
    }
    @Override
    public int GetNext() {
        prev=val;
        val+=2;

        return val;
    }

    @Override
    public void reset() {
        prev=-2;
        val=0;
        start=0;
    }

    @Override
    public void setStart(int x) {
        prev=x-2;
        start=val=x;
    }

    int getPrev(){
        return prev;
    }
}
