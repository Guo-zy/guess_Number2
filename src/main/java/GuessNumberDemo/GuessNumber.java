package GuessNumberDemo;

public class GuessNumber {

    public String play(int[] answer, int[] inputNumbers) {
        if(is4A08(answer , inputNumbers)){
            return "4A0B";
        }
        return "0A4B";
    }

    private boolean is4A08(int[] answer, int[] inputNumbers) {
        for(int i = 0; i < answer.length; i ++){
            if(answer[i] != inputNumbers[i]) return false;
        }
        return true;
    }


}
