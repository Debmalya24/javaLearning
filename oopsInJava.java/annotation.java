class A{
    public void show(){
        System.out.println("A is running...");
    }
}
class B extends A{
    @Override
     public void show(){
        System.out.println("B is running...");
    }
}
public class annotation {
    public static void main(String arg[]){
        B obj=new B();
        obj.show();
        
    }
}
