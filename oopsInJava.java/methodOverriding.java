class Calc{
    public int add(int a,int b){
        return (a+b);
    }
}
class newCal extends Calc{
    public int add(int a,int b){ //this is method oveririding
        return(a+b+1); 
    }
}
public class methodOverriding {
   public static void main(String a[]){
    newCal obj=new newCal();
    int ans=obj.add(3,4);
    System.out.println("the result will be : "+ans);
   } 
}
