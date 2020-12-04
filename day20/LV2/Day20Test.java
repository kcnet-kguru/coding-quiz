
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day20Test {
	
	@Test
	public void testCase1(){
		boolean answer = Day20.pangramCheck("The quick brown fox jumps over the lazy dog.");
		assertEquals(answer, true);
	}
	@Test
	public void testCase2(){
		boolean answer = Day20.pangramCheck("You shall not pass!");
		assertEquals(answer, false);
	}
}
