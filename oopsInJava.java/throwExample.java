import java.util.*;
public class throwExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();

        try{
            IsVoteEligible(age);
        }

        catch(ArithmeticException e){
            System.out.println("There is some error :" +e.getMessage());
        }

        System.out.println("Program continues smoothly... ");

        sc.close();

    }

    public static void IsVoteEligible(int age){
        if(age<18){
            throw new ArithmeticException("Age is bellow 18");
        }

        else{
            System.out.println("completely eligible for voting");
        }
    }
}
