package GuessNumberDemo;

import java.util.HashSet;

public class InputNumberValid {

    public String checkInputNumbers(int[] inputNumbers) {
        String input_is_null = checkInputNull(inputNumbers);
        if("input is null".equals(input_is_null)) return input_is_null;

        String inputNumbersLength_is_invalid = checkInputLength(inputNumbers);
        if("inputNumbersLength is invalid".equals(inputNumbersLength_is_invalid)) return inputNumbersLength_is_invalid;

        String inputNumber_is_repeat = checkNumbersRepeat(inputNumbers);
        if("input is repeat".equals(inputNumber_is_repeat)) return inputNumber_is_repeat;

        return "input is valid";
    }

    private String checkInputNull(int[] inputNumbers) {

        if(inputNumbers == null || inputNumbers.length == 0)  return "input is null";
        return null;
    }

    private String checkInputLength(int[] inputNumbers) {

        if(inputNumbers.length != 4) return "inputNumbersLength is invalid";
        return null;
    }

    private String checkNumbersRepeat(int[] inputNumbers){
        int inputSize = inputNumbers.length;
        HashSet<Integer> Hset = new HashSet<Integer>();
        for(int num: inputNumbers ){
            Hset.add(num);
        }
        if(inputSize != Hset.size()) return "input is repeat";
        return null;
    }



}
