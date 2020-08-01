package GuessNumberDemo;

import java.util.HashSet;
import java.util.Random;

public class AnswerGenerateImpl implements AnswerGenerate {

    @Override
    public int[] generate() {
        int[] answer = getRandom4Numbers();
        if (isAnswerLengthInvalid(answer)) return null;
        if (isAnswerRepeat(answer)) return null;
        return answer;
    }


    private int[] getRandom4Numbers() {
        int[] answer = new int[4];
        boolean[] isUse = new boolean[10];
        Random random = new Random();
        int randomNum;
        for (int index = 0; index < 4; index ++) {
            do {
                randomNum = random.nextInt(10);
            } while (isUse[randomNum]);
            answer[index] = randomNum;
            isUse[randomNum] = true;
        }
        return answer;
    }

    protected boolean isAnswerRepeat(int[] answer) {
        int inputSize = answer.length;
        HashSet<Integer> Hset = new HashSet<Integer>();
        for (int num : answer) {
            Hset.add(num);
        }
        return inputSize != Hset.size();
    }

    protected boolean isAnswerLengthInvalid(int[] answer) {
        return answer.length != 4;
    }

    protected  boolean isAnswerOutOfRange(int [] answer){
        for (int num : answer){
            if (num > 9 || num < 0) return true;
        }
        return false;
    }
}
