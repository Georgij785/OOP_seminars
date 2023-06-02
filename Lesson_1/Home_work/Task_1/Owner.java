package Lesson_1.Home_work.Task_1;

public class Owner extends Person{
    private Cat cat;

    Owner(String name, int age, String LastName) {
        super(name, age, LastName);
    }


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
         cat.setOwner(this);
    }
}
