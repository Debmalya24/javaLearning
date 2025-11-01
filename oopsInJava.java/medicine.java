import java.util.*;
class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    Projector(int projectorId,String projectorName, int price,int rating,String availableIn){
        this .projectorId=projectorId;
        this .projectorName=projectorName;
        this.price=price;
        this.rating=rating;
        this.availableIn=availableIn;
    }

    public int getProjectId(){
        return projectorId;
    }
    public String getprojectorName(){
        return projectorName;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }

    public String getavailableIn(){
        return availableIn;
    }

    public void setProjectId(int projectorId){
         this .projectorId=projectorId;
    }
    public void setprojectorName(String projectorName ){
         this .projectorName=projectorName;
    }
    public void setprojectorName(int projectorId){
         this .projectorId=projectorId;
    }
    public void setPrice(int price){
         this .price=price;
    }
    public void setavailableIn(String availableIn){
         this .availableIn=availableIn;
    }

}
public class medicine {

    public static Projector findMaximumPriceByRating ( Projector arr[],int rating){

        Projector maxProject=null;
        int maxPriced=Integer.MIN_VALUE;

        for(Projector p: arr){
            if(p.getRating()>rating && p. getavailableIn().equalsIgnoreCase("TataCliq")){
                if(p.getPrice()>maxPriced){
                    maxPriced=p.getPrice();
                    maxProject=p;

                }

            }
        }

        return maxProject;
    }

    public static void main(String a[]){
            Scanner sc=new Scanner (System.in);
            Projector arr[]=new Projector[4];

            for(int i=0;i<4;i++){

                int id=Integer.parseInt(sc.nextLine());
                String name=sc.nextLine();
                int prie=Integer.parseInt(sc.nextLine());
                int rating = Integer.parseInt(sc.nextLine());
                String available = sc.nextLine();

                arr[i]=new Projector(id, name, prie, rating, available);

            }
            int ratingInput = Integer.parseInt(sc.nextLine());

      
           Projector result = findMaximumPriceByRating(arr, ratingInput);

      
        if (result != null) {
            System.out.println(result. getProjectId());
        } else {
            System.out.println("No such Projector");
        }
        sc.close();
    }
    
}
