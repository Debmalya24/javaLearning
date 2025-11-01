interface WithParameter{
    void show(int a);
}
public class withParameterLambdaFunction {
    public static void main(String args[]){
        WithParameter obj=(a)-> 
                System.out.println("The ans it should return "+a);

        obj.show(5);
    }
}
