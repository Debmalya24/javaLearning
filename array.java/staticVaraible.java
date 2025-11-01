
class employee{
    String name;
    static String organization;

    public void print(){
        System.out.println(name+" Works in "+organization);
    }
}
public class staticVaraible {

    public static void main(String a[]){
        employee .organization="TCS";

        employee e1=new employee();
        e1.name="Debmalya";
        employee e2=new employee();
        e2.name="Sneha";
        employee e3=new employee();
        e3.name="Sambit";

        e1.print();
        e2.print();
        e3.print();

    }
    
}
