import java.util.Scanner;

public class countFrequencyOfCharMethod2 {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the Charecter : ");
        char ch=sc.next().charAt(0);

        int count=0;

        for(char c: str.toCharArray()){

            if(c==ch){
                count=count+1;
            }

        }

        System.out.println("The number of occurence of charecter will be : "+count);
        sc.close();
    }
}
