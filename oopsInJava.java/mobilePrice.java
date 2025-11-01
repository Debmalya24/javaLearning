import java.util.*;

class Mobile{
    private int mobileId;
    private String mobileName;
    private int price;
    private int rating;
    private String availableIn;

    Mobile (int mobileId,String mobileName, int price,int rating,String availableIn){
        this .mobileId=mobileId;
        this .mobileName=mobileName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;
    }

    public int getmobileId(){
        return mobileId;
    }
    public String getmobileName(){
        return mobileName;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }

    public String getAvailableIn(){
        return availableIn;
    }

    public void setmobileId(int mobileId){
         this .mobileId=mobileId;
    }
    public void setmobileNameName(String mobileName ){
         this .mobileName=mobileName;
    }
    public void setRating(int rating){
         this .rating=rating;
    }
    public void setPrice(int price){
         this .price=price;
    }
    public void setavailableIn(String availableIn){
         this .availableIn=availableIn;
    }
}
public class mobilePrice {

    public static Mobile findMaximumPriceByRating(Mobile arr[],int givenRating){
        Mobile maxId=null;
        int maxPriced=Integer.MIN_VALUE;

        for(Mobile m: arr){
            if(m.getRating()>givenRating && m.getAvailableIn().equalsIgnoreCase("Amazon")){
                if(m.getPrice()>maxPriced){
                    maxPriced=m.getPrice();
                    maxId=m;

                }
            }
        }

        return maxId;
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs : ");
        int n=Integer.parseInt(sc.nextLine());

        Mobile arr[]=new Mobile[n];

        for(int i=0;i<n;i++){
            int id=Integer.parseInt(sc.nextLine());
            String name=sc.nextLine();
            int price=Integer.parseInt(sc.nextLine());
            int rating=Integer.parseInt(sc.nextLine());
            String avilable=sc.nextLine();

            arr[i]=new Mobile(id,name,price,rating,avilable);
        }

        int givenRating=Integer.parseInt(sc.nextLine());

        Mobile res=findMaximumPriceByRating(arr,givenRating);

        if(res!=null){
            System.out.println("The mobile id will be : "+res.getmobileId());
        }
        else{
            System.out.println("No such Mobile");
        }
        sc.close();
    }
}
