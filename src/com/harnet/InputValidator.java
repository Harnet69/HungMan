package com.harnet;

public class InputValidator {

    public static boolean isLetter(char[] userLetter){
        return (userLetter.length == 1 && userLetter[0] != ' ' && Character.isLetter(userLetter[0]));
    }
}
