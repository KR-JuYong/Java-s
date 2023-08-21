package 연습.test;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int[][] scores= new int[2][3];
        int[] sum =new int[2];
        double[] avg= new double[2];
        
        System.out.print("첫 번째 학생의 국어 성적을 입력하세요> ");
        scores[0][0]=scanner.nextInt();

        System.out.print("첫 번째 학생의 수학 성적을 입력하세요> ");
        scores[0][1]=scanner.nextInt();

        System.out.print("첫 번째 학생의 영어 성적을 입력하세요> ");
        scores[0][2]=scanner.nextInt();

        System.out.println("첫 번째 학생의 성적"+"\n"+"국어 성적은 "+ scores[0][0]+"점 입니다."+
        "수학 성적은 "+ scores[0][1]+"점 입니다."+"영어 성적은 "+ scores[0][2]+"점 입니다.");
        for(int i=0; i<scores[0].length;i++){
            sum[0]+= scores[0][i];
        }
        avg[0]=Math.round(((double)sum[0]/scores[0].length)*100)/100.0;
        System.out.println("총 점수: "+sum[0]+"입니다." + "\n" + "평균 점수: "+avg[0]+"입니다.");
        

        System.out.print("두 번째 학생의 국어 성적을 입력하세요> ");
        scores[1][0]=scanner.nextInt();

        System.out.print("두 번째 학생의 수학 성적을 입력하세요> ");
        scores[1][1]=scanner.nextInt();

        System.out.print("두 번째 학생의 영어 성적을 입력하세요> ");
        scores[1][2]=scanner.nextInt();

        System.out.println("두 번째 학생의 성적"+"\n"+"국어 성적은 "+ scores[1][0]+"점 입니다."+
        "수학 성적은 "+ scores[1][1]+"점 입니다."+"영어 성적은 "+ scores[1][2]+"점 입니다.");
        
        for(int i=0; i<scores[1].length;i++){
            sum[1]+= scores[1][i];
        }
        
        avg[1]=Math.round(((double)sum[1]/scores[1].length)*100)/100.0;
        System.out.println("총 점수: "+sum[1]+"입니다." + "\n" + "평균 점수: "+avg[1]+"입니다."); 
        
        
        for(int i=0; i<scores.length;i++){
            for(int k=0; k<scores[i].length ;k++) {
                scores[i][k]= scanner.nextInt();
                }
                if(i==0){
                    System.out.println("첫 번째 학생의 국어 점수는"+scores[0][0]+"입니다.");
          
                    System.out.println("첫 번째 학생의 수학 점수는"+scores[0][1]+"입니다.");

                    System.out.println("첫 번째 학생의 영어 점수는"+scores[0][2]+"입니다.");

                    sum[0]+=scores[0][i];
                }else if(i==1){
                    System.out.println("두 번째 학생의 국어 점수는"+scores[1][0]+"입니다.");                    
                
                    System.out.println("두 번째 학생의 수학 점수는"+scores[1][1]+"입니다.");
                
                    System.out.println("두 번째 학생의 영어 점수는"+scores[1][2]+"입니다.");
                }
            }
        scanner.close();
    }
        

   }

