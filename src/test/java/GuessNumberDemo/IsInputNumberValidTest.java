package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsInputNumberValidTest {

    @Test
    void should_return_input_is_null_when_checkInputNull_given_null() {
        //given
        IsInputNumberValid isInputNumberValid = new IsInputNumberValid();
        int []inputNumbers = {};

        //when
        String res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //then
        assertEquals("input is null" , res);

    }

    @Test
    void should_return_inputNumbersLength_is_invalid_when_checkInputLength_given_invalidNumbers() {
        //given
        IsInputNumberValid isInputNumberValid = new IsInputNumberValid();
        int []inputNumbers = {1,2,3};

        //when
        String res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //given
        assertEquals("inputNumbersLength is invalid" , res);
    }

    @Test
    void should_return_input_is_valid_when_checkInputNumbers_validNumbers() {
        //given
        IsInputNumberValid isInputNumberValid = new IsInputNumberValid();
        int []inputNumbers = {1,2,3,4};

        //when
        String  res = isInputNumberValid.checkInputNumbers(inputNumbers);

        //given
        assertEquals("input is valid" , res);
    }
}