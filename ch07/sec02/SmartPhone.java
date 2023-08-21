package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color){
        //super(String model, String color); -> 부모 생성자를 호출할 때 값을 입력
        System.out.println("자식 생성자 입니다.");
        this.model=model;
        this.color=color;
    }

    public void setWifi(boolean wifi){
        this.wifi=wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
        if(wifi==true){
            System.out.println("와이파이를 켭니다.");
        }else if(wifi==false){
            System.out.println("와이파이를 끕니다.");
        }
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
