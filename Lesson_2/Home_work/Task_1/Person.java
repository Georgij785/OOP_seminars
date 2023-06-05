package Lesson_2.Home_work.Task_1;

public class Person {

    private String name;

    private int age;

    private String LastName;



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
}
