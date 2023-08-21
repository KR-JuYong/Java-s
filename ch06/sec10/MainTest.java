package ch06.sec10;

class A{
    int n;

    static int n2;
    A(){
        System.out.println("클래스 A 생성자");
    }
    A(int n,int n2, int n3){
        System.out.println("클래스 A(n) 생성자"+n+n2+n3);
        this.n=n;
        this.n=n2;
        this.n=n3;
    }
}

public class MainTest {
    public static void main(String[] args) {
        A a= new A();
        A a1= new A(10,20,30);
        System.out.println(a);
        System.out.println(a1);
        a.n=100;
        a1.n=1000;

        //n=0; --> 필드에 접근하기 위해서는 객체가 먼저 생성되어야 한다.(인스턴스 멤버)
        //a.n2=1;
        A.n2=2; //클래스 멤버에 접근

    }
}
