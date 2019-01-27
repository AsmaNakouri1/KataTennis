import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    @Test
    public void should_display_zero_score_when_the_game_starts(){
        TennisGame tennisGame = new TennisGame();
        assertThat(tennisGame.getScoreGame()).isEqualTo("0 _ 0");
    }

    @Test
    public void should_display_fifteen_to_zero_as_game_score_and_zero_zero_as_set_score_when_the_first_player_wins_the_first_point(){
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
    public void should_display_zero_to_zero_when_the_score_was_40_30_and_player_tow_wins_the_point_and_wins_the_game(){
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
}