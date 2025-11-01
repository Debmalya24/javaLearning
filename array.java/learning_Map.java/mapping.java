import java.util.HashMap;

public class mapping {

    public static void main(String a[]){

        HashMap<String,Integer>map=new HashMap<>();

        map.put("Deb",90);
        map.put("Amita",65);
        map.put("Anita",100);

        //getting the marks of anita
        System.out.println("marks of Anita : "+map.get("Anita"));
        // checking if deb exist or not

        if(map.containsKey("deb")){
            System.out.print("Deb exists in the map");
        }
        else{

            System.out.print("Deb does not exists in the map");

        }

        //removing amita from map

        map.remove("Amita");

        //iterating through the map

        for(String key: map.keySet()){

            System.out.println("Name: "+key+ " Marks : "+map.get(key));
        }

        //iterating through the map method 2
        
        for(HashMap.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Name: "+entry.getKey()+ " Marks : "+entry.getValue());

        }
    }
    
}
