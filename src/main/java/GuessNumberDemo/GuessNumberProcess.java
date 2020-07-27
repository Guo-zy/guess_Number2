package GuessNumberDemo;

public class GuessNumberProcess {


    private String isTryOver6Time(int tryTime) {
        if(tryTime >= 7) return "tryTime over 6 time , game over";
        return  null;
    }

    public String getGameResult(int tryTime){
        String tryOver6Time = isTryOver6Time(tryTime);
        if("tryTime over 6 time , game over".equals(tryOver6Time)) return tryOver6Time;

        return null;
    }
}
