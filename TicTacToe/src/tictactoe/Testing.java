package tictactoe;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Testing {
     Test.assertEquals(abbrevName("Sam Harris"), "S.H");


    public class SolutionTest {
        @Test
        public void basicTests() {
            assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        }
    }   
}