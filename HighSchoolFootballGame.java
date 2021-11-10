//HighSchoolFootballGame.java
// "extends" grants inheritance
public class HighSchoolFootballGame extends FootballGame
{
	public HighSchoolFootballGame(String Team_1, String Team_2)
	{
		//correct amount of quarters in a highschool game/ super refering to the parent
		super(Team_1, Team_2, 4);
	}
}