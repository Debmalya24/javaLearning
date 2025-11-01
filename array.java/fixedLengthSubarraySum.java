import java .util.Scanner;
class maxSubarraysum{
    public int maxSumOfSubarray(int arr[],int n,int k){

        int windowSum=0;
        int maxiSum=0;

        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxiSum=windowSum;

        for(int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            maxiSum=Math.max(maxiSum,windowSum);
        }

        return maxiSum;

    }
}
public class fixedLengthSubarraySum {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array : ");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter the element of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k;
        System.out.print("Enter the size of the window : ");
        k=sc.nextInt();

        maxSubarraysum obj=new maxSubarraysum();

        int res=obj.maxSumOfSubarray(arr,n,k);

        System.out.print("The maximum sum of the subarray will be : "+res);

        sc.close();
    }
    
}
