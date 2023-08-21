package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 확인
        float var1= 0.1234567890123456789f;
        double var2=0.1234567890123456789;
        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);
        //10의 거듭제곱 리터럴 -> "e" or "E"를 사용하여 거듭제곱을 표현 할 수 있다 ex) e6 = 10^6 , E-6 = 10^-6 
        //float 타입에 대입을 하고 싶다면 리터럴 뒤에 소문자 "f" 나 대문자 "F" 를 사용해야 한다.
        double var3=3e6;
        float var4=3e6F;
        double var5 = 2e-3;
        System.out.println("var3: "+ var3);
        System.out.println("var4: "+ var4);
        System.out.println("var5: "+ var5);
    }
}
