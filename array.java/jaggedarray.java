import java.util.Scanner;
public class jaggedarray {

    public static void main(String a[]){

        Scanner sc=new Scanner(System.in);


        int arr[][]=new int[3][]; //jagged array

        arr[0]=new int[3];
        arr[1]=new int [4];
        arr[2]=new int [5];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){

                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println("The output will be : ");

        for(int ans[]:arr){

            for(int res: ans){

                System.out.print(res + " ");
            }

            System.out.println();
        }
        sc.close();
    }
    
}
