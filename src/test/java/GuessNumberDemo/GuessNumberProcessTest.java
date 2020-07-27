package GuessNumberDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberProcessTest {
    @Test
    void should_return_game_over_when_isTry_over_6_time_then_given_tryTime_is_7() {
        //given
        GuessNumberProcess guessNumberProcess = new GuessNumberProcess();
        int tryTime = 7;

        //when
        String res = guessNumberProcess.getGameResult(tryTime);

        //then
        assertEquals("tryTime over 6 time , game over" , res );
    }

    @Test
    void should_return_wrong_question_when_checkGuessNumber_then_given_wrong_GuessNumber() {
        //given
    }
}