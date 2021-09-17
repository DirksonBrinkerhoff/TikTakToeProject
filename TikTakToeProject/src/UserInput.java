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
						if(PlayGame.myGrid[2][0].equals(" "))
							{
							PlayGame.myGrid[2][0] = "X";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("C2"))
					{
						
						if(PlayGame.myGrid[2][1].equals(" "))
							{
							PlayGame.myGrid[2][1] = "X";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				else
					{
						if(PlayGame.myGrid[2][2].equals(" "))
							{
							PlayGame.myGrid[2][2] = "X";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				}
			
			//O if statement 
			if(PlayGame.firstInput.equals("O"))
				{
				if(coordinate.equals("A1"))
					{
						if(PlayGame.myGrid[0][0].equals(" "))
							{
							PlayGame.myGrid[0][0] = "O";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("A2"))
					{
						if(PlayGame.myGrid[0][1].equals(" "))
							{
							PlayGame.myGrid[0][1] = "O";
							}
						else
							{
							userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("A3"))
					{
						if(PlayGame.myGrid[0][2].equals(" "))
							{
								PlayGame.myGrid[0][2] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B1"))
					{
						if(PlayGame.myGrid[1][0].equals(" "))
							{
								PlayGame.myGrid[1][0] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B2"))
					{
						if(PlayGame.myGrid[1][1].equals(" "))
							{
								PlayGame.myGrid[1][1] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("B3"))
					{
						if(PlayGame.myGrid[1][2].equals(" "))
							{
								PlayGame.myGrid[1][2] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("C1"))
					{
						if(PlayGame.myGrid[2][0].equals(" "))
							{
								PlayGame.myGrid[2][0] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else if(coordinate.equals("C2"))
					{
						if(PlayGame.myGrid[2][1].equals(" "))
							{
								PlayGame.myGrid[2][1] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				else
					{
						if(PlayGame.myGrid[2][2].equals(" "))
							{
								PlayGame.myGrid[2][2] = "O";
							}
						else
							{
								userInputXandOCordinates();
							}
					}
				}
			}
	}
