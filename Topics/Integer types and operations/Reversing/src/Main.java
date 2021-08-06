import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  
        String numb = scanner.nextLine();
        StringBuilder num = new StringBuilder();
        int i = numb.length();
        int count = 0;

        while (count != i) {
            num.append(numb.charAt(i - 1));
            i--;
        }

        if (num.charAt(0) == '0') {
            num.deleteCharAt(0);
            System.out.println(num);
        } else {
            System.out.println(num);
        }
    }
}