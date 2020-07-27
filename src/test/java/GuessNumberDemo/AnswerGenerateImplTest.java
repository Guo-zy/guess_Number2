package GuessNumberDemo;

import org.junit.jupiter.api.Test;

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
        assertEquals(true , isRepeat);

    }


}