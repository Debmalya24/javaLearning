import java.util.*;
class fibonacci{
    public static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}

public class fibonnaciSeries {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=Integer.parseInt(sc.nextLine());

        int ans=fibonacci.fibo(n);
        System.out.println(ans);
        sc.close();
    }
}
