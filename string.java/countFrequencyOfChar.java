import java.util.*;
public class countFrequencyOfChar {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the Charecter : ");
        char ch=sc.next().charAt(0);
        HashMap<Character,Integer>freq=new HashMap<>();

        for(int i=0;i<str.length();i++){
            int count=freq.getOrDefault(str.charAt(i),0);
            freq.put(str.charAt(i),(count+1));
        }

        for(Character key : freq.keySet()){
            if(key==ch){
                System.out.println("The occurence of the charecter will be : "+freq.get(key));
            }
        }
        sc.close();

    }
    
}
