import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int var = randomizer.nextInt(1, 7);
        System.out.println(var);
        var = randomizer.nextInt(1, 7);
        System.out.println(var);
    }
}