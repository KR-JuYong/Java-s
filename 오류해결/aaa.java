package 오류해결;

public class aaa {
    public static void main(String[] args) {
        // Resource leak. 'scanner' is never closed
        /* 오류 해결 (scanner 변수를 사용함으로써 닫지 않는다면 지속적으로 사용됨)
         Resource leak. 'scanner' is never close
         -> new Scanner 에 System.in 을 해주었기 때문에 반드시 close를 해주어야 한다.
         -> 따라서 scanner를 다 사용하고 마지막에 scanner.close()를 사용 함으로써
         -> 오류를 해결 할 수 있다.
         */
        //-------------------------------------------

        //The value of the local variable is not used
        /*오류 해결 (사용하지 않는 변수를 선언 하였을 때)
        The value of the local variable is not used
        -> 사용하지 않는 변수를 알려 주는 것
        -> 해결법으로는 그냥 그 변수를 사용하거나 없애면 됨.
        */

        //--------------------------------------------
        
        //Duplicate local variable createDate 
        /*Duplicate local variable createDate 에러
        -> 변수 중복 선언
        -> 해결: 변수 명을 바꾸기.
        */

        //--------------------------------------------
        
        //Cannot be resolved to a variable java 
        /*cannot be resolved to a variable java 에러
        ->단순히 굳이 입력 안해도 됨.
        ->index, format 등 자동으로 입력 됨으로 지우면 에러가 사라짐.
         */
        
         //--------------------------------------------

         //--------------------------------------------

        
    }
}
