import java.util.*;
class student{
    String name;
    int num;
    public student(String name, int num) {
        this.name = name;
        this.num = num;
    }
    @Override
    public String toString() {
        return "student [name=" + name + ", num=" + num +"]";
    }

}
public class comparetorDemo {
    public static void main(String args[]){

        List<student>stu=new ArrayList<>();
        stu.add(new student("Debmalya",22 ));
        stu.add(new student("Rohit",23 ));
        stu.add(new student("Amit",24));

        Comparator<student>nameComparetor=new  Comparator<student>(){

           // @Override
            public int compare(student s1, student s2){
                return s1.name.compareTo(s2.name);
            }

        };

        Collections.sort(stu,nameComparetor);

        for(student s:stu){
            System.out.println(s);
        }

        Comparator<student>numComparator=new Comparator<student>() {
            public int compare(student s1, student s2){
                if(s1.num>s2.num){
                    return 1;
                }

                else {
                    return -1;
                }
            }
            
        };
         Collections.sort(stu,numComparator);

        for(student s:stu){
            System.out.println(s);
        }
    }
}
