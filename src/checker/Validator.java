package checker;
public class Validator {

	//This method checks if the selected Piece belongs to the Player who hasTurn
	public static boolean checkPlayer (Board board, int oldX, int oldY, Player hasTurn) {
		
			if(board.getTile(oldX, oldY).getPiece().getPlayer() != hasTurn ) return false;
			else return true;
		
		
	}
	
	//checks if the tile the player wants to move the piece to is diagonal
	public static boolean checkIfDiagonal(int oldX, int oldY, int newX, int newY, Player hasTurn) {
		
		//Check if inRange
				if (newX <0||newX>7) return false;
				else if (newY <0||newY>7) return false;
				
				
				
				else
				{
					//Check if Move goes diagonal
					//Player 1 can only move down ->Raising X
					if (hasTurn.getId()==1)
					{
						if (newX == oldX+1 &&(newY==oldY+1||newY==oldY-1)) return true;
						else return false;
							
					}
					
					if (hasTurn.getId() ==2)
					{
						if (newX == oldX-1 &&(newY==oldY+1||newY==oldY-1)) return true;
						else return false;
					}
					
					else return false;
				}
	}
	
	
	//method checks if the tile the player wants to move the piece to is empty
	public static boolean checkIfEmpty(Board board, int newX, int newY) {
		
		if(board.getTile(newX, newY).hasPiece()) return false;
		else return true;
	}
	
	
	//Combines all three methods
	public static boolean checkMove (int oldX, int oldY, int newX, int newY, Player playerHasTurn, Board board)
	{
		if(checkIfDiagonal(oldX, oldY, newX, newY, playerHasTurn)&&checkIfEmpty(board,newX,newY)&&checkPlayer(board,oldX,oldY,playerHasTurn))
		{
			return true;
		}
		else return false;
	}
}
