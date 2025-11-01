import java.util.*;
class PalindromeOrNot {
    public static int isPalindrome(int digitCount,int n){
        if(n==0){
            return 0;
        }
        return (n%10)*(int)Math.pow(10,digitCount-1)+isPalindrome(digitCount-1,n/10);
    }
}
class helper{
    public int isPalindromeHelper(int n){
        int digitCount=(int)(Math.log10(n))+1;
        return PalindromeOrNot.isPalindrome(digitCount,n);
    }
}

public class plaindromeNum {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        helper obj=new helper();
        int res=obj.isPalindromeHelper(n);
        if(res==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

        sc.close();

    }
}
