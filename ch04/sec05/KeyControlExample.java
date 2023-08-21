package ch04.sec05;

import java.util.Scanner;
public class KeyControlExample {
    public static void main(String[] args) {
        //while 문
        Scanner scanner= new Scanner(System.in);
        boolean run=true;
        int speed=0;

        while(run){
            System.out.println("---------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("---------------------------");
            System.out.print("선택: ");

            String strNum= scanner.nextLine();

            if(strNum.equals("1")){
                speed++;
                System.out.println("현재 속도 = "+speed);
           }else if (strNum.equals("2")){
                speed--;
                System.out.println("현재 속도 = "+speed);
           }else if (strNum.equals("3")){
                run=false;
           }else if (strNum.equals("증속")){
                speed++;
                System.out.println("현재 속도 = "+speed);
           }else if (strNum.equals("감속")){
                speed--;
                System.out.println("현재 속도 = "+speed);
           }else if (strNum.equals("중지")){
                run=false;
           }else{
                System.out.println("잘못 입력 하셨습니다.");
           }
        }
        scanner.close();
        System.out.println("프로그램 종료");
    }
}
