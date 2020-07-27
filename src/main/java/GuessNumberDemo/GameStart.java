package GuessNumberDemo;


import java.util.Scanner;

public class GameStart {

    private static GuessNumber guessNumber = new GuessNumber(new AnswerGenerateImpl());
    private static GuessNumberProcess guessNumberProcess = new GuessNumberProcess();
    private static InputNumberValid inputNumberValid = new InputNumberValid();

    public GameStart() {
        int []answer  = guessNumber.getAnswer();
        for (int i = 1; ; i++) {
            System.out.print(i + " time answer : ");
            int[] inputNumber = getInputNumber();
            if (!inputNumberValid.isInputNumbersValid(inputNumber))
                System.out.println(inputNumberValid.getWrongMes());
            else {
                String result = guessNumber.getResult(inputNumber);
                if(guessNumberProcess.getGameResult(result)) {
                    System.out.println(guessNumberProcess.getResultMessage());
                    break;
                }
                if (GuessNumberProcess.getAnswerTime() > 6) {
                    break;
                }
                System.out.println(guessNumberProcess.getResultMessage());
                System.out.println("correct answer : " +
                        String.format("%d%d%d%d",answer[0],answer[1],answer[2],answer[3]));
            }
        }
    }

    public static void main(String[] args) {
        GameStart gameStart = new GameStart();
    }

    private static int[] getInputNumber() {
        int[] inputNumber = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 4; index++) {
            inputNumber[index] = scanner.nextInt();
        }
        return inputNumber;
    }
}
