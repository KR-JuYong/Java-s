package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C extends A {
    public void method(){
       
        /*A a=new A();
        a.field="value";
        a.method(); */ // A클래스와 다른 패키지에 있기 때문에 접근 할 수 가 없다.
    }                  // A클래스의 자식 클래스이미로 접근이 가능하지만 new 연산자를 사용해서 생성자를 직접 호출 할 수는 없다.
                        //super()로 A생성자를 호출 할 수 있다.
}



