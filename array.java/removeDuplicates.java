//package array.java;
import java.util.Scanner;
import java.util.Arrays;

class removingDuplicates{

    public int ans(int arr[],int n){

        Arrays.sort(arr);

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j] !=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return (i+1);
    }
}

public class removeDuplicates {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter the elements of the array : ");

        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        removingDuplicates obj =new removingDuplicates();
        int res=obj.ans(arr,n);

        System.out.println("After removing duplicates the size of the array will be : "+ res);

        sc.close();

    }

    
}
