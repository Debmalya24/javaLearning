import java.util.*;
public class palindrome {

    public static void main(String a[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the String: ");
        StringBuffer str=new StringBuffer(sc.nextLine());

        String rev=str.toString();
        str.reverse();

        if(rev.equals(str.toString())){
            System.out.println("It is a palindrome");

        }
        else{
            System.out.println("It is not a palindrome");
        }

        


        sc.close();
    }
    
}
