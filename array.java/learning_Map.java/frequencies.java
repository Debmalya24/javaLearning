import java.util.Scanner;
import java.util.HashMap;

public class frequencies {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array : ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int i=0;i<n;i++){
            int count=freq.getOrDefault(arr[i],0);
            freq.put(arr[i],count+1);
        }

        for(int key:freq.keySet()){
            System.out.println(key+" : "+freq.get(key));
        }

        sc.close();

    }
    
}
