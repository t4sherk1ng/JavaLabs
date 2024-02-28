import java.util.Scanner;

public class Lab5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //        для демо 5
//        String text = scanner.nextLine();
//        System.out.printf("'%s' %s palindrome",
//                text,
//                ((isPalindrome(text.toLowerCase().replaceAll("[^a-zA-Za-яёА-ЯЁ]", ""))) ? "is" : "is NOT") );
    }

    static void voice(int number) { //demo5ex1
        System.out.println(
                switch (number) {
                    case 1 -> "One";
                    case 2 -> "Two";
                    case 3 -> "Three";
                    case 4 -> "Four";
                    case 5 -> "Five";
                    case 6 -> "Six";
                    case 7 -> "Seven";
                    case 8 -> "Eight";
                    case 9 -> "Nine";
                    case 10 -> "Ten";
                    default -> "I'm tired";
                }
        );
    }

    public static boolean isPalindrome(String msg) {
        if (msg.isEmpty() || msg.length() == 1) return true;
        else {
            if (msg.charAt(0) != msg.charAt(msg.length() - 1)) {
                return false;
            } else {
                return isPalindrome(msg.substring(1, msg.length() - 1));
            }
        }
    }
}
