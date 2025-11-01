class B extends A{

    public B(){
        super();
        System.out.println("Int B constructor");
    }
    public B(int a){
        super(4);
        
        System.out.println("Int B constructor parameterized");
    }
}
class A{

    public A(){
        super();
        System.out.println("Int A constructor");
    }
    public A(int b){

        super();
        System.out.println("Int A constructor parameterized");

    }

}
public class thisAndSuperMethod {
    public static void main(String a[]){
        B obj=new B(3);
        
    }
}
