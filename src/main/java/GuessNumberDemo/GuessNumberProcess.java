package GuessNumberDemo;

public class GuessNumberProcess {

    private static  int answerTime = 0;
    private String resultMessage;
    private final String noChanceAnswer = "no chance answer";
    private final String correctResult = "4A0B";
    private final String prompt = "wrongAnswer , Prompt : ";
    private final String gameWin = "win";
    private final int maxAnswerTimes = 6;

    public boolean getGameResult(String guessNumber) {
        answerTime ++;
        if (isAnswerMoreThan6Times()){
            return false;
        }
         if(isResultCorrect(guessNumber)){
            return true;
        }
        return false;
    }

    private boolean isAnswerMoreThan6Times() {
        if (answerTime > maxAnswerTimes) {
            setResultMessage(noChanceAnswer);
            return true;
        }
        return false;
    }

    private boolean isResultCorrect(String guessNumber) {
        if(guessNumber.equals(correctResult)){
            setResultMessage(gameWin);
            return true;
        }
        setResultMessage(prompt + guessNumber);
        return false;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public static int getAnswerTime() {
        return answerTime;
    }

    public static void setAnswerTime(int answerTime) {
        GuessNumberProcess.answerTime = answerTime;
    }
}
