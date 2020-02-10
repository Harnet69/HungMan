package com.harnet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Data guessedWord = new Data("", "");
        String word = guessedWord.rndWord.toLowerCase(); // word for guessing
//        System.out.println(word);


        Player player1 = new Player("Adam", word.length());

        int attempts = player1.getAttemptsNum();
        System.out.println("\033[H\033[2J"); // refresh a console
        System.out.println("Give a name of some Codecool's mentor");
        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();
            //check if char is in the word
//            int isExists = word.indexOf(String.valueOf(usrLetter));
//            System.out.println("Letter in word is: "+isExists);
//            String letter = Arrays.toString(usrLetter);

            if (InputValidator.isLetter(usrLetter)) {
//                if() {
                    guessedWord.getLetInd(word, usrLetter[0]);
//                }
                System.out.println("\033[H\033[2J"); // refresh a console
                System.out.println(guessedWord.getHidedWord());
//                System.out.println(usrLetter);
                attempts--;
                System.out.println("You have " + attempts + " attempts");
            } else {
                System.out.println("There isn't a letter!");
            }
        }
        System.out.println("GAME OVER! You've been hung");
        System.out.println("The mentor was: " + word);
    }
}
