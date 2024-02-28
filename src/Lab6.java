import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//          демо 6

    }

    public static void ex1Lab6() {
        String value = scanner.nextLine();
        String[] arr = value.split(" ");
        String unique_vals = "";
        int sum = 0;
        int amount = arr.length;

        for (String s : arr) {
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {
                System.out.println("Please, try again");
                return;
            }

        }

        for (String s : arr) {
            if (!unique_vals.contains(s)) {
                unique_vals += s + " ";
            }
        }

        int[] res_arr = new int[unique_vals.split(" ").length];

        for (int i = 0; i < res_arr.length; i++) {
            res_arr[i] = Integer.parseInt(unique_vals.split(" ")[i]);
        }

        Arrays.sort(res_arr);

        System.out.println(sum);
        System.out.println(amount);
        for (int i : res_arr) {
            System.out.print(i + " ");
        }
    }

    public static void ex2Lab6() {
        String[] words = scanner.nextLine().split(" ");
        String[] ints = scanner.nextLine().split(" ");
        int[] lengths = new int[ints.length];
        try {
            for (int i = 0; i < ints.length; i++) {
                lengths[i] = Integer.parseInt(ints[i]);
            }
        } catch (Exception e) {
            System.out.println("Please, try again");
            return;
        }

        int max = Integer.MIN_VALUE;
        for (int s : lengths) {
            if (s > max) {
                max = s;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int s : lengths) {
            if (s < min) {
                min = s;
            }
        }

        for (String s : words) {
            if (s.length() >= min && s.length() <= max) {
                System.out.print(s + " ");
            }
        }

    }

    public static void demo6Ex1() {
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            numbers[i] = digit;
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void demo6Ex2() {
        String[] words = scanner.nextLine().split(" ");
        int[] numbers = new int[words.length];
        int n = 23;
        int sum_dim_n = 0;


        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }

        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            if (numbers[i] % 2 == 0) sum += numbers[i];
            if (numbers[i] % n == 0) sum_dim_n += numbers[i];
        }

        System.out.println(sum);
        System.out.println(sum_dim_n);
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
