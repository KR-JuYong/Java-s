package ch07.sec04;

public class MainTest {
    
}

class A{
    void Method(){
        System.out.println("나는 학생입니다.");
    }
}

class B extends A{
    @Override                                           // 부모 클래스와 같은 메소드가 있을 때 재정의를 하는 것이다. 
    void Method(){                                      // 위 예시로 본다면 Method()에 부모 클래스에서는 학생이지만 
        System.out.println("나는 직장인입니다.");       //자식 클래스로 오면서 직장인이 되기 때문에
                                                        //자식 클래스에서 @Override를 사용하여 Method를 재정의 한다.
    }
}

