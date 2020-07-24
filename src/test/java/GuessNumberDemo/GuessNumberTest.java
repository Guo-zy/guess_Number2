package GuessNumberDemo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


public class GuessNumberTest {

    private AnswerGenerate answerGenerate;

    @BeforeEach
    void genrateAnswer() {
        int[] answer = {1, 2, 3, 4};
        answerGenerate = Mockito.mock(AnswerGenerate.class);
        when(answerGenerate.generate()).thenReturn(answer);
    }

    @Test
    void should_return_4A0B_when_play_given_input_1234_and_answer_1234() {
        //given
        int[] inputNumbers = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("4A0B", res);
    }

    @Test
    void should_return_0A0B_when_play_given_input_1234_and_answer_5678() {
        //given
        int[] inputNumbers = {5, 6, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("0A0B", res);
    }

    @Test
    void should_return_2A0B_when_play_given_input_1234_and_answer_1256() {
        //given
        int[] inputNumbers = {1, 2, 5, 6};
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("2A0B", res);
    }

    @Test
    void should_return_0A2B_when_play_given_input_1234_and_answer_3456() {
        //given
        int[] inputNumbers = {3, 4, 5, 6};
        int[] answer = {1, 2, 3, 4};;
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("0A2B", res);
    }

    @Test
    void should_return_1A1B_when_play_given_input_1234_and_answer_1562() {
        //given

        int[] inputNumbers = {1, 5, 6, 2};
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("1A1B", res);
    }

    @Test
    void should_return_0A4B_when_play_given_input_1234_and_answer_4321() {
        //given

        int[] inputNumbers = {4, 3, 2, 1};
        GuessNumber guessNumber = new GuessNumber(answerGenerate);

        //when
        String res = guessNumber.play(inputNumbers);

        //then
        assertEquals("0A4B", res);
    }

    class AnswerGenerate_1234 implements AnswerGenerate {

        private int[] answer;

        @Override
        public int[] generate() {
            return answer;
        }
    }
}