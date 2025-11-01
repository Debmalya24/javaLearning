class Car{
    static String name;
    private String colour;
    private int price;

    public Car(){
       colour="Red";
       price=9000000;
    }

    public String toString(){
        return "car name : "+name+" colour name: "+colour+" price : "+price;
    }


}

public class constructorBasic {

    public static void main(String a[]){

        Car.name="BMW";
        Car car1=new Car();
        System.out.println(car1);
  
    }
    
}
