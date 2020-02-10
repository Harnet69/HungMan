package com.harnet;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Adam", 5);
        int attempts = player1.getAttemptsNum();

        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();
            if (InputValidator.isLetter(usrLetter)) {
                System.out.println(usrLetter);
                attempts--;
            } else {
                System.out.println("There isn't a letter!");
            }
        }
    }
}
