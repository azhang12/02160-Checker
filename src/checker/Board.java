package checker;

public class Board {
	
	private Tile[][] board;
	
	
	//Constructor: setUp board
	// create tiles, add pieces, players etc.
	public Board()
	{
		
		this.board = new Tile[8][8];
		//ADD PIECES
	}
	
	public Tile getTile(int c, int r) {
		
		return this.board[c][r];
	}

}
