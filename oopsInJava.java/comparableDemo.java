import java.util.*;
class student implements Comparable<student>{
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

    public int compareTo(student that){
        return (this.name.compareTo(that.name));
    }


}
public class comparableDemo {
    public static void main(String args[]){

        List<student>stu=new ArrayList<>();
        stu.add(new student("Debmalya",22 ));
        stu.add(new student("Rohit",23 ));
        stu.add(new student("Amit",24));

        Collections.sort(stu);

        for(student s:stu){
            System.out.println(s);
        }


    }
}

