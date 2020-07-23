package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
4A0B、0A4B、2A0B、0A2B
1A1B、0A0B
 */
public class GuessNumberTest {



    @Test
    void should_return_4A0B_when_play_given_input_1234_and_answer_1234() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int [] inputNumbers = {1,2,3,4};
        int [] answer = {1,2,3,4};

        //when
        String res = guessNumber.play(answer , inputNumbers);

        //then
        assertEquals("4A0B" , res);
    }
}