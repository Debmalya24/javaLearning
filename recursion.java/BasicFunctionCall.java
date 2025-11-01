class functionCall{

    public void numberPrint(int n){
        System.out.println(n);
        numberPrint1(2);
    }
    
    public void numberPrint1(int n){
        System.out.println(n);
        numberPrint2(3);
    }
    
    public void numberPrint2(int n){
        System.out.println(n);
        numberPrint3(4);
    }
    
    public void numberPrint3(int n){
        System.out.println(n);
    }


}
public class BasicFunctionCall {
    public static void main(String a[]){

        functionCall f=new functionCall();
        f.numberPrint(1);

    }
}
