package Lesson_6.HomeTask.Task_2;
/*

классы B и C мы можем использовать для расширения класса А ,
без его изменения вручную(Принцип открытости/закрытости (Open Closed Principle)), и потом заменить А на В или
С и всё будет работать(Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle))
 */
public class A {
    //
}
//ограниченные шаблоны
 class B extends A{
    public void DopMethod(){
     System.out.println("Выполнение расширенного функционала");
    }
}
class C extends A{
 public void NewMethod(){
  System.out.println("Выполнение нового функционала");
 }
}
class D {
    //
}
