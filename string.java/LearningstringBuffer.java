public class LearningstringBuffer {

    public static void main(String a[]){
        StringBuffer sb=new StringBuffer("Hello");

        //length

        System.out.println("The length of the string buffer : "+sb.length());

        //capacity
        System.out.println("The capacity of the string buffer : "+sb.capacity());

        //append
        System.out.println("after appending the string buffer : "+sb.append("World"));

        //insert(position , string)
        System.out.println("The new string buffer : "+sb.insert(6,"Java"));

        //replace (start,end ,string )
        System.out.println("The new string buffer : "+sb.replace(6,10,"World"));

        //delete (start,end)
        System.out.println("The new string buffer : "+sb.delete(6,10));

        //reverse
        System.out.println("The new string buffer : "+sb.reverse());

        //deleteChartAt(index)
        System.out.println("The new string buffer : "+sb.deleteCharAt(4));

        
    }
    
}
