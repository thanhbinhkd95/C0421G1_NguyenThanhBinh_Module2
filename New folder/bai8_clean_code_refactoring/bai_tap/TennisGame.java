package bai8_clean_code_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String result = "";
        if (playerScore1 == playerScore2) {
            result = drawResult(playerScore1);
        } else if (playerScore1 >= 4 || playerScore2 >= 4) {
            result = checkWin(playerScore1, playerScore2);
        } else {
            result = onGoingResult(playerScore1, playerScore2, result);
        }
        return result;
    }

    private static String onGoingResult(int playerScore1, int playerScore2, String result) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = playerScore1;
            else {
                result += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }

    private static String checkWin(int playerScore1, int playerSore2) {
        String result;
        int minusResult = playerScore1 - playerSore2;
        if (minusResult == 1) result = "Advantage player1";
        else if (minusResult == -1) result = "Advantage player2";
        else if (minusResult >= 2) result = "Win for player1";
        else result = "Win for player2";
        return result;
    }

    private static String drawResult(int playerScore1) {
        String result;
        switch (playerScore1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }
}
