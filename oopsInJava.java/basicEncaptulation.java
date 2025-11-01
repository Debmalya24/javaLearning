class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
       return name;
    }

    public void SetAge(int age){
        this.age=age;
    }

    public int getAge(){
       return age;

    }


}
public class basicEncaptulation {

    public static void main(String a[]){

        Human obj1=new Human();
        obj1.setName("Deb");

        obj1.SetAge(22);

       System.out.println(obj1.getName() + " : "+obj1.getAge());
      

    }
    
}
