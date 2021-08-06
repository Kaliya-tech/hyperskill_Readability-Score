import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int b = (n / 10 ) % 10;

        System.out.println(b);
    }
}