
class  calculator{

    public int add(int n1,int n2){

        return (n1+n2);
    }

    public int add(int n1,int n2,int n3){
        return (n1+n2+n3);
    }
}
public class methodOverloading {
    public static void main(String a[]){

        calculator calc=new calculator();

        int res=calc.add(2,3,5);
        System.out.println(res);
    }
}
