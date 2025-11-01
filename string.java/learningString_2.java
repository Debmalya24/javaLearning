public class learningString_2 {

    public static void main(String a[]){
        String str1="Hello";
        String str2=new String("Hello");

        System.out.println("Is str1 is equal to str2 ?: "+str1.equals(str2));

        System.out.println("Is str1 is equal to str2 ?: "+(str1==str2));

        String friend="Deb ,arka ,nilu , Tushar";

        String arr[]=friend.split(",");

        for(String s: arr){
            s=s.trim();//triming spaces
            System.out.println(s);
        }

    }
    
}
