package com.harnet;

import java.util.Random;

public class Data {
    private String[] wordsForGuess = {"Adam", "Mirek", "Pawel", "Basia", "Mateusz", "Maciej", "Mikolaj", "Szymon", "Piotr"};
    public String rndWord; // can't do it private and use a getter
    public String hidedWord; // 'starred guessing word'

    public Data() {
        this.rndWord = this.getRndWord();
        this.hidedWord = "*".repeat(this.rndWord.length());
    }

    public String getHidedWord() {
        return hidedWord;
    }

    public void setHidedWord(String hidedWord) {
        this.hidedWord = hidedWord;
    }

    private String getRndWord() {
        Random rand = new Random(); //instance of random class
        return wordsForGuess[rand.nextInt(wordsForGuess.length)];
    }

    // find indexes of given letters in the word
    public boolean isLetterExists(String word, char letter){
        for (int i = -1; (i = word.indexOf(letter, i + 1)) != -1; i++) {
            starsToLetters(i, letter);
        }
        if(word.indexOf(letter) > 0) {
            return true;
        } else {
            return false;
        }
    }

    // replace the letter in starred word
    private void starsToLetters(int ltrInd, char x) {
        StringBuilder hidedWord = new StringBuilder(this.hidedWord);
        hidedWord.setCharAt(ltrInd, x);

        this.hidedWord = hidedWord.toString();
    }

}
