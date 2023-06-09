package Lesson_2.Home_work.Task_1;

public class Person implements I_GoforAWalk{

    private String name;

    private int age;

    private String LastName;

    Person friend;
    String place="home";
    boolean free=true;

    Person(String name, int age, String LastName){
        this.name=name;
        this.age=age;
        this.LastName=LastName;
    }
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean CallFriendToWalk() {
        System.out.println("-Привет, "+friend.getName()+ "Давай погуляем.");
        if (friend.free){
            return true;
        }
        return false;
    }

    @Override
    public void GoOut() {

        System.out.println("Я выхожу на улицу");
        place="outside";
    }

    @Override
    public void MeetFriend() {
        friend.place="outside";
        System.out.println("-Привет,"+friend.getName()+"Пошли.");
        System.out.println("-Привет,"+this.getName()+"Да,Пошли.");
        for (int i = 0; i < 5; i++) {
            System.out.println("...\n");
        }

    }

    @Override
    public void Walk() {
        for (int i = 0; i < 5; i++) {
            System.out.println("...\n");
        }
        System.out.println("-Хорошо гуляем\n-Да");

        for (int i = 0; i < 5; i++) {
            System.out.println("...\n");
        }

    }

    @Override
    public void GoHome() {
        System.out.println("-Слушай, мне пора, до встречи, дружище!\n-Пока.");

    }
}
