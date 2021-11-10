//LittleLeagueFootballGame.java
// "extends" grants inheritance
public class LittleLeagueFootballGame extends FootballGame
{
	public LittleLeagueFootballGame(String Team_1, String Team_2)
	{
		//correct amount of quarters in a little league game/ super refering to the parent
		super(Team_1, Team_2, 2);
	}
}