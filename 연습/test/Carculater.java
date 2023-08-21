package 연습.test;
import java.util.Scanner;
public class Carculater {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
    
        while(true){
        // 두 정수 입력
        System.out.print("첫 번째 정수를 입력하세요> ");
        int i = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요> ");
        int j= scanner. nextInt();

        scanner.nextLine(); 
        // 연산자 입력(더하기, 빼기, 곱하기, 나누기)
        System.out.println("------------------------------------------------------------");
        System.out.println("더하기: +"+" | "+"뺴기: -"+" | "+"곱하기: *"+" | "+ "나누기: /");
        System.out.println("------------------------------------------------------------");
        System.out.print("연산자를 입력해주세요> ");
        String str=scanner.nextLine();
        //입력 후 출력 
            if(str.equals("곱하기") || str.equals("*")){
                System.out.println(i+ " x " + j +" = "+(i*j));
            }else if(str.equals("나누기") || str.equals("/")){
                if(i==0 || j==0){
                    System.out.println(i+" / "+ j +" = "+ 0); // 0을 대입했을 떄 'Infinity'를 방지
                }else if(i !=0 && j!=0){
                double result=(double)i/j;
                System.out.println(i+ " / " + j +" = "+(result));
                }
            }else if(str.equals("더하기") || str.equals("+")){
                System.out.println(i+ " + " + j +" = "+(i+j));
            }else if(str.equals("뺴기") || str.equals("-")){
                System.out.println(i+ " - " + j +" = "+(i-j));
            }
            //연산자를 잘못 입력했을 때 위로 돌려 보냄.
            else{
                System.out.println("연산자를 잘못 입력 하셨습니다.");
                System.out.println();
                continue ;
            }
        //프로그램 종료
        System.out.println("프로그램을 종료 [ Y / N ]");
        System.out.print("종료 하시겠습니까? > ");
        str=scanner.nextLine();
            if(str.equals("y") || str.equals("Y")){
                System.out.println("프로그램을 종료합니다.");
                break;
            } 
            else if (str.equals("N") || str.equals("n")){
                System.out.println("프로그램을 계속 실행합니다.");
                System.out.println();
            }else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        scanner.close();
    }  
}


