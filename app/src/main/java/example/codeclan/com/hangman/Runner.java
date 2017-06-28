package example.codeclan.com.hangman;

/**
 * Created by user on 28/06/2017.
 */

public class Runner {


    public static void main(String[] args) {
        Game game = new Game();
//        Word word = new Word("Hello");
        game.chooseNewWord();
        game.makeGuess();
        game.play();



    }
}
