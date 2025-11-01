import java.util.*;
public class twostringAreRotationOfeachOther {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1=sc.nextLine();
        System.out.print("Enter the second string : ");
        String str2=sc.nextLine();


        if(str1.length() !=str2.length()){
            System.out.print("404 Eroor !!");
        }
        else{
            String addString=str1+str1;
            if(addString.contains(str2)){
                System.out.print("Two Strings are rotation of each other.");
            }
            else{
                System.out.print("Two Strings are not rotation of each other.");
            }
        }

        sc.close();
    }
}
