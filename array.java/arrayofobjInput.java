import java.util.Scanner;

class students {
    String name;
    int roll_num;
    int marks;
}

public class arrayofobjInput {

    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        sc.nextLine(); 

        students arr[] = new students[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new students();

            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            arr[i].name = sc.nextLine();

            System.out.print("Roll Number: ");
            arr[i].roll_num = sc.nextInt();

            System.out.print("Marks: ");
            arr[i].marks = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("\nThe details of the students are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " : " + arr[i].roll_num + " : " + arr[i].marks);
        }

        sc.close();
    }
}

