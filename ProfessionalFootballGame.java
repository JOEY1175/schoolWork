//ProfessionalFootballGame.java
// "extends" grants inheritance
public class ProfessionalFootballGame extends FootballGame
{
	public ProfessionalFootballGame(String Team_1, String Team_2)
	{
		//correct amount of quarters in a Professional game/ super refering to the parent
		super(Team_1, Team_2, 4);
	}
}