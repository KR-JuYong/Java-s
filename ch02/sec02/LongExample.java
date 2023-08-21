package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1=10;
        long var2=20L;
        long var3=10000000L; // int 타입의 허용 범위를 넘어간다면 리터럴 뒤에 소문자 l 이나 대문자 L을 붙여 줘여 한다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}
