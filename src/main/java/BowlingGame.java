public class BowlingGame {

    private int score = 0;
    private int rolls[] = new int [21];
    private int count =0;

    public void roll(int pins) {
        score += pins;
        rolls[count] = pins;
        count++;
    }

    public int score() {
        return score;
    }
}
