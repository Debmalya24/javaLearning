import java.util.*;
public class ifStringContainsOnlyDigit {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();

        boolean flag=true;

        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);

            if(!(Character.isDigit(ch))){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("All are digit.");
        }
        else{
             System.out.println("All are not digit.");
        }

        sc.close();

    }
}
