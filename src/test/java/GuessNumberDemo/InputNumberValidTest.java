package GuessNumberDemo;


import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;

class InputNumberValidTest {

    @Test
    void should_return_true_when_checkInputNull_given_null_number() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {};

        //when
        boolean input_is_null = isInputNumberValid.isInputNull(inputNumbers);

        //then
        assertEquals(true , input_is_null);

    }


    @Test
    void should_return_true_when_checkInputLength_given_invalidLengthNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3};

        //when
        boolean res = isInputNumberValid.isInputLengthInvalid(inputNumbers);

        //given
        assertEquals(true , res);
    }

    @Test
    void should_return_input_is_valid_when_checkInputNumbers_validNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3,4};

        //when
        boolean  res = isInputNumberValid.isInputNumbersValid(inputNumbers);

        //given
        assertEquals("input is valid" , res);
    }

    @Test
    void should_return_input_is_repeat_when_checkNumbersRepeat_given_repeatNumbers() {
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,2,3};

        //when
        boolean res = inputNumberValid.isInputNumbersValid(inputNumbers);

        //then
        assertEquals("input is repeat" , res);
    }
}