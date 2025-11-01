class DigitSum{
    public int resultSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10)+resultSum(n/10);
    }
}
public class sumOfDigits {
    public static void main(String a[]){
        DigitSum obj=new DigitSum();
        int res=obj.resultSum(123);
        System.out.println(res);
    }
}
