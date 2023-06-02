package Lesson_1.Home_work.Task_1;
//Задача 1:
//        Создайте класс "Кот" (Cat) со следующими свойствами:
//
//        Приватное поле "имя" (name) типа String для хранения имени кота.
//        Приватное поле "возраст" (age) типа int для хранения возраста кота.
//        Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//        Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//        Дополнительное задание:
//        Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
public class Cat {

    private String name;

    private int age;
    private Owner owner;

    Cat(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет). Мой владелец - %s.",name,age,owner.getName()+" "+owner.getLastName());
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;

    }
}
