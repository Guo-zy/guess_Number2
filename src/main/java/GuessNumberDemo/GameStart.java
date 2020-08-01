package GuessNumberDemo;


import java.util.Scanner;

public class GameStart {

    private static final GuessNumber guessNumber = new GuessNumber(new AnswerGenerateImpl());
    private static final GuessNumberProcess guessNumberProcess = new GuessNumberProcess();
    private static final InputNumberValid inputNumberValid = new InputNumberValid();
    private static final int answerMaxTimes = 6;

    public GameStart() {
        play();
    }

    private void play() {
        int[] answer = guessNumber.getAnswer();
        for (int i = 1; ; i++) {
            System.out.print(i + " time answer : ");
            int[] inputNumber = getInputNumber();
            if (!inputNumberValid.isInputNumbersValid(inputNumber)){
                timesPlusOne();
                System.out.println(inputNumberValid.getWrongMes());
            }
            else {
                String result = guessNumber.getResult(inputNumber);
                if (getTimes() > answerMaxTimes) {
                    System.out.println(guessNumberProcess.getResultMessage());
                    System.out.println("correct answer : " +
                            String.format("%d%d%d%d", answer[0], answer[1], answer[2], answer[3]));
                    break;
                }
                if (guessNumberProcess.getGameResult(result)) {
                    System.out.println(guessNumberProcess.getResultMessage());
                    break;
                }
                System.out.println(guessNumberProcess.getResultMessage());
            }
        }
    }


    public static void main(String[] args) {
        GameStart gameStart = new GameStart();
    }

    private void timesPlusOne(){
        GuessNumberProcess.setAnswerTime(GuessNumberProcess.getAnswerTime() + 1);
    }

    private int getTimes(){
        return GuessNumberProcess.getAnswerTime();
    }

    private int[] getInputNumber() {
        int[] inputNumber = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 4; index++) {
            inputNumber[index] = scanner.nextInt();
        }
        return inputNumber;
    }
}
