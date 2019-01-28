import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    @Test
    public void should_display_zero_score_when_the_game_starts(){
        TennisGame tennisGame = new TennisGame();
        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_fifteen_to_zero_as_game_score_when_the_first_player_wins_the_first_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("15 _ 0");
    }

    @Test
    public void should_display_thirty_to_fifteen_when_the_first_player_wins_tow_points_and_the_second_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("30 _ 15");
    }

    @Test
    public void should_be_added_10_to_the_score_game_when_the_first_player_wins_one_point_and_his_score_is_30_and_the_second_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.secondPlayerWinsOnePoint();
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("40 _ 15");
    }

    @Test
    public void should_display_forty_to_forty_when_the_first_and_the_second_player_win_3_point_each_one(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.secondPlayerWinsOnePoint();
        tennisGame.firstPlayerWinsOnePoint();
        tennisGame.secondPlayerWinsOnePoint();
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("40 _ 40");
    }
    @Test
    public void should_display_zero_to_zero_as_score_game_when_the_score_was_40_30_and_the_first_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(3);
        tennisGame.setScoreGamePlayerTow(2);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_forty_to_ADV_when_the_first_and_the_second_player_have_3_point_each_one_and_the_second_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(3);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("40 _ ADV");
    }

    @Test
    public void should_display_DEUCE_to_DEUCE_when_the_score_is_40_TO_ADV_and_the_first_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(3);
        tennisGame.setScoreGamePlayerTow(4);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("DEUCE _ DEUCE");
    }

    @Test
    public void should_display_ADV_to_forty_when_the_score_is_DEUCE_TO_DEUCE_and_the_first_player_wins_one_point(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(5);
        tennisGame.setScoreGamePlayerTow(5);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("ADV _ 40");
    }

    @Test
    public void should_display_zero_to_zero_when_the_score_was_ADV_40_and_the_first_player_wins_the_point_and_wins_the_game(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(4);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_zero_score_for_the_set_when_the_game_starts(){
        TennisGame tennisGame = new TennisGame();
        assertThat(tennisGame.getScoreSet()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_zero_zero_as_set_score_when_the_first_player_wins_one_point_and_the_score_game_was_0_15(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(0);
        tennisGame.setScoreGamePlayerTow(1);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_one_To_Zero_as_set_score_when_the_first_player_wins_one_point_and_the_score_game_was_40_30(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreGamePlayerOne(3);
        tennisGame.setScoreGamePlayerTow(2);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 0");
    }

    @Test
    public void should_display_one_three_as_set_score_when_the_second_player_wins_one_point_and_the_score_game_was_30_40_and_the_score_set_was_1_to_2(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(1);
        tennisGame.setScoreSetPlayerTow(2);
        tennisGame.setScoreGamePlayerOne(2);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 3");
    }

    @Test
    public void should_display_one_six_as_set_score_when_the_second_player_wins_one_point_and_the_score_game_was_30_40_and_the_score_set_was_1_to_5(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(1);
        tennisGame.setScoreSetPlayerTow(5);
        tennisGame.setScoreGamePlayerOne(2);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreSet()).isEqualTo("1 _ 6");
    }

    @Test
    public void should_display_the_first_player_as_winner_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_5_to_4() {
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(5);
        tennisGame.setScoreSetPlayerTow(4);
        tennisGame.setScoreGamePlayerOne(4);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("Player 1 wins the match");
    }

    @Test
    public void Should_display_the_match_has_not_finished_yet_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_5_to_5(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(5);
        tennisGame.setScoreSetPlayerTow(5);
        tennisGame.setScoreGamePlayerOne(4);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("the match has not finished yet");
    }

    @Test
    public void Should_display_Player_1_wins_the_match_when_the_first_player_wins_one_point_and_the_score_game_was_ADV_40_and_the_score_set_was_6_to_5(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(5);
        tennisGame.setScoreGamePlayerOne(4);
        tennisGame.setScoreGamePlayerTow(3);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("Player 1 wins the match");
        assertThat(tennisGame.getScoreSet()).isEqualTo("7 _ 5");
    }

    @Test
    public void Should_display_the_match_has_not_finished_yet_when_the_second_player_wins_one_point_and_the_score_game_was_40_ADV_and_the_score_set_was_6_to_5(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(5);
        tennisGame.setScoreGamePlayerOne(3);
        tennisGame.setScoreGamePlayerTow(4);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("the match has not finished yet");
    }

    @Test
    public void Should_display_6_6_as_score_set_when_the_second_player_wins_one_point_and_the_the_score_set_was_6_to_6(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(6);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
        assertThat(tennisGame.getScoreSet()).isEqualTo("6 _ 6");
    }


    @Test
    public void Should_display_0_1_as_Tie_Break_Score_when_the_second_player_wins_one_point_and_the_the_score_set_was_6_to_6(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(6);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreTieBreak()).isEqualTo("0 _ 1");
    }

    @Test
    public void Should_display_the_match_has_not_finished_yet_when_the_second_player_wins_one_point_and_the_score_tie_break_was_6_6(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(6);
        tennisGame.setScoreTieBreakPlayerOne(6);
        tennisGame.setScoreTieBreakPlayerTow(6);
        tennisGame.secondPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("the match has not finished yet");
    }

    @Test
    public void Should_display_0_0_as_Tie_Break_score_when_the_first_player_wins_one_point_and_the_score_tie_break_was_6_2(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(6);
        tennisGame.setScoreTieBreakPlayerOne(6);
        tennisGame.setScoreTieBreakPlayerTow(2);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getScoreTieBreak()).isEqualTo("0 _ 0");
    }

    @Test
    public void Should_display_Player_1_wins_the_match_when_the_first_player_wins_one_point_and_the_score_tie_break_was_6_2(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.setScoreSetPlayerOne(6);
        tennisGame.setScoreSetPlayerTow(6);
        tennisGame.setScoreTieBreakPlayerOne(6);
        tennisGame.setScoreTieBreakPlayerTow(2);
        tennisGame.firstPlayerWinsOnePoint();
        assertThat(tennisGame.getTheWinner()).isEqualTo("Player 1 wins the match");
        assertThat(tennisGame.getScoreSet()).isEqualTo("7 _ 6");
    }
}