package GuessNumberDemo;

import java.util.HashSet;

public class InputNumberValid {

    private String wrongMes;
    private final String inputIsNull = "input is null";
    private final String inputNumberLengthIsInvalid = "inputNumberLength is invalid";
    private final String inputNumberIsRepeat = "inputNumber is repeat";
    private final String numberIsOutOfRange = "number is out of range";
    private final int leftRange = 0;
    private final int rightRange = 10;
    private final int validLength = 4;

    public void setWrongMes(String wrongMes) {
        this.wrongMes = wrongMes;
    }

    public String getWrongMes() {
        return wrongMes;
    }

    public boolean isInputNumbersValid(int[] inputNumbers) {
        if (isInputNull(inputNumbers)) {
            setWrongMes(inputIsNull);
            return false;
        }
        if (isInputLengthInvalid(inputNumbers)) {
            setWrongMes(inputNumberLengthIsInvalid);
            return false;
        }
        if (isNumbersRepeat(inputNumbers)) {
            setWrongMes(inputNumberIsRepeat);
            return false;
        }
        if (isNumbersOutOfRange(inputNumbers)) {
            setWrongMes(numberIsOutOfRange);
            return false;
        }

        return true;
    }

    protected boolean isInputNull(int[] inputNumbers) {
        return inputNumbers == null || inputNumbers.length == 0;
    }

    protected boolean isInputLengthInvalid(int[] inputNumbers) {
        return inputNumbers.length != validLength;
    }

    protected boolean isNumbersRepeat(int[] inputNumbers) {
        int inputSize = inputNumbers.length;
        HashSet<Integer> Hset = new HashSet<Integer>();
        for (int num : inputNumbers) {
            Hset.add(num);
        }
        return inputSize != Hset.size();
    }

    protected boolean isNumbersOutOfRange(int[] inputNumbers) {
        for (int num : inputNumbers) {
            if (num < leftRange || num >= rightRange) return true;
        }
        return false;
    }


}
