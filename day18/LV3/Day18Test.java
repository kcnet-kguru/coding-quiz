
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day18Test {
	
	@Test
	public void testCase1(){
		int[] answer = Day18.decompose(11);
		assertArrayEquals(answer, new int [] {1,2,4,10});
	}
	@Test
	public void testCase2(){
		int[] answer = Day18.decompose(50);
		assertArrayEquals(answer, new int[] {1,3,5,8,49});
	}
	@Test
	public void testCase3(){
		int[] answer = Day18.decompose(4);
		assertArrayEquals(answer, null);
	}
}
