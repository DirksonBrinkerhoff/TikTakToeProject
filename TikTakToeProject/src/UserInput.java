public class UserInput
	{
		public static void userInputXCordinates()
			{
			//Prompt user with coordinate question
			System.out.println("Please input a cordinate");
			//Allow user to input coordinate
			String coordinate = PlayGame.userStringInput.nextLine();
			//X if statement
			if(coordinate.equals("A1"))
					{
					if(PlayGame.myGrid[0][0].equals(" "))
						{
						PlayGame.myGrid[0][0] = "X";
						}
					else
						{
						userInputXCordinates();
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
						userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
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
							userInputXCordinates();
							}
					}
			}
			public static void userInputOCordinates()
			{
				//Prompt user with coordinate question
				System.out.println("Please input a cordinate");
				//Allow user to input coordinate
				String coordinate = PlayGame.userStringInput.nextLine();
				//O if statement 
				if(coordinate.equals("A1"))
					{
						if(PlayGame.myGrid[0][0].equals(" "))
							{
							PlayGame.myGrid[0][0] = "O";
							}
						else
							{
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
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
							userInputOCordinates();
							}
					}
			}
	}

