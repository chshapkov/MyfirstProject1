package homework06FootballTeamManagement;

import java.util.LinkedList;

public class Player extends FootballTeam { //без него не можем да преброим играчите в отбора
    private String playerName; //no detailed  setters and getters

    private int endurance; //no setters anf=d getters
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;
    private int SumAllStats;
    private int skillLevel; //no setter only getter
    private LinkedList<Player> playersAndSkillLevel = new LinkedList<>();


    public Player(String playerName,int endurance, int sprint, int dribble, int passing, int shooting) {
        setPlayerName(playerName);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);

        //System.out.printf("Name of the player: %s\n", getPlayerName());
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        if (endurance >= 0 && endurance <= 100) {
            this.endurance = endurance;
        } else System.out.println("Endurance should be between 0 and 100");
    }

    public int getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        if (sprint >= 0 && sprint <= 100) {
            this.sprint = sprint;
        } else System.out.println("Sprint should be between 0 and 100");
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        if (dribble >= 0 && dribble <= 100) {
            this.dribble = dribble;
        }else System.out.println("Dribble should be between 0 and 100");
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        if (passing >= 0 && passing <= 100) {
            this.passing = passing;
        }else System.out.println("Passing should be between 0 and 100");
    }

    public int getShooting() {
        return shooting;
    }
    public void setShooting(int shooting) {
        if (shooting >= 0 && shooting <= 100) {
            this.shooting = shooting;
        } else System.out.println("Shooting should be between 0 and 100");
    }

    public int getSumAllStats() {
        return endurance + sprint + dribble + passing + shooting;
    }

    public int getSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting)/2;
    }

    public void privatePrintDataPlayer() {
        System.out.println("Private data: ");
        System.out.printf("%s; %d; %d; %d; %d; %d\n", getPlayerName(), getEndurance(), getSprint(), getDribble(), getPassing(), getShooting());
        System.out.println("Sum of all stats of a player: " + getSumAllStats());
        System.out.println("Overall skill level of a player: " + getSkillLevel());
        System.out.println();
    }

    public void officialPrintDataPlayer() {
        System.out.println("Public data: ");
        System.out.printf("%s; %d, %d, %d, %d, %d\n", getPlayerName(), getEndurance(), getSprint(), getDribble(), getPassing(), getShooting());
        System.out.println();
    }

}
