import java.util.Scanner;

public class conditionalStatement {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>y){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }

        sc.close();

    }
    
}
