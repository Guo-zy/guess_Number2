package GuessNumberDemo;

public class GuessNumber {

    private int []answer;

    public  GuessNumber(AnswerGenerate answerGenerate){
        answer = answerGenerate.generate();
    }

    public String play(int[] inputNumbers) {

            String A = String.valueOf(findA(answer, inputNumbers));
            String B = String.valueOf(findB(answer, inputNumbers));
            return A + "A" + B + "B";
    }

    private int findB(int[] answer, int[] inputNumbers) {
        int B = 0;
        int[] base = new int[10];
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != inputNumbers[i]) {
                base[answer[i]]++;
                base[inputNumbers[i]]++;
            }
        }
        for (int num : base) {
            if (num == 2) B++;
        }
        return B;
    }

    private int findA(int[] answer, int[] inputNumbers) {
        int A = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == inputNumbers[i]) A++;
        }
        return A;
    }


}
