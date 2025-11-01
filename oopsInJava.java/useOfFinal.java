class A{
    public final void credit(){
        System.out.println("Debmalya's creation");
    }
    public void show(){
        System.out.println("A is running....");
    }
}
 class B extends A {
    /* public final void credit(){
        System.out.println("Debmalya's creation");
    } */

    public void show(){
        System.out.println("B is running....");
    }
    
} 
public class useOfFinal {
    public static void main(String a[]){
        final double pie=3.14; // after using final keyword will not be able to change the value pie
        System.out.println(pie);

        A obj=new A();
        obj.credit();
        obj.show();

        obj=new B();
        obj.credit();
        obj.show();
    }
}
