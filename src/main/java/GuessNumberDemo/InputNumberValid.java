package GuessNumberDemo;

import java.util.HashSet;

public class InputNumberValid {

    private String wrongMes;

    public void setWrongMes(String wrongMes) {
        this.wrongMes = wrongMes;
    }

    public String getWrongMes() {
        return wrongMes;
    }

    public boolean isInputNumbersValid(int[] inputNumbers) {
        if (isInputNull(inputNumbers)) {
            setWrongMes("input is null");
            return false;
        }
        if (isInputLengthInvalid(inputNumbers)) {
            setWrongMes("inputNumberLength is invalid");
            return false;
        }
        if (isNumbersRepeat(inputNumbers)) {
            setWrongMes("inputNumber is repeat");
            return false;
        }

        return true;
    }

    protected boolean isInputNull(int[] inputNumbers) {

        if (inputNumbers == null || inputNumbers.length == 0) return true;
        return false;
    }

    protected boolean isInputLengthInvalid(int[] inputNumbers) {

        if (inputNumbers.length != 4) return true;
        return false;
    }

    protected boolean isNumbersRepeat(int[] inputNumbers) {
        int inputSize = inputNumbers.length;
        HashSet<Integer> Hset = new HashSet<Integer>();
        for (int num : inputNumbers) {
            Hset.add(num);
        }
        if (inputSize != Hset.size()) return true;
        return false;
    }


}
