package readability;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws FileNotFoundException {

        String s = args[0];

        try {
            String input = readFileAsString(s);
            String[] sentences = input.split("[.?!]");
            String[] words = input.split(" ");
            int ch = input.replaceAll(" |\n|\t","").split("").length;

            double sentD = (double) sentences.length;
            double wordD = (double) words.length;
            double chD = (double) ch;

            double scD = 4.71 * (chD / wordD) + 0.5 * (wordD / sentD) - 21.43;

            String score = String.format("%.2f", scD);

            int sc = (int)Math.ceil(scD);

            System.out.println(sc + " SC");

            String age = "";
            switch (sc) {
                case 1:
                    age = "5 - 6";
                    break;
                case 2:
                    age = "6 - 7";
                    break;
                case 3:
                    age = "7 - 9";
                    break;
                case 4:
                    age = "9-10";
                    break;
                case 5:
                    age = "10-11";
                    break;
                case 6:
                    age = "11-12";
                    break;
                case 7:
                    age = "12-13";
                    break;
                case 8:
                    age = "13-14";
                    break;
                case 9:
                    age = "14-15";
                    break;
                case 10:
                    age = "15-16";
                    break;
                case 11:
                    age = "16-17";
                    break;
                case 12:
                    age = "17-18";
                    break;
                case 13:
                    age = "18-24";
                    break;
                case 14:
                    age = "24 +";
                    break;
            }

            System.out.println("Words: " + (int) wordD);
            System.out.println("Sentences: " + (int) sentD);
            System.out.println("Characters: " + (int) chD);
            System.out.println("The score is: " + score);
            System.out.println("This text should be understood by " + age
                    + "-year-olds.");

        } catch (Exception e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}


