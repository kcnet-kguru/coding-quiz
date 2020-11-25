
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
public class Day13Test {
	
	@Test
	public void testCase1(){
		int answer[] = Day13.foldArray(new int[] {1, 2, 3, 4, 5}, 1);
		assertArrayEquals(answer, new int[] {6,6,3});
	}
	@Test
	public void testCase2(){
		int answer[] = Day13.foldArray(new int[] {1, 2, 3, 4, 5}, 2);
		assertArrayEquals(answer, new int[] {9,6});
		
	}
	@Test
	public void testCase3(){
		int answer[] = Day13.foldArray(new int[] {1, 2, 3, 4, 5}, 3);
		assertArrayEquals(answer, new int[] {15});
	}
	@Test
	public void testCase4(){
		int answer[] = Day13.foldArray(new int[] {-9, 9, -8, 8, 66, 23}, 1);
		assertArrayEquals(answer, new int[] {14,75,0});
		
	}

}
