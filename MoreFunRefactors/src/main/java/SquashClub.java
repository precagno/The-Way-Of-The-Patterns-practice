import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquashClub {
    private List<Match> matchList = new ArrayList<>();

    public String displayPlayerPointsAtAGivenDate(LocalDate date){
        String result = "";
        List<Match> matchsOfTheDate = matchList.stream().filter(match -> date.equals(match.getDate()) ).collect(Collectors.toList());

        for (Match match: matchsOfTheDate) {
            int totalGames = 0;
            result += "Match:\n";
            Player player1 = match.getPlayer1();
            result += "Player " + player1.getName() +" Score:\n";
            for (Integer gamePoints: match.pointsOfPlayer(player1)) {
                result += gamePoints;
                totalGames += gamePoints;
            }
            result += "Match Points:";
            switch (player1.getZone()){
                case "A":
                    result += totalGames *2;
                    break;
                case "B":
                    result += totalGames;
                    break;
                case "C":
                    if (match.winner().equals(player1)){
                        result += totalGames;
                    }else{
                        result += 0;
                    }
                    break;
            }

            Player player2 = match.getPlayer2();
            totalGames = 0;
            result += "Player " + player2.getName() +" Score:\n";
            for (Integer gamePoints: match.pointsOfPlayer(player2)) {
                result += gamePoints;
                totalGames += gamePoints;
            }
            result += "Match Points:";
            switch (player2.getZone()){
                case "A":
                    result += totalGames *2;
                    break;
                case "B":
                    result += totalGames;
                    break;
                case "C":
                    if (match.winner().equals(player2)){
                        result += totalGames;
                    }else{
                        result += 0;
                    }
                    break;
            }
        }
        return result;
    }
}
