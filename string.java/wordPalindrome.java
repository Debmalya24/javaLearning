import java.util.*;
public class wordPalindrome {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer sb=new StringBuffer(str).reverse();
        String s=sb.toString();
        System.out.println(s);

        if(s.equals(str)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
    
}
