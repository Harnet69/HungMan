package com.harnet;

import java.util.Random;

public class Data {
    private String[] wordsForGuess = {"Adam", "Mirek", "Pawel", "Basia", "Mateusz", "Maciej", "Mikolaj", "Szymon", "Piotr"};
    public String rndWord; // can't do it private and use a getter
    public String hidedWord; // 'starred guessing word'

    public Data(String rndWord) {
        this.rndWord = this.getRndWord();
    }

    public String getHidedWord() {
        return hidedWord;
    }

    public void setHidedWord(String hidedWord) {
        this.hidedWord = hidedWord;
    }

    private String getRndWord() {
        Random rand = new Random(); //instance of random class
        String wordForGuess = wordsForGuess[rand.nextInt(wordsForGuess.length)];
        hidedWord = "*".repeat(wordForGuess.length());
//        System.out.println(hidedWord);
        return wordForGuess;
    }
}
