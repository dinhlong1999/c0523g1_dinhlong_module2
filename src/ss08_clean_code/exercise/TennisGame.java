package ss08_clean_code.exercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String scoreName = "";
        int tempScore ;
        if (playerScore1 == playerScore2) {
            scoreName = getString(playerScore1);
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            int minusResult = playerScore1 - playerScore2;
            if (minusResult == 1)
                scoreName = "Advantage player1";
            else if (minusResult == -1)
                scoreName = "Advantage player2";
            else if (minusResult >= 2)
                scoreName = "Win for player1";
            else
                scoreName = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1)
                    tempScore = playerScore1;
                else {
                    scoreName += "-";
                    tempScore = playerScore2;
                }
                switch (tempScore) {
                    case 0:
                        scoreName += "Love";
                        break;
                    case 1:
                        scoreName += "Fifteen";
                        break;
                    case 2:
                        scoreName += "Thirty";
                        break;
                    case 3:
                        scoreName += "Forty";
                        break;
                }
            }
        }
        return scoreName;
    }

    private static String getString(int playerScore1) {
        String score;
        switch (playerScore1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
