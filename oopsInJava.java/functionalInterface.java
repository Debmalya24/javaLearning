@FunctionalInterface
interface InnerfunctionalInterface {
    public void show();   
} 
public class functionalInterface {
    public static void main(String args[]){
        InnerfunctionalInterface obj=new InnerfunctionalInterface(){
            public void show(){
                System.out.println("Show must go on...");
            }
        };
        obj.show();
    }
}
