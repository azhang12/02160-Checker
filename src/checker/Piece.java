package checker;

public class Piece {

	private String colour;
	private Player owner;
	
	public Piece(String c, Player o) {
		this.colour=c;
		this.owner=o;
		
	}
	
	public Player getPlayer() {return this.owner;}
	
	
}
