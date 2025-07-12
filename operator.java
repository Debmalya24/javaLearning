
import java.util.Scanner;
public class operator{

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);

        int x =sc.nextInt();
        int y =sc.nextInt();

        boolean res=(x>y);
        System.out.println(res);

        res=(x<y);
        System.err.println(res);

        res=(x==y);
        System.out.println(res);;


        sc.close();

    }

} 
