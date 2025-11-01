class outer{
    static int a=10;
    static class Inner{
        public void show(){
            System.out.println("I am static nested class and I can access the outer class members.here is the proof "+a);
        }
    }
}
public class staticNestedClass {
    public static void main(String a[]){
        outer.Inner obj=new outer.Inner();
        obj.show();
    }
}
