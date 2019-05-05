import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest extends TestCase {

    private BowlingGame bowlingGame;

    private void multipleThrow(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            bowlingGame.roll(pins);
        }
    }

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

}
