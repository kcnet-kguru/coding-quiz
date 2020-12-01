
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day15Test {
	
	@Test
	public void testCase1(){
		int answer = Day15.bestSum(163,3,new int[] {50, 55, 56, 57, 58});
		assertEquals(answer, 163);
	}
	@Test
	public void testCase2(){
		int answer = Day15.bestSum(163,3,new int[] {50});
		assertEquals(answer, -1);
		
	}
	@Test
	public void testCase3(){
		int answer = Day15.bestSum(230,3,new int[] {91, 74, 73, 85, 73, 81, 87});
		assertEquals(answer, 228);
	}

}
