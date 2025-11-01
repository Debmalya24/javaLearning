import java.util.Scanner;
public class forEachLoop{

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        //for each loop

        System.out.println("After printing the elements will be : ");
        
        for(int ans: arr){
            System.out.print(ans+"  ");
        }

        sc.close();
    }
}