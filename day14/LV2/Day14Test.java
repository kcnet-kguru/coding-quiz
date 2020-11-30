
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day14Test {
	
	@Test
	public void testCase1(){
		int answer = Day14.queue_time(new int[] {5, 3, 4}, 1);
		assertEquals(answer, 12);
	}
	@Test
	public void testCase2(){
		int answer = Day14.queue_time(new int[] {10, 2, 3, 3}, 2);
		assertEquals(answer, 10);
		
	}
	@Test
	public void testCase3(){
		int answer = Day14.queue_time(new int[] {2, 3, 10}, 2);
		assertEquals(answer, 12);
	}

}
