import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        int count = 0;

        for (int i = 0; i < arr.length; ) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[0][size - 1] == arr[size - 1][0]
                        || arr[i][size / 2] == arr[size / 2][j]) {
                    count += 1;
                }
                //if (arr[i][j] == arr[j][i]) {
                  //  count += 1;
                //}
            }
            System.out.println(count);
                if (count >= size) {
                    System.out.println("YES");
                    break;
                } else {
                    System.out.println("NO");
                    break;
                }
        }
    }
}