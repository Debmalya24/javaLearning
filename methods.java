class computer{

    public void musicPlayer(){

        System.out.println("It is playing music");

    }

    public void file(int password){

        if(password==1234){
            System.out.println("Open the file");
        }
        else{
            System.out.println("Wrong Password!! ");
        }
    }
}

public class methods {

    public static void main(String a[]){

        computer obj=new computer();

        obj.musicPlayer();

       int x=1234;

       obj.file(x);

    }
    
}
