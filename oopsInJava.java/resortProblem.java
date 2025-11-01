import java.util.*;
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    Resort(int resortId,String resortName,String category,double price,double rating){

        this.resortId=resortId;
        this.resortName=resortName;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }

    public int getResortId(){
        return resortId;
    }

    public String getResortName(){
        return resortName;
    }

    public String getCategory(){
        return category;
    }

    public double getPrice(){
        return price;
    }

    public double getRating(){
        return rating;
    }

    public void setResortId(int resortId){
        this.resortId=resortId;
    }

    public void setResortName(String resortName){
        this.resortName=resortName;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public void setRating(double rating){
        this.rating=rating;
    }
}
public class resortProblem {

    public static double findAvgPriceByCategory(Resort arr[],String givenCategory){

        double  sum=0;
        double count=0;

        for(Resort r : arr){
            if(r.getRating()>4 && r.getCategory().equalsIgnoreCase(givenCategory)){
                sum+=r.getPrice();
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        
        double avg=(sum/count);
        return avg;
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs : ");
        int n=Integer.parseInt(sc.nextLine());

        Resort arr[]=new Resort[n];

        for(int i=0;i<n;i++){
            int id=Integer.parseInt(sc.nextLine());
            String resortName=sc.nextLine();
            String category=sc.nextLine();
            double price=Double.parseDouble(sc.nextLine());
            double rating= Double.parseDouble(sc.nextLine());

            arr[i]=new Resort(id,resortName,category,price,rating);
        }

        String givenCategory=sc.nextLine();
        double  res=findAvgPriceByCategory(arr,givenCategory);

        if(res >0){
            System.out.println("The avg price of the "+givenCategory+" will be : "+res);
        }
        else{
            System.out.println("There are no such avilable resort ");
        }

        sc.close();
    }
}
