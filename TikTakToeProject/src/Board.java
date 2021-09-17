import java.util.Scanner;
public class Board
	{
		static String firstInput;
		public static void prepareBoard()
		{
				// Putting spaces within myGrid 
				for(int row = 0; row < PlayGame.myGrid.length; row++)
					{
					for(int col = 0; col < PlayGame.myGrid[0].length; col++)
						{
							System.out.println(PlayGame.myGrid[row][col] = " ");
						}
					}
			}
		public static void displayBoard()
		{
			// print the top numbers 
			System.out.println("    1   2   3");
			
			// print top line
			System.out.println("  -------------");
			
			// print A line with myGrid
			System.out.println("A | "+ PlayGame.myGrid[0][0] +" | "+ PlayGame.myGrid[0][1] +" | "+ PlayGame.myGrid[0][2] +" |");
			
			// middle first print line
			System.out.println("  -------------");
			
			// Print B line with myGrid
			System.out.println("B | "+ PlayGame.myGrid[1][0] +" | "+ PlayGame.myGrid[1][1] +" | "+ PlayGame.myGrid[1][2] +" |");
			
			// middle second print line
			System.out.println("  -------------");
			
			//print C line with myGrid
			System.out.println("C | "+ PlayGame.myGrid[2][0] +" | "+ PlayGame.myGrid[2][1] +" | "+ PlayGame.myGrid[2][2] +" |");
			
			// last print line 
			System.out.println("  -------------");
		}

	}
