package GuessNumberDemo;

public class InputNumberValid {

    public String checkInputNumbers(int[] inputNumbers) {
        String input_is_null = checkInputNull(inputNumbers);
        if("input is null".equals(input_is_null)) return input_is_null;

        String inputNumbersLength_is_invalid = checkInputLength(inputNumbers);
        if("inputNumbersLength is invalid".equals(inputNumbersLength_is_invalid)) return inputNumbersLength_is_invalid;

        return "input is valid";
    }

    public String checkInputNull(int[] inputNumbers) {

        if(inputNumbers == null || inputNumbers.length == 0)  return "input is null";
        return null;
    }

    public String checkInputLength(int[] inputNumbers) {

        if(inputNumbers.length != 4) return "inputNumbersLength is invalid";
        return null;
    }



}
