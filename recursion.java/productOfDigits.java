class DigitsProduct{
    public int resultProduct(int n){
        if(n==0){
            return 1;
        }

        return (n%10)*resultProduct(n/10);
    }
}
public class productOfDigits {
    public static void main(String a[]){
        int n=1234;
        DigitsProduct obj=new DigitsProduct();
        int res=obj.resultProduct(n);
        System.out.println(res);

    }
}
