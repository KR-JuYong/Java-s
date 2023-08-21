package 연습;

import java.util.Scanner;
public class Myclass2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        //String str1= sc.nextLine(); //문자열 형태로 입력을 받는다.
        int n1=sc.nextInt(); //바로 정수 입력을 받는다.
        System.out.print("두 번째 정수를 입력하세요: ");
        //String str2= sc.nextLine(); //문자열 형태로 입력을 받는다.
        int n2= sc.nextInt();
        //int n1= Integer.parseInt(str1); //문자열 -> 정수로 변환
        //int n2= Integer.parseInt(str2);
        System.out.printf("+ : %d\n", n1+n2);
        
        System.out.print("입력하세요: ");
        //String st= sc.next(); //"123 456"을 입력하였을 때 "123"만 결과로 나온다. "next"는 띄워쓰기 기준으로 전까지의 값을 출력한다.
        char ch= sc.next().charAt(0);
        System.out.println(ch);
        
        sc.close();
    }
}
