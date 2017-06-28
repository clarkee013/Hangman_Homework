package example.codeclan.com.hangman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/06/2017.
 */

public class UserTest {

    private User user;

    @Before
    public void before(){
        user = new User("Bob", 6);
    }

    @Test
    public void canCreateNewUser(){
        assertEquals("Bob", user.getName());
    }

    @Test
    public void canSetNewUserName(){
        assertEquals("Jim", user.setName("Jim"));
    }

    @Test
    public void canGetHearts(){
        assertEquals(6, user.getHearts());
    }

    @Test
    public void minusHeart(){
        assertEquals(5, user.minusHeart());
    }
}
