enum lap{
    dell(50000),
    mac(145000),
    hp(80000);

    private int price;
    lap(int price){
        this . price = price;
    }

    public int getPrice(int price){
        return this.price;
    }
}
public class enumAdvance {
    public static void main(String arg[]){

        for(lap la: lap.values()){
            System.out.println(la +" price is : "+ la.getPrice(0));
        }
    }
}
