class Dog{

    String name;
    int age;
    String colour;

    Dog(String name){
        this.name=name;
    }
    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    Dog(String name,int age,String colour){
        this.name=name;
        this.age=age;
        this.colour=colour;
    }

}
public class  OverloadingInConstructor{
    public static void main(String a[]){

        Dog d1=new Dog("German Sephard");
        Dog d2=new Dog("Rajapalyam",3);
        Dog d3=new Dog("Mudhol Hound",2,"White");
        System.out.println("this is very famous "+d1.name);
        System.out.println("this is very famous "+d2.name+" and it's age is "+d2.age);
        System.out.println("this is very famous "+d3.name+" and it's age is "+d3.age+" and its colour is "+d3.colour);
    }
}

