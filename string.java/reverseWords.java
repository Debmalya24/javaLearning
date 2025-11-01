import java.util.*;
public class reverseWords {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str=sc.nextLine();
        StringBuffer newString=new StringBuffer();


        String trimmed=str.trim();
        String arr[]=trimmed.split("\\s+");

        int startIndex=0;
        int endIndex=arr.length-1;

        while(startIndex<endIndex){
            String temp=arr[startIndex];
            arr[startIndex]=arr[endIndex];
            arr[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
        String result=String.join(" ",arr);
        System.out.println(result);

        for(String s:arr){
            newString.append(s);
            newString.append(" ");
        }

        System.out.println(newString);

        sc.close();

    }
    
}
