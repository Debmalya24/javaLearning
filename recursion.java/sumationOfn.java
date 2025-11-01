class summationRes{
    public int resultSum(int n){
        if(n==1){
            return 1;
        }
        return n+resultSum(n-1);
    }
}
public class sumationOfn {
    public static void main(String a[]){
        int n=5;
        summationRes obj=new summationRes();
        int res=obj.resultSum(n);
        System.out.println(res);
    }
}
