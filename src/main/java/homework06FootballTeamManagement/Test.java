package homework06FootballTeamManagement;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList playersAndSkillLevel = new ArrayList<>();
        //playersAndSkillLevel.add();


        Player player01 = new Player("Lionel_Messi", 75, 85, 84, 92, 67);
        player01.privatePrintDataPlayer();
        player01.officialPrintDataPlayer();



        Player player02 = new Player("Gerard_Pique", 95, 82, 82, 89, 68);
        player02.privatePrintDataPlayer();
        player01.officialPrintDataPlayer();

        System.out.println(FootballTeam.getNumberOfPlayers());
        System.out.println(FootballTeam.getRating());
    }
}
