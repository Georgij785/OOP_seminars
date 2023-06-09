package Lesson_2.Home_work.Task_1;

public interface I_GoforAWalk {

    default void GoForAWalk() {
        if (CallFriendToWalk()) {
            GoOut();
            MeetFriend();
            Walk();
            GoHome();
        } else {
            GoOut();
            Walk();
            GoHome();
        }
    }


    boolean CallFriendToWalk();

    void GoOut();

    void MeetFriend();

    void Walk();

    void GoHome();


}
