//import java.util.*;

class A extends Thread{
    public void run(){

        for(int i=0;i<100;i++)
        System.out.println("A is running .");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    public void run(){

        for(int i=0;i<100;i++)
        System.out.println("B is running .");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}
public class ThreadesExample {
   public static void main(String args[]) {

    A obj1=new A();
    B obj2=new B();
    //bj2.setPriority(Thread.MAX_PRIORITY);
    //obj1.setPriority(Thread.MAX_PRIORITY);
    obj1.start();
   
   /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
    }*/
   
    obj2.start();
    
   }
}
