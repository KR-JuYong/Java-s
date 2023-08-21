package ch06.sec07;

public class Human {
    String name;
    int age;

    Human(String aname, int aage){
        name =aname;
        age=aage;
        System.out.println("나는 Human 클래스의 생성자입니다.");
        System.out.println("name: "+ name);
        System.out.println("age: "+age);
    /*Human(String name, int age){
        this.name=name;
        this.age=age;     //객체의 이름이 같다면 객체 자신을 나타내주는 this를 붙여주면 된다.
        System.out.println("name: "+ this.name);
        System.out.println("age: "+this.age);
    }*/
    }
}

class Exeution{
    public static void main(String[] args) {
        Human h= new Human("홍길동", 80);
        System.out.println("이름: " +h.name+"\n"+ "나이: "+h.age);
    }
}