interface NoParameter {
 void show();
    
} 
public class noParametersLambda {
    public static void main(String args[]){
        NoParameter obj=()->
            System.out.println("Show must go on...");
        obj.show();
    }
}
