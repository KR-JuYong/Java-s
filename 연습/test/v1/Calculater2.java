package 연습.test.v1;

import java.util.Scanner;

public class Calculater2 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    while(true){
    Calculater calc=new Calculater();

    System.out.print("첫 번째 정수를 입력하세요> ");
    calc.num1=scanner.nextInt();
    System.out.print("두 번째 정수를 입력하세요> ");
    calc.num2=scanner.nextInt();

    scanner.nextLine();
    System.out.print("연산자를 입력하세요> ");
    calc.Operater=scanner.nextLine();
     
    if(calc.Operater.equals("+")){
        int result=calc.plus(calc.num1, calc.num2);
        System.out.println(result);
    }else if(calc.Operater.equals("-")){ 
        int result=calc.minus(calc.num1, calc.num2);
        System.out.println(result);
    }else if(calc.Operater.equals("*")){
        int result=calc.times(calc.num1, calc.num2);
        System.out.println(result);
    }else if(calc.Operater.equals("/")){
        double result=calc.divide(calc.num1,calc.num2);
        System.out.println(result);
    }
    //프로그램 종료
    System.out.println("프로그램을 종료 [ Y / N ]");
    System.out.print("종료 하시겠습니까? > ");
    calc.Operater=scanner.nextLine();
        if(calc.Operater.equals("y") || calc.Operater.equals("Y")){
            System.out.println("프로그램을 종료합니다.");
            break;
        } 
        else if (calc.Operater.equals("N") || calc.Operater.equals("n")){
            System.out.println("프로그램을 계속 실행합니다.");
            System.out.println();
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    scanner.close();

    }
}
