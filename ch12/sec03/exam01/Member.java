package ch12.sec03.exam01;

public class Member { //Object 라는 클래스를 상속한다는 것을 안쓰고 생략 하더라고 상속을 받는다고 볼 수 있다.
    public String id; //@Override 를 통해 Member라는 클래스가 묵시적으로 Object라는 클래스를 상속 받는다.

    public Member(String id){
        this.id=id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
