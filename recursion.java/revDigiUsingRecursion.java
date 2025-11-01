class reverseDigit{
    int sum=0;

    public int resultRev(int n){
        if(n==0){
            return sum ;
        }

        int rem=n%10;
        sum=rem+(sum*10);
        return resultRev(n/10);
    }
}
public class revDigiUsingRecursion {
    public static void main(String a[]){

        int n=1234;
        reverseDigit obj=new reverseDigit();
        int res=obj.resultRev(n);
        System.out.println(res);
    }
    
}
