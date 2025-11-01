class DebWillSolve extends Exception{
    public DebWillSolve(String str){
        super(str);
    }
}
public class customiseThrowExample {
    public static void main(String args[]){
        int res=0;
        int j=0;
        try{
             if(j==0){
            throw new DebWillSolve("The default value will be the res");
            }
            res=18/j;
        }
        catch (DebWillSolve e){
            res=18/1;
            System.out.println("The automatic value will be : "+res);
            System.out.println("Custom exception says: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something error occured "+e);
        }
    }
}
