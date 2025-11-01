import java.util.*;
public class anagramCheck {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the string : ");
        String str1=sc.nextLine();

        char c[]=str.toCharArray();
        char c1[]=str1.toCharArray();
        
        if(str.length()!=str1.length()){
            System.out.println("404 ! Error");
            sc.close();
            return;
            
        }

        Arrays.sort(c);
        Arrays.sort(c1);

        String newString1=new String(c);
        String newString2=new String (c1);

        if(newString1.equals(newString2)){
            System.out.println("It is an anagram.");
        }
        else{
            System.out.println("It is not an anagram.");
        }

        sc.close();
    }
}
