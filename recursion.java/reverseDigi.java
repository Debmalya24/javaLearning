public class reverseDigi {
    public static void main(String a[]){
        int n=124;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rem+(rev*10);
            n/=10;
        }
        System.out.println(rev);
    }
}
