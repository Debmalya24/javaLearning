interface Camera {
    void click();
}
interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera,MusicPlayer{
    public void click(){
        System.out.println("Clicking a photo");
    }
    public void playMusic(){
        System.out.println("Playing a music");
    }
}
public class multipleInheritenceDemo {
    public static void main(String a[]){
        Camera ca;
        ca=new SmartPhone();
        ca.click();
        MusicPlayer mp;
        mp=new SmartPhone();
        mp.playMusic();

    }
}
