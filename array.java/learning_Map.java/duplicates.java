import java.util.Scanner;
import java.util.HashMap;

public class duplicates {

    public static void main(String a[]){
         Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array : ");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer>duplicates=new HashMap<>();

        for(int i=0;i<n;i++){
            int count=duplicates.getOrDefault(arr[i],0);
            duplicates.put(arr[i],count+1);
        }

        System.out.println("Duplicates elements in the array are : ");

        for(int key:duplicates.keySet()){
            if(duplicates.get(key)>1){
                System.out.println(key + " : "+duplicates.get(key));
            }
        }

        sc.close();

    }
    
}
