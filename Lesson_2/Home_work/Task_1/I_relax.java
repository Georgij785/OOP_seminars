package Lesson_2.Home_work.Task_1;

public interface I_relax {
    void ListenMusic();

    void watchFilm();

    void playGame();

    void talkFriends();

    default void Sleep(){
        System.out.println("Спит");
    }

}
