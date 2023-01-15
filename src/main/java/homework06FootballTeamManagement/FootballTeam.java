package homework06FootballTeamManagement;

import java.util.LinkedList;

public class FootballTeam { //  extends StatsPlayerAbstract

    private final static String TEAM_NAME; //ok
    private static int numberOfPlayers; //ok
    private static int rating; // not ok

    private LinkedList<Player> bagOfProducts = new LinkedList<>();


    static {
        TEAM_NAME = "Barcelona";
        System.out.println(TEAM_NAME);
    }

    public FootballTeam() {
        numberOfPlayers++;
        // rating = numberOfPlayers + arrayList todo
    }

    public static int getNumberOfPlayers() {
        System.out.print("Number of players: ");
        return numberOfPlayers;
    }

    public static int getRating() {
        System.out.print("Team rating: ");
        return rating;
    }

}
