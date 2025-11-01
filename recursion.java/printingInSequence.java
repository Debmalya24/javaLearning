import java.util.*;

class ReturnValue{

    public void resultAns(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    resultAns(n-1);
    System.out.println(n);
   }
}

public class printingInSequence {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=Integer.parseInt(sc.nextLine());
        ReturnValue obj=new ReturnValue();
        obj.resultAns(n);
        sc.close();
    }
}
