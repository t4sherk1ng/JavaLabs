import java.util.Scanner;

public class Lab4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void demo4Ex1() {
        int sum = 0;
        int start = Integer.parseInt(scanner.next());
        int finish = Integer.parseInt(scanner.next());
        int n = 23;


        for (int i = start; i <= finish; i++) {
            if (i % 3 == 0 || i == n) continue;
            sum += i;
        }
        System.out.println(sum);
    }

    public static void demo4Ex2() {
        int sum = 0;
        int start = Integer.parseInt(scanner.next());
        int finish = Integer.parseInt(scanner.next());
        int n = 23;

        for (int i = start; i <= finish; i++) {
            int factorial = i;
            for (int j = factorial - 1; j > 0; --j) {
                factorial *= j;
            }
            if (i == n) {
                System.out.println("factorial of n: " + factorial);
                continue;
            }
            sum += factorial;
        }

        System.out.println(sum);
    }
}
