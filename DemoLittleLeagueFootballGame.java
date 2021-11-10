// DemoLittleLeagueFootballGame.java
import java.util.Scanner;

public class DemoLittleLeagueFootballGame
{
	public static void main(String args[])
	{
		//read input from the console
		Scanner input = new Scanner(System.in);
		
		//variables
		String team_Name_1, team_Name_2;
		LittleLeagueFootballGame llfootBall = null;
		int numberOfQuarters = 2;
		int team_Score, quarters;
		
		//Identifies the type of football
		System.out.println("\t\t________Little League Football________\n\n");
		
		//user input name of team 1
		System.out.print("Enter team name for first team:");
		
		//read input
		team_Name_1 = input.nextLine();
		
		//user input name of team 2
		System.out.print("Enter team name for second team:");
		
		//read input
		team_Name_2 = input.nextLine();
		
		//footall game scores etc.
		llfootBall = new LittleLeagueFootballGame(team_Name_1, team_Name_2);
		
		// loop for each quarter
		for (int i = 0; i < numberOfQuarters; i++)
		{
			//user input for team 1 quarter and score
			System.out.println("\nTeam 1: ");
			do
			{
				//ask for quarter number
				System.out.print("\tEnter quarter number: ");
				
				//read input
				quarters = input.nextInt();
				
				//ask for score
				System.out.print("\tEnter the score for quarter" + quarters + ": ");
				
				//read input
				team_Score = input.nextInt();
			}	
				//loop until filled
			while (!llfootBall.setTeam_1_Scores(quarters, team_Score));
			
			//team 2 quarters and scores
			 System.out.println("Team 2: ");
			do
			{
				//quarter number
				System.out.print("\tEnter quarter number: ");
				
				//read input
				quarters = input.nextInt();
				
				//ask for score
				System.out.print("\tEnter the score for quarter" + quarters + ": ");
				
				//read input
				team_Score = input.nextInt();
			}
				//loop until filled
				while (!llfootBall.setTeam_2_Scores(quarters, team_Score));
		}
		//winner determination
		System.out.println("\nGame Result: \n" + llfootBall.getGameWinner());		
	}
}
		

			
			
			
			
			
			
		