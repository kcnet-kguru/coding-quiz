
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day17Test {
	
	@Test
	public void testCase1(){
		int answer = Day17.ticTacToe(new int[][] {{0,0,1},{0,1,2},{2,1,0}});
		assertEquals(answer, -1);
	}
	@Test
	public void testCase2(){
		int answer = Day17.ticTacToe(new int[][] {{1,2,1},{2,2,1},{1,1,2}});
		assertEquals(answer, 0);
	}
}
