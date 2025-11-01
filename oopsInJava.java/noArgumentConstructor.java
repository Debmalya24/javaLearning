class Dog{
    String name;

    Dog(){
        name="Rajapalyam";
    }
}
public class noArgumentConstructor {
    public static void main(String a[]){

        Dog d1=new Dog();
        System.out.println("The name of the breed of the dog will be: "+d1.name);
    }
}
