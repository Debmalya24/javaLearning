import java.util.*;
public class stringCompressionAlternate {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        StringBuffer res=new StringBuffer();

        int count=1;

        for(int i=1;i<=str.length();i++){
            if(i<str.length()&&(str.charAt(i)==str.charAt(i-1))){
                count++;
            }
            else{
                res.append(str.charAt(i-1)).append(count);
                count=1;

            }
        }

        System.out.println(res);
        sc.close();
    }
}
