package com.harnet;

public class InputValidator {

    public static boolean isLetter(char userLetter){
        return (userLetter != ' ' && Character.isLetter(userLetter));
    }
}
