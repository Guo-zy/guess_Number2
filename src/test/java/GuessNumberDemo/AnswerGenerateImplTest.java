package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AnswerGenerateImplTest {

    @Test
    void should_return_true_when_answerIsRepeat_given_repeatAnswer() {
        //given
        AnswerGenerateImpl answerGenerate = new AnswerGenerateImpl();
        int []answer = {1,2,2,4};

        //when
        boolean isRepeat = answerGenerate.isAnswerRepeat(answer);

        //then
        assertTrue(isRepeat);

    }
    @Test
    void should_return_true_when_AnswerLengthIsValid_given_InvalidLengthAnswer() {
        //given
        AnswerGenerateImpl answerGenerate = new AnswerGenerateImpl();
        int []answer = {1,2,2};

        //when
        boolean isRepeat = answerGenerate.isAnswerLengthInvalid(answer);

        //then
        assertTrue(isRepeat);

    }

    @Test
    void should_return_true_when_answer_is_out_of_range_given_out_of_range_answer(){
        //given
        AnswerGenerateImpl answerGenerate = new AnswerGenerateImpl();
        int [] answer = {1,2,3,-1};

        //when
        boolean isOutOfRange = answerGenerate.isAnswerOutOfRange(answer);

        //then
        assertTrue(isOutOfRange);
    }




}