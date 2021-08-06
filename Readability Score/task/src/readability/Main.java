package readability;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] ch = input.toCharArray();

        if (ch.length <= 99 || input.matches("[ ]+")) {
            System.out.print("EASY");
        } else {
            System.out.print("HARD");
        }
    }
}
