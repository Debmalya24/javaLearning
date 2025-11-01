import java.util.*;
public class removeDuplicates {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        StringBuffer str=new StringBuffer(sc.nextLine());

       StringBuffer newString=new StringBuffer();
       

        LinkedHashSet<Character>set=new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }

        for(char ch : set){
            newString.append(ch);
        }

       
        System.out.println("New string will be : "+newString);
        sc.close();
    }
    
}
