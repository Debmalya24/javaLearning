class helper{
    public static int countZeroHelper(int n,int count){
        if(n==0){
            return count;
        }

        int rem=n%10;
        if(rem==0){
            return countZeroHelper(n/10,count+1);
        }
        else{
            return countZeroHelper(n/10,count);
        }
    }
}
class count{
    public  int ZeroCount(int n){
        return helper.countZeroHelper(n,0);
    }
}
public class countZero {
    public static void main(String a[]){
        int n=1020302;
        count obj=new count();
        int res=obj.ZeroCount(n);
        System.out.println(res);
    }
}
