class ScientificCalculator extends AdvanceCalculator{ //subclass of AdvanceCalculator can say that son class
    public int remainder(int a,int b){ 
        return(a%b);
    }

    public double power(int a,int b){
        return(Math.pow(a,b));
    }
} 
class AdvanceCalculator extends BasicCalculator{//subclass of BasicCalculator can say that father class
    public int multi(int a,int b){
        return(a*b);
    }

    public int div(int a,int b){
        return(a/b);
    }
}
class BasicCalculator{ //superclass can say that grand father class
    public int add(int a,int b){
        return (a+b);
    }
    public int sub(int a,int b){
        return(a-b);
    }
}
public class multipleInheritance {
    public static void main(String a[]){
        ScientificCalculator s=new ScientificCalculator();
        System.out.println("Addition : "+(s.add(10,20)));
        System.out.println("Subtraction: "+(s.sub(20,5)));
        System.out.println("Multiplication: "+(s.multi(20,10)));
        System.out.println("Division: "+(s.div(20,10)));
        System.out.println("Remainder: "+(s.remainder(16,5)));
        System.out.println("Power: "+(s.power(20,5)));

    }
}
