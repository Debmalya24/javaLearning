public class exceptionHandelBasic {
    public static void main(String a[]){
        int i=18;
        int j=0;

        try{
            i=i/j;
        }
        catch(Exception e){
            System.out.println("Something wrong happed");
        }

        System.out.println(i);
        System.out.println("Bye");
    }
}
