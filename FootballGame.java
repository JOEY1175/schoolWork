// FootballGame.java

public class FootballGame
{
//instance variable for team name 1
private String name_team_1;

//instance variable for team name 2
private String name_team_2;

//int array for team 1 scores
private int[] team_1_Scores;

//int array for team 2 scores
private int[] team_2_Scores;

int quartersNumber_1, quartersNumber_2;
	
	//parameters and constructor
	public FootballGame(String team_1_name, String team_2_name, int numQuarters)
	
		{
			//parameter values
			this.name_team_1 = team_1_name;
			this.name_team_2 = team_2_name;
			
			team_1_Scores = new int[numQuarters];
			team_2_Scores = new int[numQuarters];
			
				//making both arrays -1
				for (int i = 0; i < numQuarters; ++i)
					{
						team_1_Scores[i] = -1;
						team_2_Scores[i] = -1;
					}
				//set the quarter number of each team to 1
				quartersNumber_1 = 1;
				quartersNumber_2 = 1;
		}
		
		//the getter and setter to store or retrive the name of team 1
		public String getName_Team_1()
		{
			return name_team_1;
		}
		public void setName_Team_1(String team_1)
		{
			this.name_team_1 = team_1;
		}
		
		//the getter and setter to store or retrive the name of team 2
		public String getName_Team_2()
		{
			return name_team_2;
		}
		public void setName_Team_2(String team_2)
		{
			this.name_team_2 = team_2;
		}
		
		//helper to display error message
		private void errorMessage(int currentQuarter, int userQuarter)
		{
			if (currentQuarter < userQuarter)
			{
				System.out.println("Incorrect entry." + userQuarter + " quarter values not stored");
				
			}
			else
			{
				System.out.println("Incorrect entry. The" + userQuarter + " quarter values are set already");
			}
		}
		
		// establishing getteam_1_Scores
		public int[] getTeam_1_Scores()
		{
			return team_1_Scores;
		}
		
		//Method to retrieve the scores of team 1
		public int getTeam_1_Scores(int quarter)
		{
			//make sure the quarter is within the appropriate range
			if (quarter - 1 >=0 && quarter - 1<team_1_Scores.length)
			{
				return team_1_Scores[quarter -1];
			}
			
			else
			{
				return -1;
			}
			
		}
		
		//setting the quarter score for team 1
		public boolean setTeam_1_Scores(int quarter, int score)
		{
			if (quartersNumber_1 == quarter)
			{
				team_1_Scores[quarter -1] = score;
				
				//make the quarter incremental
				quartersNumber_1++;
				return true;
			}
			//error message
			else
			{
				errorMessage(quartersNumber_1, quarter);
				return false;
			}
		}
		
		// establishing getteam_2_Scores
		public int[] getTeam_2_Scores()
		{
			return team_2_Scores;
		}
		
		//Method to retrieve the scores of team 2
		public int getTeam_2_Scores(int quarter)
		{
			//make sure the quarter is within the appropriate range
			if (quarter - 1 >=0 && quarter - 1 <team_2_Scores.length)
			{
				return team_2_Scores[quarter -1];
			}
			
			else
			{
				return -1;
			}
			
		}
		
		//setting the quarter score for team 2
		public boolean setTeam_2_Scores(int quarter, int score)
		{
			if (quartersNumber_2 == quarter)
			{
				team_2_Scores[quarter -1] = score;
				
				//make the quarter incremental
				quartersNumber_2++;
				return true;
			}
			//error message
			else
			{
				errorMessage(quartersNumber_2, quarter);
				return false;
			}
		}
		
		//compute the winner!
		public String getGameWinner()
		{
			//variables
			String winner = "\t";
			int total_Team_1 = 0;
			int total_Team_2 = 0;
			
			//make sure all quarters scored correctly
			if (quartersNumber_1 - 1 == team_1_Scores.length && quartersNumber_2 - 1 == team_2_Scores.length)
			{
				//loop to calculate total scores
				for (int i = 0; i < team_1_Scores.length; ++i)
				{
					total_Team_1 += team_1_Scores[i];
					total_Team_2 += team_2_Scores[i];
				}
				
				//set scores
				winner += "Team " + name_team_1 + " score: " + total_Team_1 + "\n\t";
				winner += "Team " + name_team_2 + " score: " + total_Team_2 + "\n\t";
				
				//check who won the game
				if (total_Team_1 > total_Team_2)
				{
					//team 1 wins:
					winner += "Team " + name_team_1 + " wins the game!!";
				}
				
				else if (total_Team_2 > total_Team_1)
				{
					//team 2 wins:
					winner += "Team " + name_team_2 + " wins the game!!";
				}
				else 
				{
					winner += "There is a draw between " + name_team_1 + " and " + name_team_2;
				}
				return winner;
			}
			//if requested before the game is finished
			return "Still quarters left in the game";
		}
}

		
		
	