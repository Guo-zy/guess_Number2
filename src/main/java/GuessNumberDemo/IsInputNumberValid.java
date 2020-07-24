package GuessNumberDemo;

public class IsInputNumberValid {

    public String checkInputNull(int[] inputNumbers) {

        if(inputNumbers == null || inputNumbers.length == 0)  return "input is null";
        return "input is valid";
    }

    public String checkInputLength(int[] inputNumbers) {
        if(inputNumbers.length != 4) return "inputNumbersLength is invalid";
        return null;
    }
}
