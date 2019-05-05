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

        for(int i = 0 ;i < 20 ;i++){
            bowlingGame.roll(0);
        }
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAll1Game () throws Exception {
        for(int i = 0 ;i < 20 ;i++){
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.score());
    }

}
