package checker;
import java.util.*;

import java.util.stream.*;


public class Gameplay {
	
	private static Player hasTurn;
	
	public static void runGame() {
		//I've created an array with the players because I don't know how to change the hasTurn, maybe you know
		Player[] participants = new Player[2];
		
		Player p1 = new Player("Adam", 1);
		Player p2 = new Player ("Kilian", 2);
		
		Board board = new Board(p1, p2);
		
		hasTurn = p1;
		
		for (;;) {
			Printer.print(board);
			
			completeTurn(board);
			
			
			if(hasTurn.getId() == 1)
				hasTurn = p2;
			else
				hasTurn = p1;
			
		}
	}
	
	public static boolean completeTurn (Board board) {
		int[] curCord = promptPlayer("choosePiece");
		Tile oldTile = board.getTile(curCord[0], curCord[1]);
		
		int[] newCord = promptPlayer("movePiece");
		Tile newTile = board.getTile(newCord[0], newCord[1]);
		// - check if move is allowed
		if (!Validator.checkMove(curCord[0], curCord[1], newCord[0], newCord[1], hasTurn, board)) {
			System.out.println("Invalid move. Please try again");
			return completeTurn(board);
		} 
		else {
			newTile.setPiece(oldTile.getPiece());
			oldTile.clearPiece();
			return true;
		}
	}
	
	//
	public static int[] promptPlayer(String option) {
		Scanner sc = new Scanner(System.in);
		switch(option) {
			case "choosePiece":
				System.out.println("Turn of player " + hasTurn.getName());
				System.out.println("Choose X-coordinate of piece to move");
			  	int currentX = sc.nextInt();
			  	System.out.println("Choose Y-coordinate of piece to move");
			  	int currentY = sc.nextInt();
			  	return new int[] {currentX, currentY};
			case "movePiece":
				System.out.println("Choose new X-coordinate to move to");
			  	int newX = sc.nextInt();
			  	System.out.println("Choose new Y-coordinate to move to");
			  	int newY = sc.nextInt();
			  	return new int[] {newX, newY};	  
		}
		sc.close();
		return null;
	}
	
	
	public static void main(String[] args) {
		runGame();
	}
	
	
	
	
}
