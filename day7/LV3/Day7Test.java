
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day7Test {
	@Test
	public void testCase1() {
		int[] result=Day7.sum_pairs(new int[] {11, 3, 7, 5},10);
		
		assertArrayEquals(result,new int[] {3,7});
	}
	
	@Test
	public void testCase2() {
		int[] result=Day7.sum_pairs(new int[] {4, 3, 2, 3, 4},6);
		assertArrayEquals(result,new int[] {4,2});
	}
	
	@Test
	public void testCase3() {
		int[] result=Day7.sum_pairs(new int[] {0, 0, -2, 3},2);
		assertArrayEquals(result,new int[] {});
	}
	@Test
	public void testCase4() {
		int[] result=Day7.sum_pairs(new int[] {10, 5, 2, 3, 7, 5},10);
		assertArrayEquals(result,new int[] {3,7});
	}
}
