class Students{
    private String name;
    private int age;

    Students(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

}
public class constructor {
    public static void main(String a[]){
        Students s1=new Students("Debmalya",22);
        Students s2=new Students("Tushar",23);

        System.out.println(s1.getName()+" is "+s1.getAge()+" years old.");
        System.out.println(s2.getName()+" is "+s2.getAge()+" years old.");

        s1.setName("Deb");
        s1.setAge(23);
        System.out.println(s1.getName()+" is "+s1.getAge()+" years old.");
    }
}
