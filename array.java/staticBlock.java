
class office{

    String name;
    static String company;

    static{
        System.out.println("Joining letter has been realesed");
    }

    public static void show(office o2){
        System.out.println(o2.name+" Works in "+company);

    }

}

public class staticBlock {

    public static void main(String a[]){
        office .company="TCS";
        office o1=new office();
        o1.name="Sambit Mitra";

        office o2=new office();
        o2.name="Debmalya Roy";

        office.show(o2);

    }
    
}
