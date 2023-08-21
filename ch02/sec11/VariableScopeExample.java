package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1=15;
        // v2 선언을 메소드 블록에서 선언
        int v2= v1-10;
        if(v1>10){
            v2= v1-10;
            System.out.println(v2);
        }
        /* 오류 v2는 if 문 안에서 선언되었기 때문에 
        int v3=v1+v2+5; */
        // 해결
        int v3=v1+v2+5;
        System.out.println(v3);
        
    }
}
