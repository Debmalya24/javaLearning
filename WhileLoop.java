
public class WhileLoop{
    public static void main(String a[]){

        int i=0;

        while(i<=5){
            System.out.print("Hello !!");

            int j=0;

            while(j<=0){ //nested loop
                System.out.println("I am Debmalya Roy");
                j++;
            }
            i++;
        }

    }
}
