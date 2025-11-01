import java.util.*;
public class convertUpperToLower {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        String lower =str.toLowerCase();
        System.out.println("the String will be : "+lower);

        System.out.print("Enter the Character: ");

        char ch=sc.next().charAt(0);

        char low=Character.toLowerCase(ch);
        System.out.println("the character will be : "+low);

        sc.close();
    }
    
}
