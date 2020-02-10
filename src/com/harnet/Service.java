package com.harnet;

import java.util.Random;

public class Service {
    private String[] wordsForGuess = {"Adam", "Mirek", "Pawel", "Basia", "Mateusz", "Maciej", "Mikolaj", "Szymon", "Piotr"};
    public String rndWord; // can't do it private and use a getter

    public Service(String rndWord) {
        this.rndWord = this.getRndWord();
    }

    private String getRndWord() {
        Random rand = new Random(); //instance of random class
        return wordsForGuess[rand.nextInt(wordsForGuess.length)];
    }
}
