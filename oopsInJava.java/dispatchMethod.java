class A{
    public void show(){
        System.out.println("A is running....");
    }
}
class B extends A{
    public void show(){
        System.out.println("B is running....");
    }
}
class C extends A{
    public void show(){
        System.out.println("C is running....");
    }
}

public class dispatchMethod {
    public static void main(String a[]){
        A obj=new A();
        obj.show();// will print (A is running....)

        obj=new B();
        obj.show();//will print (B is running....)

        obj=new C();
         obj.show();//will print (C is running....)
        
    }
}
