import junit.framework.TestCase;
import org.junit.Test;

public class BowlingGameTest extends TestCase {

    @Test
    public void testGutterGame () throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        for(int i = 0 ;i< 20 ;i++){
            bowlingGame.roll(0);
            assertEquals(0, bowlingGame.score());
        }
    }

    @Test
    public void testAll1Game () throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        for(int i = 0 ;i< 20 ;i++){
            bowlingGame.roll(0);
            assertEquals(20, bowlingGame.score());
        }
    }

}
