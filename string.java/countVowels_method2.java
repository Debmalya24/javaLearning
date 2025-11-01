import java.util.*;
public class countVowels_method2 {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
       
        String str=sc.nextLine();

        int count=0;

        String lower=str.toLowerCase();

        for(int i=0;i<lower.length();i++){
            if(lower.charAt(i)=='a'||lower.charAt(i)=='e'||lower.charAt(i)=='i'||lower.charAt(i)=='o'||lower.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The number of vowels in the string will be :  "+count);
        sc.close();
    }
    

}
