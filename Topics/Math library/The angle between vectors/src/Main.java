import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstA = scanner.nextInt();
        int firstB = scanner.nextInt();
        int secondA = scanner.nextInt();
        int secondB = scanner.nextInt();

        int ab = firstA * secondA + firstB * secondB;

        double modA = Math.sqrt((firstA * firstA) + (firstB * firstB));
        double modB = Math.sqrt((secondA * secondA) + (secondB * secondB));

        double result = ab / (modA * modB);

        double cos = Math.toDegrees(Math.acos(result));
        int res = (int)Math.floor(cos);

        System.out.println(res);

    }
}