package GuessNumberDemo;

public class GuessNumberProcess {

    private static  int answerTime = 1;
    private String resultMessage;

    public boolean getGameResult(String guessNumber) {
        if (isAnswerMoreThan6Times()){
            return false;
        }
        if(isResultCorrect(guessNumber)){
            return true;
        }
        answerTime ++;
        return false;
    }

    private boolean isAnswerMoreThan6Times() {
        if (answerTime > 6) {
            setResultMessage("no chance answer");
            return true;
        }
        return false;
    }

    private boolean isResultCorrect(String guessNumber) {
        if(guessNumber.equals("4A0B")){
            setResultMessage("win");
            return true;
        }
        setResultMessage("wrongAnswer , Prompt : " + guessNumber);
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
}
