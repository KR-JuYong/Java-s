package 연습;
public class Example {
    public static void main(String[] args) {
        int a=20;
        int b=220;
        if(a==b){
            System.out.println("a와 b의 값은 같다.");
        }
        else{
            System.out.println("a와 b의 값은 다르다");
        }

        for(int i=0; i<=20; i++){
            if(i==a){
                System.out.println("값이 같아졌습니다.");
                break;
            }
        }
    }
}
