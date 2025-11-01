import java.util .Scanner;
public class enHancedLoop {

    public static void main( String a[]){

        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //enhanced for loop
        System.out.println("After printing the elements will be : ");

        for(int ans: arr){
            System.out.print(ans + " ");
        }
        sc.close();

    }
}
