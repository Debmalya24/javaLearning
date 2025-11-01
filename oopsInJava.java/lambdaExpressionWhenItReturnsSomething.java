interface ReturnSomething{
    int calculation(int a,int b);
}
public class lambdaExpressionWhenItReturnsSomething {
    public static void main(String args[]){
        ReturnSomething obj=(a,b)->{
            System.out.print("The value will be : ");
            return a*b;
        };

        int res=obj.calculation(3,4);
        System.out.println(res);
    }
}
