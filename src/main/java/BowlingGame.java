public class BowlingGame {

    private int rolls[] = new int [21];
    private int count =0;

    public void roll(int pins) {
        rolls[count] = pins;
        count++;
    }

    public int score() {
        int score = 0;
        int index = 0;
        for(int frame = 0 ; frame < 10; frame++){
            if(isSpare(index)){
              score += 10 + getStrikeBonus(index, 2);
              index +=2;
            }else if(isStrike(rolls[index])){
                score += 10 + getSpareBonus(index);
                index++;
            } else {
                score += getPinsInFrame(index, index + 1);
                index += 2;
            }
        }
        return score;
    }

    private int getPinsInFrame(int index, int i) {
        return rolls[index] + rolls[i];
    }

    private int getStrikeBonus(int index, int i) {
        return rolls[index + i];
    }

    private int getSpareBonus(int index) {
        return rolls[index + 1] + rolls[index + 2];
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private boolean isSpare(int index) {
        return rolls[index] + rolls[index+1] == 10;
    }
}
