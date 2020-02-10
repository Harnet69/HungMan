package com.harnet;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Adam", 5);
        int attempts = player1.getAttemptsNum();

        while (attempts > 0) {
            char[] usrLetter = player1.getPlayerLetter();
            if (usrLetter.length == 1 && InputValidator.isLetter(usrLetter[0])) {
                System.out.println(usrLetter);
                attempts--;
            } else {
                System.out.println("There isn't a letter!");
            }
        }
    }
}
