package example.codeclan.com.hangman;

import java.util.Scanner;

import static android.R.attr.checkable;
import static android.R.attr.name;

/**
 * Created by user on 28/06/2017.
 */

public class Game {

//    Game class will handle the inputs from the user/s


    private Scanner sc;
    private Word word;
    private User user;

    public Game() {
        sc = new Scanner(System.in);
        user = new User("Bob", 6);
    }

    public void chooseNewWord() {
        System.out.println("Please enter new word");
        Scanner wordInput = new Scanner(System.in);
        String wordChoice = wordInput.nextLine();
//        System.out.println("The word you chose is " + wordChoice);
        word = new Word(wordChoice);
    }

    public void makeGuess() {
        System.out.println("Please enter your guess as a letter");
        Scanner guessInput = new Scanner(System.in);
        String guess = guessInput.nextLine();
        System.out.println(word.checkGuess(guess.charAt(0)));
    }


    public void play() {
        while (user.checkDeath()) {
            System.out.println("You have " + user.hearts + " remaining");
            makeGuess();
        }
    }

}

//  guess tracker needed
//  lose a heart for wrong guess needed
//  need to double check the checkDeath method as well

