package test;

import static org.junit.Assert.*;

import org.junit.Before;

import checker.Board;
import checker.Player;
import checker.Validator;

import org.junit.Test;

public class ValidatorTest{

	Player p1 = new Player("Adam",1);
	Player p2 = new Player ("Kilian",2);
	Board board = new Board(p1,p2);
	
	@Test
	public void createEmptyStack() {
		
		assertTrue("Should be invalid",Validator.checkMove(2, 1, 3, 0, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 1, 3, 2, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 3, 3, 2, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 3, 3, 4, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 5, 3, 4, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 5, 3, 6, p1, board));
		assertTrue("Should be invalid",Validator.checkMove(2, 7, 3, 6, p1, board));
		
		assertFalse("Should be invalid",Validator.checkMove(2, 1, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 1, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 3, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 3, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 5, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 5, 3, 1, p1, board));
		assertFalse("Should be invalid",Validator.checkMove(2, 7, 3, 1, p1, board));
		
		assertFalse("Should be invalid",Validator.checkMove(2, 9, 3, 1, p1, board));
	}
	//checkMove (int oldX, int oldY, int newX, int newY, Player playerHasTurn, Board board)
//	@Test
//	public void createEmpty() {
//		
//		assertFalse("Should be invalid",Validator.checkMove(1, 2, 3, 4, p2, board));
//		
//		
//	}
//	@Test
//	public void testIsEmpty() {
//		assertTrue("Should be empty", stack.isEmpty());
//	}
//
//	@Test
//	public void testIsFull() {
//		for(int i=0; i<5;++i)
//		{
//			stack.push("bla");
//			
//		}
//		
//		assertTrue("Should be full", stack.isFull());
//		
//	}
//
//	@Test
//	public void testSize() {
//		assertEquals(0,stack.size());
//		stack.push("Apple");
//		assertEquals(1,stack.size());
//		stack.pop();
//		assertEquals(0,stack.size());
//
//	}
//
//	@Test(expected = IndexOutOfBoundsException.class)
//	public void testPushAlreadyFull() {
//		for(int i=0; i<6;++i)
//		{
//			stack.push("bla");
//			
//		}
//	}
//	
//	@Test (timeout =500)
//	public void testPerformance()
//	{
//		FixedCapacityStackOfStrings stackPerf = new FixedCapacityStackOfStrings(1000000);
//		for(int i=0; i<1000000;++i)
//		{
//			stackPerf.push("bla " + i+1);
//			
//		}
//	}
//
//	@Test (expected = IndexOutOfBoundsException.class)
//	public void testPop() {
//		stack.pop();
//	}
//
//	@Test
//	public void testPeek() {
//		stack.push("Apple");
//		stack.push("Banana");
//		assertEquals("Banana", stack.peek());
//		stack.pop();
//		assertEquals("Apple", stack.peek());
//	}
	
	

}
