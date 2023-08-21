package 연습.test.v3;

public abstract class Operater {
    String Operater;

    Operater(){}
    Operater(String Operater){
        this.Operater=Operater;
    }

    int plus(int num1, int num2){
        return (num1+num2);
    }
    
    int minus(int num1, int num2){
        return (num1-num2); 
    }
    int times(int num1, int num2){
        return (num1*num2);
    }
    
    double divide(int num1, int num2){
        if(num1==0 || num2==0){
            return 0;
        }
        return Math.round(((double)num1/num2)*100)/100.0;
    }
}
