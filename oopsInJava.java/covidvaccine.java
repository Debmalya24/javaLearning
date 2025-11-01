import java.util.*;
class covaccine{
    private String name;
    private int age;
    private boolean Vaccinated;

    public void setName(String name){

        if(name==null || name.isEmpty() ){
            System.out.println("Invalid name.");
            System.exit(0);
        }
        else{
            this.name=name;
        }

    }

    public String getName(){
        return name;
    }

    public void  setAge(int age){
        if(age<0 || age>150){
          System.out.println("Age is invalid.");
          System.exit(0);
        }
        else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

    public void SetCovaccine(boolean Vaccinated ){
       this.Vaccinated=Vaccinated;
    }

    public void isGetCovaccine(){
        if(Vaccinated){
            System.out.println("Has got the vaccination");
        }
        else{
            System.out.println("Has not got the vaccination");
        }
    }

}

public class covidvaccine {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System .out.print("Enter name: ");
        String name=sc.nextLine();
        System .out.print("Enter age: ");
        int  age=sc.nextInt();
        System .out.print("is Vaccinated: ");
        String vacInput = sc.next();
        boolean Vaccinated = vacInput.equalsIgnoreCase("yes");


        covaccine obj1=new covaccine();

        
        
        obj1.setName(name);
        
        obj1.setAge(age);
        obj1.SetCovaccine(Vaccinated);

        

        System.out.print(obj1.getName()+" is the age "+obj1.getAge()+" ");
        obj1.isGetCovaccine();
        sc.close();
    }
    
}
