package 연습.test.v1;

import java.util.Scanner;

public class Carculater_v1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
        Class c= new Class();
        Operater op=new Operater();
        System.out.print("첫 번째 정수를 입력하세요> ");
        c.num1=scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요> ");
        c.num2=scanner.nextInt();

        scanner.nextLine();
        System.out.print("연산자를 입력하세요> ");
        String Operater=scanner.nextLine();

        if(Operater.equals("+")){
            int result= op.plus(c.num1, c.num2);
            System.out.println("결과값: "+ result);
        }else if(Operater.equals("-")){
            int result=op.minus(c.num1, c.num2); 
            System.out.println("결과값: "+result);
        }else if(Operater.equals("*")){
            double result=op.multi(c.num1, c.num2);
            System.out.println("결과값: "+result);
        }else if(Operater.equals("/")){
            if(c.num1==0 || c.num2==0){
                System.out.println("결과값: "+0);
            }else{
            double result= op.divide(c.num1, c.num2);
            System.out.println("결과값: "+result);
            }
        }
        //프로그램 종료
        System.out.println("프로그램을 종료 [ Y / N ]");
        System.out.print("종료 하시겠습니까? > ");
        Operater=scanner.nextLine();
            if(Operater.equals("y") || Operater.equals("Y")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } 
            else if (Operater.equals("N") || Operater.equals("n")){
                System.out.println("프로그램을 계속 실행합니다.");
                System.out.println();
            }else{
                System.out.println("잘못 입력하셨습니다.");
            }

        }   
        scanner.close(); 
    }
}
