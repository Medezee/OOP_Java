package ua.lpnuai.oop.brusentsov08;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Command {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> inputs = new ArrayList<>();
    private static ArrayList<String> nonAlpha;
    private static ArrayList<String> vowel;
    private static ArrayList<String> consonant;
    static NonAlphabetic nonA;
    static Vowel vowels;
    static Consonant consonants;

    public static void input() {
        String in = sc.next();
        while (!in.equals("~")) {
            inputs.add(in);
            in = sc.next();
        }
        System.out.println("Done!");
    }

    public static void show() {
        System.out.println(inputs.toString());
        if (nonAlpha != null) {
            System.out.print("Your strings starts with no alphabetic: ");
            System.out.println(nonAlpha.toString());
        }
        if (vowel != null) {
            System.out.print("Your strings starts with vowel: ");
            System.out.println(vowel.toString());
        }
        if (consonant != null) {
            System.out.print("Your strings starts with consonant: ");
            System.out.println(consonants.toString());
        }
    }

    public static void show_min() {
        if (nonAlpha != null || vowel != null || consonant != null) {
            if (nonAlpha != null) {
                System.out.println("Your smallest string which starts with no alphabetic: " + nonA.minElem());
                System.out.println("With length " + nonA.getMinLength());
            }
            if (vowel != null) {
                System.out.println("Your smallest string which starts with a vowel: " + vowels.minElem());
                System.out.println("With length " + vowels.getMinLength());
            }
            if (consonant != null) {
                System.out.println("Your smallest string which starts with a consonant: " + consonants.minElem());
                System.out.println("With length " + consonants.getMinLength());
            }
        } else System.out.println("Nothing to show :(");
    }

    public static void nonAplhabetic() {
        nonA = new NonAlphabetic(inputs);
        nonAlpha = nonA.getNonAlpha();
        System.out.println("Done!");
    }

    public static void isvowel() {
        vowels = new Vowel(inputs);
        vowel = vowels.getVowel();
        System.out.println("Done!");
    }

    public static void isconsonant() {
        consonants = new Consonant(inputs);
        consonant = consonants.getConsonant();
        System.out.println("Done!");
    }

    public static void help() {
        System.out.println("You can use these commands: \n" +
                "-start - Initialize the program and you can start to " +
                "type your strings \n" +
                "-help - Instructions \n" +
                "-debug - Debug mode \n" +
                "-show - Show your's inputted strings (if you" +
                "had used next 3 commands, also show strings which starts with a specific character) \n" +
                "-noalpha - Choose strings which starts only with a non alphabetic character \n" +
                "-vowel - Choose strings which starts only with a vowel \n" +
                "-consonant - Choose strings which starts only with a consonant \n" +
                "-exit - Exit the program (Pretty obvious :) )");
    }

    public static void debug() {
        if (inputs != null) {
            System.out.println("Inputs = " + inputs.toString());
        } else System.out.println("Inputs = null");

        if (nonAlpha != null) {
            System.out.println("NoAlpha = " + nonAlpha.toString());
        } else System.out.println("NoAlpha = null");

        if (vowel != null) {
            System.out.println("Vowels = " + vowel.toString());
        }
        else System.out.println("Vowels = null");

        if (consonant != null){
            System.out.println("Consonant = " + consonant.toString());
        } else System.out.println("Consonant = null");

        System.out.println("NoAlpha minElem = " + nonA.getMinElem() + "\n" +
                "NoAlpha minLength = " + nonA.getMinLength() + "\n" +
                "Vowels minElem = " + vowels.getMinElem() + "\n" +
                "Vowels minLength = " + vowels.getMinLength() + "\n" +
                "Consonant minElem = " + consonants.getMinElem() + "\n" +
                "Consonant minLength = " + consonants.getMinLength());
    }
}
