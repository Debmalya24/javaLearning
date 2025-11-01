class Bike{
    String name;
    int price;
}

public class defaultConstructor {
    public static void main(String a[]){
        Bike b1=new Bike();
        b1.name="Honda";
        b1.price=189000;
        System.out.println(b1.name+" : "+b1.price);

        Bike b2=new Bike();
        b2.name="Royal Enfield";
        b2.price=456000;
        System.out.println(b2.name+" : "+b2.price);
    }
}
