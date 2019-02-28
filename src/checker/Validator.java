package checker;
public class Validator {

	//This method checks if the selected Piece belongs to the Player who hasTurn
	public static boolean checkPlayer (int oldX, int oldY, Player hasTurn) {
		
		
		//IMPLEMENT METHOD
		return true;
	}
	
	//checks if the tile the player wants to move the piece to is diagonal
	public static boolean checkIfDiagonal(int oldX, int oldY, int newX, int newY) {
		
		//IMPLEMENT METHOD
		return true;
	}
	
	
	//method checks if the tile the player wants to move the piece to is empty
	public static boolean checkIfEmpty(int newX, int newY) {
		
		//IMPLEMENT METHOD
		return false;
	}
	
	
	//Combines all three methods
	public static boolean checkMove (int oldX, int oldY, int newX, int newY, Player playerHasTurn)
	{
		if(checkIfDiagonal(oldX, oldY, newX, newY)&&checkIfEmpty(newX,newY)&&checkPlayer(oldX,oldY,playerHasTurn))
		{
			return true;
		}
		else return false;
	}
}
