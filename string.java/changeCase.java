import java.util.*;
public class changeCase {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuffer str=new StringBuffer(sc.nextLine());

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
                
            }
            str.setCharAt(i,ch);
        }
        System.out.println("the string will be : "+str);
        sc.close();

    }
    
}
