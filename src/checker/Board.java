package checker;

public class Board {
	
	private Tile[][] board;
	
	
	//Constructor: setUp board
	// create tiles, add pieces, players etc.
	public Board(Player p1, Player p2)
	{
		this.board = new Tile[8][8];
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[0].length; y++) {
				board[x][y] = new Tile();
			}
		}
		
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[0].length; y++) {
				if (x == 3 || x == 4) {
					continue;
				}
				if ((x%2==0 && y%2==1) || (x%2==1 && y%2==0)) {
					if (x < 3) {
						Piece temp = new Piece("White", p1);
						board[x][y].setPiece(temp);;
					}
					else {
						Piece temp = new Piece("Black", p2);
						board[x][y].setPiece(temp);;
					}
				}
			}
		}
	}
	
	public Tile getTile(int c, int r) {
		
		return this.board[c][r];
	}

}
