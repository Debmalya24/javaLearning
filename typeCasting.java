public class typeCasting{

    public static void main(String a[]){
        int num=202;
        byte b=6;
        num=b;//implicit type casting
        System.out.println(num);

        b=(byte)num;
        System.out.println(b);

        float num2=98.54f;
        int num1=(int)num2;//explicit type conversion
        System.out.println(num1);

        byte x=10;
        byte y=30;
        int res=x*y;//type promotion
        System.out .println(res);

    }

}
