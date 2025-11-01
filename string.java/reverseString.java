import java .util.*;
public class reverseString {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        char arr[]=str.toCharArray();

       int start=0;
       int end=arr.length-1;

       while(start<end){
         char temp=arr[start];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
        }

        String reversed=new String(arr);
        System.out.println("the reverse  String will be : "+reversed);

        //method 2;
        System.out.print("Enter the String: ");
        StringBuffer  rev=new StringBuffer(sc.nextLine());
        rev.reverse();
        System.out.print("the reverse  String will be : "+rev);


        sc.close();


    }
    
}
