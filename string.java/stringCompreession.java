import java.util.*;
public class stringCompreession {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the string : ");
        String str=sc.nextLine();

        LinkedHashMap<Character,Integer>freq=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            int count=freq.getOrDefault(str.charAt(i),0);
            freq.put(str.charAt(i),count+1);
        }

        for(char key :freq.keySet()){
            System.out.print(key+""+freq.get(key));
        }
        sc.close();

    }
}
