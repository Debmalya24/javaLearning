import java.util.*;
public class frequencyOfEchCharecter {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  string : ");
        String str=sc.nextLine();

        HashMap<Character,Integer>freq=new HashMap<>();

        for(int i=0;i<str.length();i++){

            int count=freq.getOrDefault(str.charAt(i),0);
            freq.put(str.charAt(i),count+1);
        }

        for(char key :freq.keySet()){
            System.out.println(key+" : "+freq.get(key));
        }

        sc.close();
    }
}
