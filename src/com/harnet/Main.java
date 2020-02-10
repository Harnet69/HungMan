package com.harnet;

public class Main {

    public static void main(String[] args) {
        Data guessedWord = new Data("", "");
        String word = guessedWord.rndWord.toLowerCase(); // word for guessing
//        System.out.println(word);


        Player player1 = new Player("Adam", word.length());

        int attempts = player1.getAttemptsNum()+2; // give 2 more attempts
        System.out.println("\033[H\033[2J"); // refresh a console
        System.out.println("Give a name of some Codecool's mentor");
        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();

            if (InputValidator.isLetter(usrLetter)) {
                boolean isLetterExists =  guessedWord.isLetterExists(word, usrLetter[0]);
                boolean winCondition = guessedWord.isLetterExists(guessedWord.getHidedWord(), '*');
//                if(isLetterExists) {
//                    System.out.println("Letter exists");
//                }else{
//                    System.out.println("Letter not exist");
//                }
                if(guessedWord.getHidedWord().indexOf('*') < 0) {
                    System.out.println("\033[H\033[2J"); // refresh a console
                    System.out.println("YOU WON!!!");
                    System.out.println("Mentor's name is: " + word);
                    return;
                }

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
//        System.out.println("The mentor was: " + word);
    }
}
