class students{
    String name;
    int roll_num;
    int marks;

}

public class arrayOfobj {

    public static void main(String a[]){
        students s1=new students();
        s1.name="Deb";
        s1.roll_num=1;
        s1.marks=98;

        students s2=new students();
        s2.name="Ritu";
        s2.roll_num=2;
        s2.marks=100;

        students s3=new students();
        s3.name="Rohit";
        s3.roll_num=3;
        s3.marks=87;

        students arr[]=new students[3];

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i].name+" : "+arr[i].roll_num+" : "+arr[i].marks);
        }


    }
}
