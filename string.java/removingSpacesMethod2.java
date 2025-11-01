import java.util.*;
public class removingSpacesMethod2 {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        str=str.replaceAll("\\s+","");
        System.out.print("The new string will be : "+str);
        sc.close();
    }
    
}
