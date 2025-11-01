class laptop{
    public String name;
    public int price;
    @Override
    public String toString() {
        return "laptop [name=" + name + ", price=" + price + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


    /*public String toString(){
        return name+":"+price;
    }*/
    
}
public class toStringMethod {
    public static void main(String a[]){
        laptop l1=new laptop();

        l1.name="Dell";
        l1.price=78000;

        System.out.println(l1.toString());
    }
}
