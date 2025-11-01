import java.util.Scanner;

public class multiDimensionalArray {
    public static void main(String a[]){

        Scanner sc= new Scanner(System.in);

        int n;
        System.out.print("Enter the size o row : ");
        n=sc.nextInt();

        int m;
        System.out.print("Enter the size o column : ");
        m=sc.nextInt();

        int arr[][]=new int[n][m];
        System.out.print("The elments of the array are : ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The output will be : ");

        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();

    }
}
