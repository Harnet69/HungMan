package com.harnet;

import java.util.Scanner;

public class Player {
    private String name;
    private int attemptsNum;

    public Player(String name, int attemptsNum) {
        this.attemptsNum = attemptsNum;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptsNum() {
        return attemptsNum;
    }

    public char[] getPlayerLetter() {
        System.out.print("Give a suggested letter: ");
        Scanner in = new Scanner(System.in);
        String userLetter = in.nextLine();
        char[] userChar = userLetter.toCharArray();
//        in.close(); ??? we'll see if it'll be necessary
        return userChar;
    }
}
