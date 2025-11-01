public class arzSong {
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        // Lyrics
        String[] lyrics = {
            "Arz kiya hai lyrics",
            "Haathon ko sambhale mere haathon mein",
            "Kaise haathon ko sambhale mere haathon mein",
            "Jab tak neend na aaye, inn lakeeron mein",
            "baatein ho..... haaye"
        };

        // Delays between lines (seconds)
        double[] delays = {2.0, 1.8, 2.1, 2.4, 1.7};

        // Colors for each line
        String[] colors = {CYAN, YELLOW, GREEN, MAGENTA, BLUE};

        for (int i = 0; i < lyrics.length; i++) {
            String color = colors[i % colors.length];
            printWithTypingEffect(lyrics[i], color);

            if (i < delays.length) {
                try {
                    Thread.sleep((long)(delays[i] * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Add heartbeat glowing text at the end
        heartbeatGlow("💖  End of Song  💖", RED);
    }

    // Typewriter animation for lyrics
    public static void printWithTypingEffect(String line, String color) {
        for (char c : line.toCharArray()) {
            System.out.print(color + c + RESET);
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    // Heartbeat glow animation
    public static void heartbeatGlow(String text, String color) {
        System.out.println(); // spacing
        int beats = 5; // number of heartbeats
        int fadeSteps = 6; // how smooth the fade is

        try {
            for (int i = 0; i < beats; i++) {
                // Fade in
                for (int j = 0; j < fadeSteps; j++) {
                    int brightness = (int) (255 * (j / (double) fadeSteps));
                    System.out.print("\r" + brightColor(text, brightness, color));
                    Thread.sleep(100);
                }

                // Fade out
                for (int j = fadeSteps; j >= 0; j--) {
                    int brightness = (int) (255 * (j / (double) fadeSteps));
                    System.out.print("\r" + brightColor(text, brightness, color));
                    Thread.sleep(100);
                }
            }
            System.out.println(RESET + "\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Simulates brightness by changing shade (works best in modern terminals)
    public static String brightColor(String text, int brightness, String baseColor) {
        // use RGB ANSI format: \033[38;2;R;G;Bm
        int r = 255, g = 0, b = 0; // red tone for heartbeat
        double factor = brightness / 255.0;
        return String.format("\033[38;2;%d;%d;%dm%s%s",
                (int) (r * factor),
                (int) (g * factor),
                (int) (b * factor),
                text,
                RESET);
    }
}
