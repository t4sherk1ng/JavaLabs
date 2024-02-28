import java.util.Arrays;
import java.util.Scanner;

public class Tmp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void ex1Lab7() {
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int number = 23;

        int[][] matrix = new int[r][c];

        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                matrix[i][j] = number + c - j - 1;
            }
            number++;
        }
        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void ex2Lab7() {
        int n = Integer.parseInt(scanner.next());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String value = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(value.split(" ")[j]);
            }
        }

        int diagonal_count = (2 * n) - 1;

        int[] diagonal_sums = new int[diagonal_count];

        for (int i = 0; i < diagonal_count; i++) {
            int sum = 0;
            int row = i < n ? 0 : i - n + 1;
            int col = i < n ? n - 1 - i : 0;

            while (row < n && col < n) {
                sum += matrix[row][col];
                row++;
                col++;
            }

            diagonal_sums[i] = sum;
        }

        for (int i = 0; i < diagonal_count; i++) {
            System.out.println(diagonal_sums[i]);
        }
    }

    public static void demo1lab7() {
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String[] array = scanner.nextLine().split(" ");
        String[][] matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = array[i * m + j];
            }
        }

        String[][] reverse = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reverse[n - i - 1][m - j - 1] = matrix[i][j];
            }
        }

        printMatrix(matrix);
        System.out.println();
        printMatrix(reverse);
    }

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void demo2lab7() {
        int n = 2;
        int m = 3;
        int k = 4;
        int[][][] trio = new int[n][m][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < k; l++) {
                    trio[i][j][l] = i * j * l + 1;
                }
            }
        }

        System.out.print(Arrays.deepToString(trio));
    }
}