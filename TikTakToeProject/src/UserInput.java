public class UserInput
	{
		public static void userInputXandOCordinates()
			{
			//Prompt user with coordinate question
			System.out.println("Please input a cordinate");
			//Allow user to input coordinate
			String coordinate = PlayGame.userStringInput.nextLine();
			//X if statement
			if(PlayGame.firstInput.equals("X"))
				{
				if(coordinate.equals("A1"))
					{
					PlayGame.myGrid[0][0] = "X";
					if(PlayGame.myGrid[0][0].equals(" "))
						{
						PlayGame.myGrid[0][0] = "X";
						}
					else
						{
						userInputXandOCordinates();
						}
					}
				else if(coordinate.equals("A2"))
				{
					PlayGame.myGrid[0][1] = "X";
					if(PlayGame.myGrid[0][1].equals(" "))
						{
						PlayGame.myGrid[0][1] = "X";
						}
					else
						{
						userInputXandOCordinates();
						}
					}
				else if(coordinate.equals("A3"))
					{
						PlayGame.myGrid[0][2] = "X";
						if(PlayGame.myGrid[0][2].equals(" "))
							{
							PlayGame.myGrid[0][2] = "X";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B1"))
					{
						PlayGame.myGrid[1][0] = "X";
						if(PlayGame.myGrid[1][0].equals(" "))
							{
								PlayGame.myGrid[1][0] = "X";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B2"))
					{
						PlayGame.myGrid[1][1] = "X";
						if(PlayGame.myGrid[1][1].equals(" "))
							{
								PlayGame.myGrid[1][1] = "X";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B3"))
					{
						PlayGame.myGrid[1][2] = "X";
						if(PlayGame.myGrid[1][2].equals(" "))
							{
								PlayGame.myGrid[1][2] = "X";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("C1"))
					{
						PlayGame.myGrid[2][0] = "X";
						PlayGame.myGrid[2][0] = "X";
						if(PlayGame.myGrid[0][2].equals(" "))
							{
								PlayGame.myGrid[0][1] = "X";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("C2"))
					{
						PlayGame.myGrid[2][1] = "X";
					}
				else
					{
						PlayGame.myGrid[2][2] = "X"; 
					}
				}
			
			//O if statement 
			if(PlayGame.firstInput.equals("O"))
				{
				if(coordinate.equals("A1"))
					{
						PlayGame.myGrid[0][0] = "O";
					}
				else if(coordinate.equals("A2"))
					{
						PlayGame.myGrid[0][1] = "O";
					}
				else if(coordinate.equals("A3"))
					{
						PlayGame.myGrid[0][2] = "O";
					}
				else if(coordinate.equals("B1"))
					{
						PlayGame.myGrid[1][0] = "O";
					}
				else if(coordinate.equals("B2"))
					{
						PlayGame.myGrid[1][1] = "O";
					}
				else if(coordinate.equals("B3"))
					{
						PlayGame.myGrid[1][2] = "O";
					}
				else if(coordinate.equals("C1"))
					{
						PlayGame.myGrid[2][0] = "O";
					}
				else if(coordinate.equals("C2"))
					{
						PlayGame.myGrid[2][1] = "O";
					}
				else
					{
						PlayGame.myGrid[2][2] = "O"; 
					}
				}
			}
	}
