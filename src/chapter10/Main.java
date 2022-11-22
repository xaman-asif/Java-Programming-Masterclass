package chapter10;

public class Main {
    public static void main(String[] args) {
        FootballPlayer a = new FootballPlayer("A");
        BaseballPlayer b = new BaseballPlayer("B");
        SoccerPlayer c = new SoccerPlayer("C");

        Team<FootballPlayer> footballTeam = new Team<>("Adelaide Crows");
        footballTeam.addPlayer(a);
        System.out.println(footballTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(b);
    }
}
