package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberProcessTest {
    @Test
    void should_return_win_when_getGameResult_given_correctNumber() {
        //given
        GuessNumberProcess guessNumberProcess = new GuessNumberProcess();

        //when
        guessNumberProcess.getGameResult("4A0B" , 1);

        //then
        assertEquals("win" , guessNumberProcess.getResultMessage());
    }

    @Test
    void should_return_wrongAnswer_when_getGameResult_given_WrongNumber() {
        //given
        GuessNumberProcess guessNumberProcess = new GuessNumberProcess();

        //when
        guessNumberProcess.getGameResult("1A0B" , 1);

        //then
        assertEquals("wrongAnswer" , guessNumberProcess.getResultMessage());

    }

    @Test
    void should_return_noChanceAnswer_when_getGameResult_given_answer_more_than_5() {
        //given
        GuessNumberProcess guessNumberProcess = new GuessNumberProcess();
        int answerTime = 6;

        //when
        guessNumberProcess.getGameResult("4A0B" , answerTime);

        //then
        assertEquals("no chance answer" , guessNumberProcess.getResultMessage());

    }
}