package example.codeclan.com.hangman;

import java.util.Scanner;

/**
 * Created by user on 28/06/2017.
 */

public class User {

//    User class will create new users with 6 lives

    public String name;
    public int hearts = 6;

    public User(String name, int hearts) {
        this.name = name;
        this.hearts = hearts;
    }

    public int getHearts() {
        return hearts;
    }

    public int minusHeart() {
        hearts -= 1;
        return hearts;
    }

    public boolean checkDeath() {
        if (hearts >= 0) {
            return true;
            }
        return false;
        }


    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

//    public boolean checkDeath(){
//        return hearts > 0;
//    }


}