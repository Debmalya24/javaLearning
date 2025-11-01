import java.util.Scanner;

public class removingSpaces {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String trimmed=str.trim();
        if(trimmed.isEmpty()){
            System.out.println("No string is there");
        }
        String arr[]=trimmed.split("\\s+");
        String newArr="";

        for(String f:arr){
            newArr=newArr.concat(f);
        }
        System.out.println(newArr);
        sc.close();
    }
    
}
