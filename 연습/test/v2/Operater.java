package 연습.test.v2;


public class Operater {
    
    String Operater;
    public Operater(){}

    public Operater(String Operater){
        this.Operater=Operater;
    }

    public int plus(int x, int y){
        int result=x+y;
        return result; 
    }

    public int minus(int x, int y){
        int result=x-y;
        return result; 
    }

    public int times(int x, int y){ 
        int result= (x*y);
        return result;
    }

    public double divide(int x, int y){
        if(x==0 || y==0){
            return 0;
        }
        double result=Math.round(((double)x/y)*100)/100.0;
        return result;
    }
    
}
