abstract class Demo{
    public abstract void show();
}
public class AnonymousInnerClass {
    public static void main(String a[]){
        Demo obj=new Demo(){
            public void show(){
                System.out.println("It is an example of anonymous inner class ");
            }
        };

        obj.show();

    }
}
