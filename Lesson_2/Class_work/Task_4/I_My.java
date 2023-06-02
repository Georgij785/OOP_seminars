package Lesson_2.Class_work.Task_4;

public interface I_My {
    int getUserID();

    default int getAdminId() {
        return 1;
    }

}
