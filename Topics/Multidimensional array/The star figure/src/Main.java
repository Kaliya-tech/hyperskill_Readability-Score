import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String[][] arr = new String[n][n];
        int t = n / 2;

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = "*";
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = ".";
                if (i == j) {
                    arr[i][j] = "*";
                } else if (i + j == n - 1) {
                    arr[i][j] = "*";
                } else if (i == t) {
                    arr[i][j] = "*";
                } else if (j == t) {
                    arr[i][j] = "*";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}