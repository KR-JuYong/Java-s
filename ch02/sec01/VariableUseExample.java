package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        //시간과 분 변수 선언 및 값 지정
        int hour=3;
        int minute=5;
        //시간 및 분 출력
        System.out.println(hour+"시간"+minute+"분" );
        //전체 분 출력
        int totalMinute=(hour*60)+minute;
        System.out.println("총"+totalMinute+"분");
    }
}
