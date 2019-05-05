import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest extends TestCase {

    private BowlingGame bowlingGame;

    @Before
    public void setUp(){
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testGutterGame () throws Exception {
        multipleThrow(20, 0);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAll1Game () throws Exception {
        multipleThrow(20, 1);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testOneSpare () throws Exception {
        rollSpare();
        bowlingGame.roll(3);
        multipleThrow(17,0);
        assertEquals(16, bowlingGame.score());
    }

    @Test
    public void testOneStrike () throws Exception {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        multipleThrow(16,0);
        assertEquals(24, bowlingGame.score());
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }

    private void multipleThrow(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            bowlingGame.roll(pins);
        }
    }

}
