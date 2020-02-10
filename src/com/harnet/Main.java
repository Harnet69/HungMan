package com.harnet;

public class Main {

    public static void main(String[] args) {
        Data guessedWord = new Data("");
        String word = guessedWord.rndWord; // word for guessing
//        System.out.println(word);


        Player player1 = new Player("Adam", word.length());

        int attempts = player1.getAttemptsNum();
        System.out.println("Give a name of some Codecool's mentor");
        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();
            if (InputValidator.isLetter(usrLetter)) {
                System.out.println("\033[H\033[2J");
                System.out.println(guessedWord.getHidedWord());
                System.out.println(usrLetter);
                attempts--;
            } else {
                System.out.println("There isn't a letter!");
            }
        }
        System.out.println("GAME OVER! You've been hung");
    }
}
