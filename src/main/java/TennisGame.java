import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private Integer scoreGamePlayerOne;
    private Integer scoreGamePlayerTow;
    private Map<Integer,String > pointToScoreGame;

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

    }

    public String getScoreGame() {
        StringBuilder scoreGame = new StringBuilder();
        scoreGame.append(pointToScoreGame.get(scoreGamePlayerOne));
        scoreGame.append(" _ ");
        scoreGame.append(pointToScoreGame.get(scoreGamePlayerTow));
        return scoreGame.toString();
    }

    public void firstPlayerWinsOnePoint() {
        if(scoreGamePlayerOne>=3) firstPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
        else
            scoreGamePlayerOne = scoreGamePlayerOne + 1;
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
    }

    public void secondPlayerWinsOnePoint() {
        if(scoreGamePlayerTow >3) secondPlayerWinsOnePointAndTheScoreIsMoreThenThreePoints();
        else
        scoreGamePlayerTow = scoreGamePlayerTow +1;
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
    }

    public void setScoreGamePlayerOne(Integer scoreGamePlayerOne) {
        this.scoreGamePlayerOne = scoreGamePlayerOne;
    }

    public void setScoreGamePlayerTow(Integer scoreGamePlayerTow) {
        this.scoreGamePlayerTow = scoreGamePlayerTow;
    }
}
