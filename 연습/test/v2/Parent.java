package 연습.test.v2;

import java.util.Scanner;

public class Parent {
    protected int num1;
    protected int num2;
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    while(true){
    Operater op =new Operater();
    Child c=new Child();

    System.out.print("첫 번째 정수를 입력하세요> ");
    int num1=scanner.nextInt();
    System.out.print("두 번째 정수를 입력하세요> ");
    int num2=scanner.nextInt();
    
    scanner.nextLine();
    System.out.println("--------------------------------------------");
    System.out.println("더하기: +"+" | "+"뺴기: -"+" | "+"곱하기: *"+" | "+ "나누기: /");
    System.out.println("--------------------------------------------");
    System.out.print("연산자를 입력하세요> ");
    op.Operater=scanner.nextLine();
    
    if(op.Operater.equals("+")){
        int result=op.plus(num1,num2);
        System.out.println("결과 값: "+result); 
    }else if(op.Operater.equals( "-")){
        int result=op.minus(num1,num2);
        System.out.println("결과 값: "+result);
    }else if(op.Operater.equals("/")){
        double result=op.divide(num1,num2);
        System.out.println("결과 값: "+result);
    }else if(op.Operater.equals("*")){
        int result=op.times(num1, num2);
        System.out.println("결과 값: "+result);
    }else if(op.Operater.equals("%")){
        int result=c.rest(num1,num2);
        System.out.println("결과 값: "+result);
    }
    //프로그램 종료 
    System.out.println("프로그램을 종료 [ Y / N ]");
    System.out.print("종료 하시겠습니까? > ");
    op.Operater=scanner.nextLine();
        if(op.Operater.equals("y") || op.Operater.equals("Y")){
            System.out.println("프로그램을 종료합니다.");
            break;
        } 
        else if (op.Operater.equals("N") || op.Operater.equals("n")){
            System.out.println("프로그램을 계속 실행합니다.");
            System.out.println(); 
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    scanner.close();
    }    
}



