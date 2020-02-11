package com.harnet;

public class Main {

    public static void main(String[] args) {
        Data guessedWord = new Data();
        String word = guessedWord.rndWord.toLowerCase(); // word for guessing
//        System.out.println(word);

        Player player1 = new Player("Daniel");

        int attempts = word.length()+2; // give 2 more attempts
        System.out.println("\033[H\033[2J"); // refresh a console
        System.out.println(HungMan.hung[0]);
        System.out.println("Give a name of some Codecool's mentor");

        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();

            if (InputValidator.isLetter(usrLetter)) {
                boolean isLetterExists =  guessedWord.isLetterExists(word, usrLetter[0]);
                // win condition
                if(guessedWord.getHidedWord().indexOf('*') < 0) {
                    System.out.println("\033[H\033[2J"); // refresh a console
                    System.out.println("YOU WON!!!");
                    String capWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    System.out.println("Mentor's name is: " + capWord);
                    return;
                }

                System.out.println("\033[H\033[2J"); // refresh a console
                System.out.println(guessedWord.getHidedWord());
                attempts--;
                System.out.println("You have " + attempts + " attempts");
                if(!isLetterExists) {
                    System.out.println(HungMan.hung[attempts/2]);
                }
            } else {
                System.out.println("There isn't a letter!");
            }
        }
        System.out.println("GAME OVER! You've been hung");
        System.out.println(HungMan.hung[HungMan.hung.length-1]);
    }
}
