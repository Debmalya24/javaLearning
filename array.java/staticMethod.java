class employee{
    String name;
    static String company;

    public void show(){
        System.out.println(name+" Works in "+company);
    }

    public static void show1(employee e1){
        System.out.println(e1.name+" Works in "+company);
    }
}

public class staticMethod {

    public static void main(String a[]){

        employee .company="TCS";

        employee e1=new employee();
        e1.name="Debmalya Roy";
        employee e2=new employee();
        e2.name="Sambit Mitra";
        e1.show();
        e2.show();
        employee.show1(e1);
    }
    
}
