class palindromeOrNot{
    int sum=0;
    public int isPalindrome(int n){
        if(n==0){
            return sum;
        }

        int rem=n%10;
        sum=rem+(sum*10);
        return isPalindrome(n/10);
    }
}
public class IsPalindrome {
    public static void main(String arg[]){
        int n=1213;
        palindromeOrNot obj=new palindromeOrNot();
        int res=obj.isPalindrome(n);

         if(res==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }


    }
}
