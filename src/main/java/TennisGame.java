import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private Integer scoreGamePlayerOne;
    private Integer scoreGamePlayerTow;
    private Map<Integer,String > pointToScoreGame;
    private Integer scoreSetPlayerOne;
    private Integer scoreSetPlayerTow;
    private String theWinner;

    private Integer scoreTieBreakPlayerOne;
    private Integer scoreTieBreakPlayerTow;

    public TennisGame() {
        this.scoreGamePlayerOne = 0;
        this.scoreGamePlayerTow = 0;

        this.pointToScoreGame = new HashMap<Integer, String>();
        this.pointToScoreGame.put(0,"0");
        this.pointToScoreGame.put(1,"15");
        this.pointToScoreGame.put(2,"30");
        this.pointToScoreGame.put(3,"40");
        this.pointToScoreGame.put(4,"ADV");
        this.pointToScoreGame.put(5,"DEUCE");

        this.scoreSetPlayerOne = 0;
        this.scoreSetPlayerTow = 0;

        this.theWinner = "the match has not finished yet";

        this.scoreTieBreakPlayerOne = 0;
        this.scoreTieBreakPlayerTow = 0;
    }

    public String getScoreGame() {
        StringBuilder scoreGame = new StringBuilder();
        scoreGame.append(pointToScoreGame.get(scoreGamePlayerOne));
        scoreGame.append(" _ ");
        scoreGame.append(pointToScoreGame.get(scoreGamePlayerTow));
        return scoreGame.toString();
    }

    public String getScoreSet() {
        StringBuilder scoreSet = new StringBuilder();
        scoreSet.append(scoreSetPlayerOne);
        scoreSet.append(" _ ");
        scoreSet.append(scoreSetPlayerTow);
        return scoreSet.toString();
    }

    public String getScoreTieBreak() {
        StringBuilder scoreTieBreak = new StringBuilder();
        scoreTieBreak.append(scoreTieBreakPlayerOne);
        scoreTieBreak.append(" _ ");
        scoreTieBreak.append(scoreTieBreakPlayerTow);
        return scoreTieBreak.toString();
    }

    public void firstPlayerWinsOnePoint() {
        if(scoreSetPlayerTow==6 && scoreSetPlayerOne == 6) firstPlayerWinsOneTieBreakPoint();
        else{
            if(scoreGamePlayerOne>=3) firstPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
            else
                scoreGamePlayerOne = scoreGamePlayerOne + 1;
        }
    }

    private void firstPlayerWinsOneTieBreakPoint() {
        scoreTieBreakPlayerOne = scoreTieBreakPlayerOne +1;
        if(scoreTieBreakPlayerOne>=7 && scoreTieBreakPlayerOne> scoreTieBreakPlayerTow +1) firstPlayerWinsOneGame();
    }

    private void firstPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints() {
        if((scoreGamePlayerOne>scoreGamePlayerTow)) firstPlayerWinsOneGame();
        else
            if  (scoreGamePlayerOne == 3 && scoreGamePlayerTow ==4) {
                scoreGamePlayerOne = 5;
                scoreGamePlayerTow =5;
            }else{
            scoreGamePlayerOne = 4;
            scoreGamePlayerTow =3;
            }
    }

    private void firstPlayerWinsOneGame() {
        scoreGamePlayerOne = 0;
        scoreGamePlayerTow =0;
        scoreTieBreakPlayerOne =0;
        scoreTieBreakPlayerTow =0;
        scoreSetPlayerOne = scoreSetPlayerOne + 1;
        if((scoreSetPlayerOne >= 6 && scoreSetPlayerTow <scoreSetPlayerOne-1)||(scoreSetPlayerOne == 7 && scoreSetPlayerTow ==6)) theWinner ="Player 1 wins the match";
    }

    public void secondPlayerWinsOnePoint() {
        if(scoreSetPlayerTow==6 && scoreSetPlayerOne == 6) secondPlayerWinsOneTieBreakPoint();
        else {

            if (scoreGamePlayerTow >= 3) secondPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
            else
                scoreGamePlayerTow = scoreGamePlayerTow + 1;
        }
    }

    private void secondPlayerWinsOneTieBreakPoint() {
      if(scoreTieBreakPlayerTow > 7 && scoreTieBreakPlayerTow > scoreTieBreakPlayerOne +1) secondPlayerWinsOneGame();
          else scoreTieBreakPlayerTow = scoreTieBreakPlayerTow +1;
    }

    private void secondPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints() {
        if((scoreGamePlayerTow>scoreGamePlayerOne)) secondPlayerWinsOneGame();
        else
        if  (scoreGamePlayerOne == 4 && scoreGamePlayerTow ==3) {
            scoreGamePlayerOne = 5;
            scoreGamePlayerTow =5;
        }else{
            scoreGamePlayerTow = 4;
            scoreGamePlayerOne =3;
        }
    }

    private void secondPlayerWinsOneGame() {
        scoreGamePlayerOne = 0;
        scoreGamePlayerTow =0;
        scoreTieBreakPlayerOne =0;
        scoreTieBreakPlayerTow =0;
        scoreSetPlayerTow = scoreSetPlayerTow+1;
        if(scoreSetPlayerTow > 6 && scoreSetPlayerOne < scoreSetPlayerTow-1) theWinner ="Player 2 wins the match";
    }

    public void setScoreGamePlayerOne(Integer scoreGamePlayerOne) {
        this.scoreGamePlayerOne = scoreGamePlayerOne;
    }

    public void setScoreGamePlayerTow(Integer scoreGamePlayerTow) {
        this.scoreGamePlayerTow = scoreGamePlayerTow;
    }


    public void setScoreSetPlayerOne(Integer scoreSetPlayerOne) {
        this.scoreSetPlayerOne = scoreSetPlayerOne;
    }

    public void setScoreSetPlayerTow(Integer scoreSetPlayerTow) {
        this.scoreSetPlayerTow = scoreSetPlayerTow;
    }

    public String getTheWinner() {
        return theWinner;
    }

    public void setScoreTieBreakPlayerOne(Integer scoreTieBreakPlayerOne) {
        this.scoreTieBreakPlayerOne = scoreTieBreakPlayerOne;
    }

    public void setScoreTieBreakPlayerTow(Integer scoreTieBreakPlayerTow) {
        this.scoreTieBreakPlayerTow = scoreTieBreakPlayerTow;
    }
}
