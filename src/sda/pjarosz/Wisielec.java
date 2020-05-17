package sda.pjarosz;

import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class Wisielec {

    public static final String[] words = {
            "młotek",
            "gra",
            "java",
            "woreczek"
    };

    public static void main(String[] args) {

        Random random1 = new Random();
        Scanner sc1 = new Scanner(System.in);

        int nrOfWord = random1.nextInt(words.length);
        String word = words[nrOfWord];
        boolean[] guessed = new boolean[word.length()];


        System.out.println("*******Gra w wisielca********");

        char c;
        do {
            System.out.println("zgadujesz kolejne litery w słowie:");
            System.out.println(guessedWord(word, guessed));
            System.out.println();
            System.out.print("Podaj litere: ");
            c = sc1.next().charAt(0);


        }while(true);


    }//end main

    private static boolean tryLetter(String word, boolean[] guess, char c){
        boolean goal = false;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == c){
                guess[i] = true;
                goal = true;
            }

        }
        return goal;
    }

    private static String guessedWord(String word, boolean[] guess){

        StringBuilder s = new StringBuilder(word);
        for (int i = 0; i < guess.length; i++) {
            if(guess[i] == false){
                s.replace(i, i+1, ".");
            }
        }
        return s.toString();

    }
}
