import java.util.*;
class binary{
    public static int findValue(int arr[],int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid] <target){
            return findValue(arr, target, mid+1, end);
        }
        else{
            return findValue(arr, target, start, mid-1);
        }
    }
}

public class binarySearch {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the array  : ");
        int n=Integer.parseInt(sc.nextLine());
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of the target  : ");
        int target=sc.nextInt();

        int start =0;
        int end=n-1;
        int res=binary.findValue(arr,target,start,end);

        System.out.println(res);
        sc.close();

    }
}
