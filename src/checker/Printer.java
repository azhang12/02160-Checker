package checker;

public class Printer {

	
	public static void print(Board board)
	{
		//IMPLEMENT PRINT-METHOD
		System.out.println("Y->0 1 2 3 4 5 6 7");
		System.out.println("---------------------");
		
		//Print each tile
		
		
		for (int r=0;r<8;++r)
		{
			System.out.print(r+ "| " );
			for (int c=0; c<8; ++c)
			{
				//Tile has a Piece
				if (board.getTile(r, c).hasPiece())
				{
					System.out.print(board.getTile(r, c).getPiece().getPlayer().getId() + " ");
				}
				 //There is no Piece on the field ->No Empty
				else System.out.print(" "+" ");

			}
			
			System.out.print("|" + r + "\n");
		}
		System.out.println("---------------------");
		System.out.println("   0 1 2 3 4 5 6 7<-Y");
	}
}
