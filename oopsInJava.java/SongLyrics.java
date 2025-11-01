public class SongLyrics {

      public static final String COLOR = "\u001B[38;5;160m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {

        String[] lyrics = {
            "Haathon ko sambhale mere haathon mein",
            "Kaise haathon ko sambhale mere haathon mein",
            "Jab tak neend na aaye, inn lakeeron mein",
            "baatein ho..... ",
            "haaye.......!!"
        };

        double[] delays = {1.2, 1.2, 1.5, 0.8, 0.7};

        for (int i = 0; i < lyrics.length; i++) {
            printWithTypingEffect(lyrics[i]);

            if (i < delays.length) {
                try {
                    Thread.sleep((long)(delays[i] * 1000)); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

   
    public static void printWithTypingEffect(String line) {

        if (line.contains("inn lakeeron mein")) {
            String before = "Jab tak neend na aaye, ";
            String slowPart = "inn lakeeron mein";


            for (char c : before.toCharArray()) {
                System.out.print(COLOR + c + RESET);
                sleep(80);
            }

            
            for (char c : slowPart.toCharArray()) {
                System.out.print(COLOR + c + RESET);
                sleep(120);
            }
            System.out.println();
        }

        else if (line.trim().startsWith("baatein")) {
            for (char c : line.toCharArray()) {
                System.out.print(COLOR + c + RESET);
                sleep(150);
            }
            System.out.println();
        }

        else {
            for (char c : line.toCharArray()) {
                System.out.print(COLOR + c + RESET);
                sleep(80);
            }
            System.out.println();
        }
    }
       
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   
    public static void fadeOutText(String text, int delay) {
        System.out.print(COLOR);
        for (char c : text.toCharArray()) {
            System.out.print(c);
            sleep(delay);
        }
        System.out.println(RESET);
    }
}





