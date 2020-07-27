package GuessNumberDemo;

import java.util.HashSet;
import java.util.Random;

public class AnswerGenerateImpl implements AnswerGenerate {

    @Override
    public int[] generate() {
        int[] answer = getRandom4Numbers();
        if(isAnswerLengthInvalid(answer)) return null;
        if(isAnswerRepeat(answer)) return null;
        return answer;
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

    protected boolean isAnswerRepeat(int[] answer) {
        int inputSize = answer.length;
        HashSet<Integer> Hset = new HashSet<Integer>();
        for (int num : answer) {
            Hset.add(num);
        }
        if (inputSize != Hset.size()) return true;
        return false;
    }

    protected boolean isAnswerLengthInvalid(int[] answer) {
        if(answer.length != 4) return true;
             return false;
    }
}
