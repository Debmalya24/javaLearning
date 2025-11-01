class outer{
    int x=10;
    public void display(){

        class Inner{
            public void show(){
                System.out.println("I am method local inner class and I can access outer class methods"+x);
            }
        }
        // create object of inner class
        Inner obj=new Inner();
        obj.show();
    }
}
public class methodLocalInnerClass {
    public static void main(String args[]){
        outer obj2=new outer();
        obj2.display();
    }
}
