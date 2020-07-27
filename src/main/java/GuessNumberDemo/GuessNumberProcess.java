package GuessNumberDemo;

public class GuessNumberProcess {

    private String resultMessage;

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public boolean getGameResult(String guessNumber) {
            if(guessNumber.equals("4A0B")){
                setResultMessage("win");
                return true;
            }
            return false;
    }

}
