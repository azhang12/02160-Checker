package checker;

public class Tile {

	private Piece piece;
	
	public Tile(Piece newPiece)
	{
		this.piece = newPiece;
	}
	
	public Tile() {
		this.piece = null;
	}
	
	//check if a piece is placed on the tile; return true if yes, return false if NULL
	public boolean hasPiece()
	{
		 if (this.piece!=null) return true;
		 else return false;
	}
	
	//method updates the tile -> updates automatically the board
	public void clearPiece() {
		this.piece = null;
	}
	
	public Piece getPiece (){return this.piece;}
	
	
	//Do we need this function? I guess we'll need it, as soon as we move the pieces to a new tile
	public void setPiece (Piece newPiece) {this.piece = newPiece;}
	
	
	
	
	
}
