import java.util.Scanner;

public class maximumOfThreeNumbers{

    public static void main(String a[]){
        Scanner sc=new Scanner (System.in);

        System.out.print("The first number is : ");
        int x=sc.nextInt();

        
        System.out.print("The second number is : ");
        int y=sc.nextInt();

        
        System.out.print("The third number is : ");
        int z=sc.nextInt();


        if(x>y && x>z){
            System.out.println("The greatest of these three will be : " +x);
        }
        else if(y>z){
            System.out.println("The greatest of these three will be : " +y);

        }
        else{
            System.out.println("The greatest of these three will be : " +z);
        }

        sc.close();

    
    }
    
}

