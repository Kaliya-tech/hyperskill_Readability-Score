package readability;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        String[] words = input.split(" ");
""
        float result = (float) words.length / sentences.length;

        if (result <= 10) {
            System.out.print("EASY");
        } else {
            System.out.print("HARD");
        }
    }
}