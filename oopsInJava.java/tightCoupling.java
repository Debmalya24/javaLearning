class Tv{
    public void on(){
        System.out.println("Tv is on");
    }
    public void off(){
        System.out.println("Tv is off");
    }
}

public class tightCoupling {
    public static void main(String a[]){
        Tv t=new Tv();
        t.on();
        t.off();
    }
}
