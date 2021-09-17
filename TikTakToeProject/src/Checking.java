public class Checking
	{
		public static void isWonGame()
			{
			if ((PlayGame.myGrid[0][0].equals(PlayGame.myGrid[0][1]) && PlayGame.myGrid[0][1].equals(PlayGame.myGrid[0][2]) && !PlayGame.myGrid[0][1].equals(" ")) ||
				(PlayGame.myGrid[1][0].equals(PlayGame.myGrid[1][1]) && PlayGame.myGrid[1][1].equals(PlayGame.myGrid[1][2]) && !PlayGame.myGrid[1][1].equals(" ")) ||
				(PlayGame.myGrid[2][0].equals(PlayGame.myGrid[2][1]) && PlayGame.myGrid[2][1].equals(PlayGame.myGrid[2][2]) && !PlayGame.myGrid[2][1].equals(" ")) ||
				(PlayGame.myGrid[0][0].equals(PlayGame.myGrid[1][0]) && PlayGame.myGrid[1][0].equals(PlayGame.myGrid[2][0]) && !PlayGame.myGrid[1][0].equals(" ")) ||				
				(PlayGame.myGrid[0][1].equals(PlayGame.myGrid[1][1]) && PlayGame.myGrid[1][1].equals(PlayGame.myGrid[2][1]) && !PlayGame.myGrid[1][1].equals(" ")) ||
				(PlayGame.myGrid[0][2].equals(PlayGame.myGrid[1][2]) && PlayGame.myGrid[1][2].equals(PlayGame.myGrid[2][2]) && !PlayGame.myGrid[1][2].equals(" ")) ||
				(PlayGame.myGrid[0][0].equals(PlayGame.myGrid[1][1]) && PlayGame.myGrid[1][1].equals(PlayGame.myGrid[2][2]) && !PlayGame.myGrid[1][1].equals(" ")) ||
				(PlayGame.myGrid[0][2].equals(PlayGame.myGrid[1][1]) && PlayGame.myGrid[1][1].equals(PlayGame.myGrid[2][0]) && !PlayGame.myGrid[1][1].equals(" ")))
					{
					System.out.println("The game is over!");
					System.exit(0);
					}
				}


			}

	
