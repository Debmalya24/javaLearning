
class calculator{

    public  int add(int a, int b){

        return (a+b);
    }
}


public class demoClassAndObj {

    public static void main(String a[]){

        int num1=10;
        int num2=20;

        calculator calc=new calculator();

        int res=calc.add(num1,num2);
        System.out.println("The sum of  "+ num1+" and "+num2+" is : "+res);


    }
    
}
