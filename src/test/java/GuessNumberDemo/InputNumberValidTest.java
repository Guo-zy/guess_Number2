package GuessNumberDemo;


import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;

class InputNumberValidTest {

    @Test
    void should_return_true_when_isInputNull_given_null_number() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {};

        //when
        boolean input_is_null = isInputNumberValid.isInputNull(inputNumbers);

        //then
        assertEquals(true , input_is_null);

    }


    @Test
    void should_return_true_when_isInputLengthInvalid_given_invalidLengthNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3};

        //when
        boolean res = isInputNumberValid.isInputLengthInvalid(inputNumbers);

        //given
        assertEquals(true , res);
    }

    @Test
    void should_return_false_when_isInputLengthInvalid_validNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3,4};

        //when
        boolean res = isInputNumberValid.isInputLengthInvalid(inputNumbers);

        //given
        assertEquals(false , res);
    }

    @Test
    void should_return_true_when_isNumbersRepeat_given_repeatNumbers() {
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,2,3};

        //when
        boolean res = inputNumberValid.isNumbersRepeat(inputNumbers);

        //then
        assertEquals(true , res);
    }

    @Test
    void should_return_input_is_null_when_isInputNumbersValid_given_null_number(){
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {};

        //when
         inputNumberValid.isInputNumbersValid(inputNumbers);

        //given
        assertEquals("input is null" , inputNumberValid.getWrongMes());

    }

    @Test
    void should_return_inputNumberLength_is_invalid_when_isInputNumbersValid_given_invalidLengthNumber(){
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3};

        //when
        inputNumberValid.isInputNumbersValid(inputNumbers);

        //given
        assertEquals("inputNumberLength is invalid" , inputNumberValid.getWrongMes());

    }

    @Test
    void should_return_inputNumber_is_repeat_when_isInputNumbersValid_given_repeatNumber(){
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,2,3};

        //when
        inputNumberValid.isInputNumbersValid(inputNumbers);

        //given
        assertEquals("inputNumber is repeat" , inputNumberValid.getWrongMes());

    }
}