package GuessNumberDemo;


import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;

class InputNumberValidTest {

    @Test
    void should_return_input_is_null_when_checkInputNull_given_null() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {};

        //when
        String res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //then
        assertEquals("input is null" , res);

    }

    @Test
    void should_return_inputNumbersLength_is_invalid_when_checkInputLength_given_invalidNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3};

        //when
        String res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //given
        assertEquals("inputNumbersLength is invalid" , res);
    }

    @Test
    void should_return_input_is_valid_when_checkInputNumbers_validNumbers() {
        //given
        InputNumberValid isInputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,3,4};

        //when
        String  res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //given
        assertEquals("input is valid" , res);
    }

    @Test
    void should_return_input_is_repeat_when_checkNumbersRepeat_given_repeatNumbers() {
        //given
        InputNumberValid inputNumberValid = new InputNumberValid();
        int []inputNumbers = {1,2,2,3};

        //when
        String res = inputNumberValid.checkInputNumbers(inputNumbers);

        //then
        assertEquals("input is repeat" , res);
    }
}