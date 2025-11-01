import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionHandelingExample {
    public static void main (String args[]){
        try{
           
             System.out.println(1);
             System.out.println(2);
             System.out.println(3);
             System.out.println(4/0);
             System.out.println(5);

        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide a number by zero..it should be 4");
        }
        try( FileReader file=new FileReader("abc.txt");
            BufferedReader fileInput=new BufferedReader(file)){
           // FileReader file=new FileReader("abc.txt");
            //ufferedReader fileInput=new BufferedReader(file);
            String line;
            while((line=fileInput.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(Exception e){
            System.out.println("Something wrong"+e);
        }
    }
}
