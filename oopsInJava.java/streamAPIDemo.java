import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class streamAPIDemo {
    public static void main(String args[]){

        List<Integer>list=Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer>s1=list.stream();
        s1.forEach(n->System.out.println(n));

        Stream<Integer>s2=Stream.of(10,20,30,40);
        s2.forEach(n->System.out.println(n));

        // .filter() is used to filter the data based on condition 

        list.stream()
        .filter(n->n%2==0)
        .forEach(n->System.out.println(n));

        //.map() is used to transforms each element 

        list.stream()
        .map(n->n*2)
        .forEach(n->System.out.println(n));

       //.sorted() is used to sort the data

       list.stream().sorted().forEach(n->System.out.println(n));

       //.sorted() in asending order

       list.stream()
       .sorted((a,b)->b-a)
       .forEach(n->System.out.println(n));

       //distinct() is used to remove duplicates

       List<Integer>num=Arrays.asList(2,2,1,3,4,5,5,65,6,65,7);
         num.stream()
         .distinct()
         .forEach(n->System.out.print(n+" "));

         //limit(n) is used to only first n elements

        list.stream()
        .limit(4)
        .forEach(n->System.out.println(n));
         
        //skip(n) is used to skip first n elements

        num.stream()
        .skip(3)
        .forEach(n->System.out.println(n));

        // count() is used to count the number of elements

        System.out.println("The count is : ");
        Long count=num.stream().count();
        System.out.println(count);

        //reduce()  is used to reduce the stream to single value

        int sum=num.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        //collect() is used to collect the stream elements and store them in a colleection

        List<Integer>newList=num.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(newList);
        
    }
}
