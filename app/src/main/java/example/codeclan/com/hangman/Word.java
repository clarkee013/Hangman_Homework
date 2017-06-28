package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Word {

//    word class only takes in the word for the users to guess letters from

    protected String word;

    protected Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String setWord(String input) {
        return word;
    }

    //loops through the index of the word to get an index for each letter and matches the index and letter to the guess
    public String checkGuess(char guess) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c == guess) {
                sb.append(c);
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }



}