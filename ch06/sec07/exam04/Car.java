package ch06.sec07.exam04;

public class Car {
    String company="현대자동차"; //모든 객체에 공통되는 값을 가질 때 필드에서 선언.
    String model;
    String color;
    int maxSpeed;
    //생성자 오버로딩
    Car(){}                                             //디폴트 생성자

    Car(String model){                                  // 매개변수 1개를 갖는 생성자
        this.model=model;
    }

    Car(String model, String color){                    //매개변수 2개를 갖는 생성자
        this.model=model;
        this.color=color;
    }

    Car(String model, String color, int maxSpeed){      //매개변수 3개를 갖는 생성자
        this.model=model;
        this.color=color;
        this.maxSpeed=maxSpeed;
    }
}
