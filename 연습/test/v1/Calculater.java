package 연습.test.v1;

public class Calculater {

    int num1;
    int num2;
    String Operater;

    public Calculater(){}
    public Calculater(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void Operater(){}
    public void Operater(String Operater){ 
        this.Operater=Operater;
    }

    int plus(int x, int y){
        int result=x+y;
        return result;
    }

    int minus(int x, int y){
        int result=x-y;
        return result;
    }

    int times(int x, int y){
        int result= (x*y);
        return result;
    }

    double divide(int x, int y){
        if(x==0 || y==0){
            return 0;
        }
        double result=Math.round(((double)x/y)*100)/100.0;
        return result;
    }

}
