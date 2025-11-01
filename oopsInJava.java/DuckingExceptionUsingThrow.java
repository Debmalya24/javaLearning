
public class DuckingExceptionUsingThrow {
    public static void main(String args[]){

        try{
            int res=divide(20,4);
            System.out.println("Result : "+res);
        }
        catch(ArithmeticException e){
            System.out.println("Handled in main: You cannot divide by zero!");
        }
    }
      static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
}
