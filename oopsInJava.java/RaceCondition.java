class counting {
    int count;
    synchronized public void  show(){
        count++;
    }
}
public class RaceCondition {
    public static void main(String args[]) throws InterruptedException{
        counting obj=new counting();
        Runnable obj1 = () -> {
        for(int i=1;i<=10000;i++){
            obj.show();
        }
    };
    Runnable obj2=()->{
        for(int i=1;i<=10000;i++){
            obj.show();
        }
    };
   
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    
    System.out.println(obj.count);
    }

}
