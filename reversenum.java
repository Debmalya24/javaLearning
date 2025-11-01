class reverse{

    public int reversedigit(int num){

    int reverse =0;
    while(num!=0){
        int lastdigit=num%10;
        reverse=reverse*10+lastdigit;
        num=num/10;
    }

    return reverse;

    }
}
public class reversenum{

    public static void main(String a[]){

        int num=100;
        reverse obj=new reverse();
        int res=obj.reversedigit(num);

        System.out.println("After reverse the digit will be : "+res);


    }
}