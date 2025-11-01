class modernCalculator extends Calculator{
    public int multiply(int a,int b){
        return a*b;
    }

    public int div(int a,int b){
        return a/b;
    }
}
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class inehritanceBasic {
    public static void main(String a[]){
        
        modernCalculator m=new modernCalculator();
        System.out.println("Adittion result : "+(m.add(10,20)));
        System.out.println("Subtraction result : "+(m.sub(40,20)));
        
        System.out.println("Multiplication result : "+(m.multiply(40,20)));
        System.out.println("Division result : "+(m.div(40,20)));

    }
}
