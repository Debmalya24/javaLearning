class Students{
    String name;
    int age;

    Students(String name,int age){
        this.name=name;
        this. age=age;
    }
}
public class paarameterizedConstructor {

    public static void main(String a[]){

        Students s1=new Students("Debmalya",22);
        Students s2=new Students("Tushar",23);

        System.out.println(s1.name+" is "+s1.age+" years old.");
        System.out.println(s2.name+" is "+s2.age+" years old.");
    }
}
