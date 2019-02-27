import java.util.*;

import java.util.stream.*;

public class Gameplay {
	for (;;) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Turn of player no."+ turnState);
		int[] oldCoord = choosePiece(sc);
		int [] newCoord = chooseMove(oldCoord[0], oldCoord[1], sc);
		updateBoard(oldCoord[0], oldCoord[1], newCoord[0], newCoord[1]);
		printBoard();
		if(turnState == 1)
			turnState = 2;
		else
			turnState = 1;
		
	}
}
