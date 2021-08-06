import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] input = str.split("");
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i]);
        }
        System.out.println(sum);
    }
}