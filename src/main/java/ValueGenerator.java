import java.util.Random;

public class ValueGenerator {
    static public int over1under99() {
        Random r = new Random();
        int low = 1;
        int high = 99;
        int value = r.nextInt(high - low) + low;
        return value;
    }

    static public int max50() {
        Random r = new Random();
        int low = 1;
        int high = 50;
        int value = r.nextInt(high - low) + low;
        return value;
    }

    static public int max75() {
        Random r = new Random();
        int low = 1;
        int high = 75;
        int value = r.nextInt(high - low) + low;
        return value;
    }

    static public int between2550() {
        Random r = new Random();
        int low = 25;
        int high = 50;
        int value = r.nextInt(high-low) + low;
        return value;
    }

    static public int under75() {
        Random r = new Random();
        int low = 50;
        int high = 75;
        int value = r.nextInt(high-low) + low;
        return value;
    }

    static public int under99() {
        Random r = new Random();
        int low = 75;
        int high = 99;
        int value = r.nextInt(high-low) + low;
        return value;
    }
    static public int max25() {
        Random r = new Random();
        int low = 1;
        int high = 25;
        int value = r.nextInt(high - low) + low;
        return value;
    }

}

