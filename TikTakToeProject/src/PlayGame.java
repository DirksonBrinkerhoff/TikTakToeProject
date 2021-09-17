import java.util.Scanner;
public class PlayGame
	{
		// Instantiated 3x3 Matrix
		static String [][] myGrid = new String [3][3];
		// Static User input 
		static Scanner userStringInput = new Scanner(System.in);
		// boolean 
		static boolean gameNotFinished = true;
		//more input 
		static String firstInput; 
		public static void main(String[] args)
			{
				Board.prepareBoard();
				Board.displayBoard();	
				while(gameNotFinished)
					{
					UserInput.userInputXCordinates();
					Checking.isWonGame();
					Board.displayBoard();
					
					UserInput.userInputOCordinates();
					Checking.isWonGame();
					Board.displayBoard();
					}
			}

	}
