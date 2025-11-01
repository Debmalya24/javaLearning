class helper{
    public static int reversehelper(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+reversehelper(n/10,digits-1);
    }
}
class reverseDigit{
    public int resultRev(int number){
    int numberOfDigits;
    if (number == 0) {
    numberOfDigits = 1;
    } else {
    numberOfDigits = (int)(Math.log10(Math.abs(number))) + 1;
    }
    return helper.reversehelper(number,numberOfDigits);
   }

}
public class revDigiUsingRecursionMethodTwo {
    public static void main(String a[]){

        int n=1234;
        reverseDigit obj=new reverseDigit();
        int res=obj.resultRev(n);
        System.out.println(res);
    }
}
