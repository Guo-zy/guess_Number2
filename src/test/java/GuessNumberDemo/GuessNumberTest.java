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

    @Test
    void should_return_0A0B_when_play_given_input_1234_and_answer_5678() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int [] inputNumbers = {1,2,3,4};
        int [] answer = {5,6,7,8};

        //when
        String res = guessNumber.play(answer , inputNumbers);

        //then
        assertEquals("0A0B" , res);
    }

    @Test
    void should_return_2A0B_when_play_given_input_1234_and_answer_1256() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int [] inputNumbers = {1,2,3,4};
        int [] answer = {1,2,5,6};

        //when
        String res = guessNumber.play(answer , inputNumbers);

        //then
        assertEquals("2A0B" , res);
    }

    @Test
    void should_return_0A2B_when_play_given_input_1234_and_answer_3456() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int [] inputNumbers = {1,2,3,4};
        int [] answer = {3,4,5,6};

        //when
        String res = guessNumber.play(answer , inputNumbers);

        //then
        assertEquals("0A2B" , res);
    }

    @Test
    void should_return_1A1B_when_play_given_input_1234_and_answer_1562() {
        //given
        GuessNumber guessNumber = new GuessNumber();
        int [] inputNumbers = {1,2,3,4};
        int [] answer = {1,5,6,2};

        //when
        String res = guessNumber.play(answer , inputNumbers);

        //then
        assertEquals("1A1B" , res);
    }
}