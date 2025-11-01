import java.util.*;
class facto{

    public int factoAns(int n){

        if(n==0 || n==1){
            return 1;
        }

        return n*factoAns(n-1);
    }
}
public class factorial {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        facto f=new facto();
        int res=f.factoAns(n);
        System.out.print("Ans will be :"+res);
        sc.close();


    }
}
