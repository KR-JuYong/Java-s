package ch09.sec04.exam01;

public class A {
    A(){
        class B{}

        B b=new B();
        System.out.println(b);
    }

    void method(){
        class B{}

        B b =new B();
        System.out.println(b);
    }
}
