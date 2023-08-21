package ch03.sec02;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        //산술 연산자

        byte v1= 10;
        byte v2 = 4;
        int v3 =5;
        long v4=10L;

        int result1=v1+v2;
        System.out.println("result1: "+result1);

        long result2=v1+v2-v4;
        System.out.println("result2: "+result2);

        double result3=(double)v1/v2;
        System.out.println("result3: "+ result3);

        int result4= v1%v2;
        System.out.println("result4: "+result4);
        
        /*추가 - 오류 해결 (사용하지 않는 변수를 선언 하였을 때)
        The value of the local variable is not used
        -> 사용하지 않는 변수를 알려 주는 것
        -> 해결법으로는 그냥 그 변수를 사용 하면 됨.
        */
        int result5=v1*v3;
        System.out.println("result5: "+result5);
    }
}
