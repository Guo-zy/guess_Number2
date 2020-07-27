package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberProcessTest {
    @Test
    void should_return_win_when_getGameResult_given_correctNumber() {
        //given
        GuessNumberProcess guessNumberProcess = new GuessNumberProcess();

        //when
        guessNumberProcess.getGameResult("4A0B");

        //then
        assertEquals("win" , guessNumberProcess.getResultMessage());


    }

}