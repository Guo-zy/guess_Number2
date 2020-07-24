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
        String res = isInputNumberValid.checkInputNull(inputNumbers);

        //then
        assertEquals("input is null" , res);

    }
}