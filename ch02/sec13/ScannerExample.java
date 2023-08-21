package ch02.sec13;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) throws Exception {
        //키보드 입력 데이터를 변수에 저장

        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String strX=scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력: ");
        String strY=scanner.nextLine();
        int y =Integer.parseInt(strY);

        int result=x+y;
        System.out.println("x+y: "+result);
        System.out.println();

        while(true){
            System.out.print("입력 문자열: ");
            String data= scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: "+data);
            System.out.println();
        }
        System.out.println("종료");
        /* 오류 해결 (scanner 변수를 사용함으로 써 지속적으로 사용됨)
         Resource leak. 'scanner' is never closed
         -> new Scanner 에 System.in 을 해주었기 때문에 반드시 close를 해주어야 한다.
         -> 따라서 scanner를 다 사용하고 마지막에 scanner.close()를 사용 함으로써
         -> 오류를 해결 할 수 있다.
         */
        scanner.close();
    }
}
