class employee{
    String name;
    static String office;

    static{
        System.out.println("Joining letter has been realeased.");
    }

    public void show(){

        System.out.println(name+" Works in "+office);

    }
}
public class classLoadingOnly {

    public static void main(String a[]) throws Exception{
        Class.forName("employee");
        employee.office="TCS";
    }
    
}
