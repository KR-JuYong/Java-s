package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        // 값 목록으로 배열 생성

        //배열 변수 선언과 배열 생성
        String[] season={"Spring", "Summer", "Fall", "Winter"};

        //배열의 항목값 읽기
        System.out.println("season[0]: "+season[0]); // *(season+0) --> season[0]과 같은 값을 가짐.
        System.out.println("season[1]: "+season[1]); // *(season+1) --> season이라는 주소로 들어가서 번호에 맞는 값을 읽어 오는 것.
        System.out.println("season[2]: "+season[2]); // *(season+2)
        System.out.println("season[3]: "+season[3]); // *(season+3)

        //인덱스 1번 항목의 값 변경
        season[1] ="여름";
        System.out.println("season[1]: "+ season[1]);
        System.out.println();

        //배열 변수 선언과 배열 생성
        int[] scores={83,90,87};
        scores= new int[] {83,90,87,50,40,57,98};
        //총합과 평균 구하기
        int sum=0;
        for(int i=0; i<7;i++){
            sum+=scores[i];
        }
        System.out.println("총합: "+ sum);
        double avg=(double)sum/7;
        System.out.println("평균: "+avg);

        //연습하기
        //int[] score;
        //score={83,90,87};
    }
}
