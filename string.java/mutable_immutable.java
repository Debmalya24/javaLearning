public class mutable_immutable {

    public static void main(String a[]){

        String name="Debmalya";
        name.concat("Roy");
        System.out.println(name); // as java string is immutable the original string remains same

        String str="Debmalya";
        System.out.println(str.concat(" Roy"));


        String friend="Sneha";
        String friend2="Sneha";
        System.out.println("Is friend is equal to friend2 ?: "+(friend==friend2));

    }
    
}
