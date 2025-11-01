import java.util.*;
class arraySum{
    public void longestSubarraySum(int arr[],int k,int n){

        int sum=0;
        int start=0;
        int end=0;
        int maxLen=0;

        HashMap<Integer,Integer>hashMap=new HashMap<>();

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==k){
                maxLen=1+i;
                start=0;
                end=i;
            }

            if(hashMap.containsKey(sum-k)){
                int previdx=hashMap.get(sum-k);

                if((i-previdx)>maxLen){

                    maxLen=i-previdx;
                    start=previdx+1;
                    end=i;

                }
            }

            if(hashMap.containsKey(sum)){
                hashMap.put(sum,k);
            }
        }

        System.out.println("the size of the maximum sub  array sum : "+maxLen);

        if(end !=-1){

            System.out.print("the sub array will be : ");

            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.print("\"No subarray with given sum found.");
        }
    }
}
public class longestSubarraySumLessThank {

    public static void main(String a[]){
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
