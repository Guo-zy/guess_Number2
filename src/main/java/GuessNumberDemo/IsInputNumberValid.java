package GuessNumberDemo;

public class IsInputNumberValid {

    public String checkInputNull(int[] inputNumbers) {

        if(inputNumbers == null || inputNumbers.length == 0)  return "input is null";
        return "input is valid";
    }
}
