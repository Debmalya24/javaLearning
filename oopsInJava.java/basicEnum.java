enum days{
    Sunday,Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday;
}
public class basicEnum {
    public static void main(String arg[]){
        days d=days.Monday;
        System.out.println(d);
        System.out.println(d.ordinal());
        days Day=days.valueOf("Friday");
        System.out.println(Day);
        for(days day: days.values()){
            System.out.println(day);
        }

        if(d==days.Sunday){
            System.out.println("Holiday");
        }
        else if(d==days.Monday){
            System.out.println("Working day");
        }
        else if(d==days.Tuesday){
            System.out.println("mid day of week");
        }
        else{
            System.out.println("Other day of week");
        }
    }
}
