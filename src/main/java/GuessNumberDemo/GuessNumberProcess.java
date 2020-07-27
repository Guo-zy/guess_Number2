package GuessNumberDemo;

public class GuessNumberProcess {

    private String resultMessage;

    public boolean getGameResult(String guessNumber , int answerTime) {
        if (isAnswerMoreThan5Times(answerTime)){
            return false;
        }
        if(isResultCorrect(guessNumber)){
            return true;
        }
        return false;
    }

    private boolean isAnswerMoreThan5Times(int answerTime) {
        if (answerTime >= 6) {
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
        setResultMessage("wrongAnswer");
        return false;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

}
