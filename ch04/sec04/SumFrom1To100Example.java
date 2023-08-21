package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        //for 문
        int sum=0;
        int i;

        for(i=1; i<=100; i++){
            sum +=i;
        }
        System.out.println("1~"+(i-1)+"합: "+sum);
        

        int j;
        int sumj=0;
        for(j=1; j<=100; j++){
            sumj +=j;
        }
        System.out.println("1부터 100까지의 합은 "+ sumj+"입니다.");
    }

}
