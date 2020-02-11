package com.harnet;

import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public char[] getPlayerLetter() {
        System.out.print("Give a suggested letter: ");
        Scanner in = new Scanner(System.in);
        String userLetter = in.nextLine();
        char[] userChar = userLetter.toLowerCase().toCharArray();// lovercase user input
//        in.close(); //??? we'll see if it'll be necessary
        return userChar;
    }
}
