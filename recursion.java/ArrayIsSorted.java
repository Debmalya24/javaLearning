import java.util.*;
class checkSorted{
    public boolean isSorted(int arr[],int index){
        int n=arr.length;
        if(index==n-1){
            return true;
        }

        return (arr[index]<arr[index+1]) && isSorted(arr,index+1);
    }
}
public class ArrayIsSorted {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements  of the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        checkSorted obj=new checkSorted();
        boolean result=obj.isSorted(arr, 0);
        if(result){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
        sc.close();
    }
}
