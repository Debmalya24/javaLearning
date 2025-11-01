import java.util.Scanner;

class students{
    String name;
    int roll;
    int marks;
}

public class forEachLoop_method2 {

    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of students : ");
        n=sc.nextInt();
        sc.nextLine();
        students arr[]=new students[n];

        for(int i=0;i<n;i++){

            System.out.println("Enter the details of student "+(i+1)+" : ");

            arr[i]=new students();

            System.out.print("Name: ");
            arr[i].name=sc.nextLine();
            System.out.print("Roll: ");
            arr[i].roll=sc.nextInt();
            System.out.print("Marks: ");
            arr[i].marks=sc.nextInt();
            sc.nextLine();

        }

        for(students s:arr){
            System.out.println(s.name+" "+s.roll+" "+s.marks);
        }

        sc.close();

    }
}
