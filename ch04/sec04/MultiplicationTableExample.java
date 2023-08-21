package ch04.sec04;
import java.util.Scanner;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        //for 문
        Scanner scanner = new Scanner(System.in);
        System.out.printf("(1)몇 단의 구구단을 출력할까요: ");
        int i =scanner.nextInt();

        if(i==2){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==3){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==4){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==5){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==6){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==7){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==8){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }else if(i==9){
            for(int n=1; n<=9; n++){
                System.out.println(i+" x "+n+" = "+(i*n));
            }
        }
        System.out.printf("(2)몇단의 구구단을 출력할까요? ");
        int j=scanner.nextInt();

        for(int n=1; n<=9; n++){
            System.out.println(j+" x "+n+ " = "+(j*n));
            if(j>9){
                for(n=1; n<=j; n++){
                    System.out.println(j+" x "+ n+" = "+(j*n));
                }
            }
        }
        scanner.close();
    }
    
 }

