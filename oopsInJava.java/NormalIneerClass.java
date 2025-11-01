class Outer{
    String name="I am outer class";
    class Inner{
        public void show(){
            System.out.println("I am inner class and i can access outer class members and here is the prove "+name);
        }
    }
}
public class NormalIneerClass {
    public static void main(String arg[]){
        Outer obj=new Outer();
        Outer.Inner obj2=obj.new Inner();
        obj2.show();
    }
}
