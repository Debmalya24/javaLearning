public class wrapperClass {
    public static void main(String a[]){
        int x=5;
        //Integer c=new Integer(x);//old way
        Integer b=x;//new way
        Integer d=Integer.valueOf(x);
        
        System.out.println(b);
        System.out.println(d);

         String str="123";
         Integer obj=Integer.parseInt(str);
         System.out.println(obj);

    }
}
