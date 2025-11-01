import java.util.*;
public class countWords {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String trimmed=str.trim();

        int wordCount;

        if(trimmed.isEmpty()){
            wordCount=0;

        }
        else{
            wordCount=trimmed.split("\\s+").length;
        }

        System.out.println("The number of words in a string will be : "+wordCount);
        sc.close();

    }
    
}
