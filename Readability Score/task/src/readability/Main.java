package readability;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws FileNotFoundException {

        String str = args[0];

        try {
            String input = readFileAsString(str);
            String[] sentences = input.split("[.?!]");
            String[] words = input.split(" ");
            int ch = input.replaceAll(" |\n|\t","").split("").length;

            double sentD = (double) sentences.length;
            double wordD = (double) words.length;
            double chD = (double) ch;

            double scoreAR = 4.71 * (chD / wordD) + 0.5 * (wordD / sentD) - 21.43;

            String scoreStringAR = String.format("%.2f", scoreAR);

            int scAR = (int)Math.round(scoreAR);

            int ageAR = 0;
            switch (scAR) {
                case 1:
                    ageAR = 6;
                    break;
                case 2:
                    ageAR = 7;
                    break;
                case 3:
                    ageAR = 9;
                    break;
                case 4:
                    ageAR = 10;
                    break;
                case 5:
                    ageAR = 11;
                    break;
                case 6:
                    ageAR = 12;
                    break;
                case 7:
                    ageAR = 13;
                    break;
                case 8:
                    ageAR = 14;
                    break;
                case 9:
                    ageAR = 15;
                    break;
                case 10:
                    ageAR = 16;
                    break;
                case 11:
                    ageAR = 17;
                    break;
                case 12:
                    ageAR = 18;
                    break;
                case 13:
                    ageAR = 24;
                    break;
                case 14:
                    ageAR = 25;
                    break;
            }

            String the = input.replaceAll(" the ", " a ");
            String the1 = the.replaceAll("The ", "a ");
            String the2 = the1.replaceAll("We ", "a ");
            String the3 = the2.replaceAll(" we ", " a ");
            String twoVowelsRemoved = the3.replaceAll("[aeiouyAEIOUY]{2}","a");
            String vowelRem1 = twoVowelsRemoved.replaceAll("e"+"[ .,?!]", " ");
            String vowelRem2 = vowelRem1.replaceAll("you", "a");
            String vowelRem3 = vowelRem2.replaceAll(",","");
            String vowelRem4 = vowelRem3.replaceAll("[0-9]+", "a");
            String vowelRem5 = vowelRem4.replaceAll("used", "a");
            String vowelRem6 = vowelRem5.replaceAll("[.,?!:]", "");

            String[] sylArray = vowelRem6.split("[aeiouyAEIOUY]");
            String[] polysyll = vowelRem6.replaceAll("[qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]", "").split(" ");
            String polyWord = "";

            double sylD = sylArray.length;

            int polySyl = 0;
            for (int i = 0; i < polysyll.length; i++) {
                polyWord = polysyll[i];
                if (polyWord.length() >= 3) {
                    polySyl++;
                }
            }

            // Flesch reading-ease test:
            double scoreFK = 0.39 * (wordD/sentD) + 11.8 * (sylD/wordD) - 15.59;
            String scoreStringFK = String.format("%.2f", scoreFK);

            int scFK = (int)Math.round(scoreFK);

            int ageFK = 0;
            switch (scFK) {
                case 1:
                    ageFK = 6;
                    break;
                case 2:
                    ageFK = 7;
                    break;
                case 3:
                    ageFK = 9;
                    break;
                case 4:
                    ageFK = 10;
                    break;
                case 5:
                    ageFK = 11;
                    break;
                case 6:
                    ageFK = 12;
                    break;
                case 7:
                    ageFK = 13;
                    break;
                case 8:
                    ageFK = 14;
                    break;
                case 9:
                    ageFK = 15;
                    break;
                case 10:
                    ageFK = 16;
                    break;
                case 11:
                    ageFK = 17;
                    break;
                case 12:
                    ageFK = 18;
                    break;
                case 13:
                    ageFK = 24;
                    break;
                case 14:
                    ageFK = 25;
                    break;
            }

            // SMOG Index
            double scoreSMOG = 1.043 * Math.sqrt(polySyl * (30/sentD)) + 3.1291;
            String scoreStringSMOG = String.format("%.2f", scoreSMOG);

            int scSMOG = (int)Math.round(scoreSMOG);

            int ageSMOG = 0;
            switch (scSMOG) {
                case 1:
                    ageSMOG = 6;
                    break;
                case 2:
                    ageSMOG = 7;
                    break;
                case 3:
                    ageSMOG = 9;
                    break;
                case 4:
                    ageSMOG = 10;
                    break;
                case 5:
                    ageSMOG = 11;
                    break;
                case 6:
                    ageSMOG = 12;
                    break;
                case 7:
                    ageSMOG = 13;
                    break;
                case 8:
                    ageSMOG = 14;
                    break;
                case 9:
                    ageSMOG = 15;
                    break;
                case 10:
                    ageSMOG = 16;
                    break;
                case 11:
                    ageSMOG = 17;
                    break;
                case 12:
                    ageSMOG = 18;
                    break;
                case 13:
                    ageSMOG = 24;
                    break;
                case 14:
                    ageSMOG = 25;
                    break;
            }

            // Coleman–Liau index
            double l = (chD / wordD) * 100;
            double s = (sentD / wordD) * 100;
            double scoreCL = 0.0588 * l - 0.296 * s - 15.8;
            String scoreStringCl = String.format("%.2f", scoreCL);

            int scCL = (int)Math.round(scoreCL);

            int ageCL = 0;
            switch (scCL) {
                case 1:
                    ageCL = 6;
                    break;
                case 2:
                    ageCL = 7;
                    break;
                case 3:
                    ageCL = 9;
                    break;
                case 4:
                    ageCL = 10;
                    break;
                case 5:
                    ageCL = 11;
                    break;
                case 6:
                    ageCL = 12;
                    break;
                case 7:
                    ageCL = 13;
                    break;
                case 8:
                    ageCL = 14;
                    break;
                case 9:
                    ageCL = 15;
                    break;
                case 10:
                    ageCL = 16;
                    break;
                case 11:
                    ageCL = 17;
                    break;
                case 12:
                    ageCL = 18;
                    break;
                case 13:
                    ageCL = 24;
                    break;
                case 14:
                    ageCL = 25;
                    break;
            }

            //Final output

            System.out.println("Words: " + (int) wordD);
            System.out.println("Sentences: " + (int) sentD);
            System.out.println("Characters: " + (int) chD);
            System.out.println("Syllables: " + (int) sylD);
            System.out.println("Polysyllables: " + polySyl);
            System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
            //scanner
            Scanner scanner = new Scanner(System.in);
            String secondInput = scanner.nextLine();
            int secInp = 0;
            if ("ARI".equals(secondInput)) {
                secInp = 1;
            } else if ("FK".equals(secondInput)) {
                secInp = 2;
            } else if ("SMOG".equals(secondInput)) {
                secInp = 3;
            } else if ("CL".equals(secondInput)) {
                secInp = 4;
            }
            switch (secInp) {
                case 1:
                    System.out.println("Automated Readability Index: " + scoreStringAR + " (about " + ageAR + "-year-olds).");
                case 2:
                    System.out.println("Flesch–Kincaid readability tests: " + scoreStringFK + " (about " + ageFK + "-year-olds).");
                case 3:
                    System.out.println("Simple Measure of Gobbledygook: " + scoreStringSMOG + " (about " + ageSMOG + "-year-olds).");
                case 4:
                    System.out.println("Coleman–Liau index: " + scoreStringCl + " (about " + ageCL + "-year-olds).");
                default:
                    System.out.println("Automated Readability Index: " + scoreStringAR + " (about " + ageAR + "-year-olds).");
                    System.out.println("Flesch–Kincaid readability tests: " + scoreStringFK + " (about " + ageFK + "-year-olds).");
                    System.out.println("Simple Measure of Gobbledygook: " + scoreStringSMOG + " (about " + ageSMOG + "-year-olds).");
                    System.out.println("Coleman–Liau index: " + scoreStringCl + " (about " + ageCL + "-year-olds).");
                    System.out.println();
                    double ages = ageAR + ageFK + ageSMOG + ageCL;
                    double allAge = ages / 4;
                    System.out.println("This text should be understood in average by " + allAge +"-year-olds.");
            }
        } catch (Exception e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}