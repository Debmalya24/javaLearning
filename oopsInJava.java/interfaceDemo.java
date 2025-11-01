interface Switch{
    void on();//must have to on;
    void off();// must have to off;
}

class Fan implements Switch{
    public void on(){
        System.out.println("Fan is on");
    }
    public void off(){
        System.out.println("Fan is off");
    }
}
class Tv implements Switch{
     public void on(){
        System.out.println("Tv is on");
    }
    public void off(){
        System.out.println("Tv is off");
    }
}
public class interfaceDemo {
    public static void main(String a[]){
        Switch obj;
        obj=new Fan();
        obj.on();
        obj.off();

        obj=new Tv();
        obj.on();
        obj.off();
    }
}
