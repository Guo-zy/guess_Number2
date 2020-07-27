package GuessNumberDemo;

import java.util.Random;

public class AnswerGenerateImpl implements AnswerGenerate {

    @Override
    public int[] generate() {
        int[] answer = getRandom4Numbers();
        return new int[0];
    }

    private int[] getRandom4Numbers() {
        int[] ansnwer = new int[4];
        boolean[] isUse = new boolean[4];
        Random random = new Random();
        int randomNum;
        for (int index = 0; index < 4; index++) {
            do {
                randomNum = random.nextInt(10);
            } while (isUse[randomNum]);
            ansnwer[index] = randomNum;
            isUse[randomNum] = true;
        }
        return ansnwer;
    }
}
