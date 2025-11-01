import java.util.*;
class ReturnValue{

    public int resultAns(int n){
        if(n==1){
            return 1 ;
        }

        System.out.println(n);
        return resultAns(n-1);
    }
}
public class printnToOne {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=Integer.parseInt(sc.nextLine());
        ReturnValue obj=new ReturnValue();
        int res=obj.resultAns(n);
        System.out.println(res);
        sc.close();

    }
}
