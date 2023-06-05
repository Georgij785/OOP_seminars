package Lesson_2.Home_work.Task_1;

public interface I_GoforAWalk {
    boolean YouHaveFriendsToWalk=true;
    default void GoForAWalk(){
        if (YouHaveFriendsToWalk){
            CallFriendToWalk();
            GoOut();
            MeetFriend();
            Walk();
            GoHome();
        }
        else {
            GoOut();
            Walk();
            GoHome();
        }
    }
    void CallFriendToWalk();
    void GoOut();

    void MeetFriend();

    void Walk();

    void GoHome();


}
