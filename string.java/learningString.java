public class learningString {

    public static void main(String a[]){
        String str="Hello World ";
        //finding length of string
        System.out.println("Length of the string will be : "+str.length());

        //finding character at a specific index
        System.out.println("Charecter at the index 3 will be : "+str.charAt(3));

        //to uppercase the string

        System.out.println("After converting the letter to the upeercase the new string will be : "+str.toUpperCase());

        //to lowercase the string

        System.out.println("After converting the letter to the Lowercase the new string will be : "+str.toLowerCase());

        //indexofcharecter method
        System.out.println("The index of the char 'W' will be : "+str.indexOf('W'));

        // substring method
        System.out.println("The substring from index 1 to 5 will be : "+str.substring(1,5));

        //is contatin a particular sequence 
        System.out.println("Does the string contain the word Hello ? : "+str.contains("Hello"));

        
        String str2="I love M.s.Dhoni";

        //replece method 

        System.out.println("after replacing the letter with Kohli  the new string will be : "+str2.replace("M.s.Dhoni","Virat Kohli"));



    }
}
