//package arrayList.java;
import java.util.*;

public class IntroductionToArrayList {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //Adding elements 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.add(2,25); // Adding elements 25 at the index 2
        System.out.println(list);
        //Accessing elements

        int elements=list.get(2); //getting value at index 2 
        System.out.println(elements);

        //Change and replace values 
        list.set(1,10);
        System.out.println(list);

        // Removing elements 
        list.remove(3);
        list.remove(Integer.valueOf(10));//removing the value 3
        System.out.println(list);

        //clearing elements 
        list.clear();
        System.out.println(list);

        list.add(29);
        list.add(39);
        list.add(87);
        list.add(32);
        System.out.println(list.contains(39));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //ArrayList to Array

        Integer arr[]=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        //Array to ArrayList
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
       // Sorting the arrayList
        Collections.sort(list2);
        System.out.println(list2);

        //reverse the arrayList
        Collections.reverse(list2);
        System.out.println(list2);

    }
}
