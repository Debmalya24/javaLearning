public class exceptionHandelmultipleTryCatche {
    public static void main(String args[]){

        int i=18;
        int j=0;
        int res=0;
        int arr[]={3,4,8,9};

        try{
            res=i/j;
            System.out.println(arr[5]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bound "+e);
        }
        catch (ArithmeticException e){
            System.out.println("Some problem is there while dividation"+e);
        }

       catch(Exception e){
        System.out.println("Something went wrong "+e);
       }
       finally{
        System.out.println(res);
       }
    }
}
