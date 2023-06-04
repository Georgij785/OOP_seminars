package Lesson_4.Class_work.Task_3;

public class main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen<A> g1 = new Gen<A>(a);
        Gen<B> g2 = new Gen<B>(b);
        Gen<C> g3 = new Gen<C>(c);
        Gen<D> g4 = new Gen<D>(d);

//        test(g1);
//        test(g2);
//        test(g3);
//        test(g4);
    }

//    static void test(Gen<? extends A> o) {//экземпляры класса А и его наследников

//    }
    static void test(Gen<? super C> o) {//экземпляры класса(нижняя гшранца)  С и его предки

    }
}
