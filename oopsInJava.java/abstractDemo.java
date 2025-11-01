abstract class human{
    public  void eat(){
        System.out.println("loves to eat....");
    }
    public  void walk(){
        System.out.println("Loves to walk");
    }
}

class Debmalya extends human{
    public void look(){
        System.out.println("He looks good");
    }
}
abstract class Animal{
    public  abstract void sound();
    public void eat(){
        System.out.println("It eats....");
    }
}
class dog extends Animal{
    public void sound(){
        System.out.println("It Barks....");
    }
}
public class abstractDemo {
    public static void main(String a[]){

        Animal obj=new dog();
        obj.sound();
        obj.eat();

        Debmalya obj2=new Debmalya();
        obj2.eat();
        obj2.walk();
        obj2.look();
    }
}
