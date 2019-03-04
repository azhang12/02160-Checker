package checker;
import java.util.*;

import java.util.stream.*;


public class Gameplay {
	
	private Player hasTurn;
	
	public void runGame() {
		
		
		//I've created an array with the players because I don't know how to change the hasTurn, maybe you know
		Player[] participants = new Player[2];
		
		participants[0] = new Player("Adam", 1);
		participants[1] = new Player ("Kilian",2);
		Board board = new Board();
		
		
	
	for (;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Turn of player " + hasTurn.getName());
		
		//IMPLEMENT:
		// - choose Tile/Piece to move
		Tile oldTile = choosePiece(board, inputX, inputY);
		
		// - choose Tile where to move
		Tile newTile = choosePiece(board, inputX2, inputY2);
		// - check if move is allowed
		if(Validator.checkMove(inputX, inputY, inputX2, inputY2, hasTurn)	{}	
		// - update Tile
		else {}
		// Ask for new Input
				
		
		// In my opinion we do not need to update the board
		// Updating will be done after every move of the piece -> the tiles will be updated
		// Printer.print(board), always prints the correct Shape
		
		
		Printer.print(board);
		
		if(hasTurn.getId() == 1)
			hasTurn = participants[1];
		else
			hasTurn = participants[0];
		
	}
	}
	
	public Tile choosePiece (Board gameBoard, int x, int y) 
		
		return gameBoard.getTile(y,x);
	}
		
	}
	
	public Tile chooseMove (Board gameBoard, int x, int y ) {
		return gameBoard.getTile(x,y);
	}
	
	
	
	
	
	
	
}
