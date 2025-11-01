import java.util.Scanner;
public class input_output_array {

    public static void main(String a[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("The size of the array will be : ");
        int n=sc. nextInt() ;
        int arr[]=new int[n];

        System.out.print("The elements are : ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        // printing output

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();


    }
    
}
