class A{

    public void show(){
        System.out.println("claa A's show is running....");
    }
}
class B extends A{
    public void show(){
        System.out.println("claa B's show is running....");
    }
    public void does(){
        System.out.println("claa B's does is running....");
    }
}
public class typeCasting {
    public static void main(String a[]){

        A obj=new B();//this is upper casting 
        obj.show();

        B obj1= (B) obj;// this is down casting 
        obj1.show();
        obj1.does();

    }
}
