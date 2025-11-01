import java.util.Scanner;

class arraySum{
    public void longestSubarraySum(int arr[],int k,int n){

        int r=0;
        int l=0;
        int sum=0;
        int maxlen=0;
        int right_idx=-1;
        int left_idx=0;

        while(r<n){

            sum+=arr[r];

            while(sum>k && l<=r){
                sum-=arr[l];
                l++;
            }

            if((r-l+1)>maxlen){
                maxlen=r-l+1;
                right_idx=r;
                left_idx=l;
            }
            r++;
        }

        System.out.println("The length will be : "+ maxlen);

        System.out.println("the subarray will be : ");

        for(int i=left_idx;i<=right_idx;i++){
             System.out.print(arr[i]+" ");
        }

    }
}
public class longestSubarraySum {

    public static  void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k;
        System.out.print("Enter the target: ");
        k=sc.nextInt();
        arraySum obj=new arraySum();

        obj.longestSubarraySum(arr,k,n);
        
        sc.close();
    }
    
}
