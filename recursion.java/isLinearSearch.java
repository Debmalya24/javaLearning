import java.util.Scanner;
class checkTarget{

    public boolean isFound(int arr[],int target,int index){
        int n=arr.length;
        if(index==n){
            return false;
        }

        return (arr[index]==target) || isFound(arr,target,index+1);
    }
}
public class isLinearSearch {
    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements  of the array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element : ");
        int target=sc.nextInt();

        checkTarget obj=new checkTarget();
        boolean result=obj.isFound(arr, target, 0);
        if(result){
            System.out.println("Element found in the array");
        }
        else{
            System.out.println("Element is not found in the array");
        }
        sc.close();


    }
}
