package ch09.sec03.exam01;

public class A {
    static class B{}

    B field1= new B();

    static B field2=new B();

    A(){
        B b = new B ();
        System.out.println(b);
    }

    void method1(){
        B b=new B();
        System.out.println(b);
    }

    static void method2(){
        B b =new B();
        System.out.println(b);
    }
}
