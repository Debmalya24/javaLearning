import java.util.*;
public class countVowels {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A' ||str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'
            ||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){

                count++;

            }
        }

        System.out.println("The number of vowels in the string will be :  "+count);
        sc.close();
    }
    
    
}
