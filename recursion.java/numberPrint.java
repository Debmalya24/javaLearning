class Numbers{
    public static void natuarlNum(int n){
        if(n==5){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        natuarlNum(n+1);

    }
}

public class numberPrint {
    public static void main(String a[]){
        Numbers.natuarlNum(1);
    }
}
