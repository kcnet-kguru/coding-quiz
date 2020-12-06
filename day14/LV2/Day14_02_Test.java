package Day14.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day14_02_Test {

	@Test
	public void test() {
		Integer[] testCase01= {5,3,4};
		assertEquals(Day14_02.queue_time(testCase01, 1),12);
		
		Integer[] testCase02= {10,2,3,3};
		assertEquals(Day14_02.queue_time(testCase02, 2),10);
		
		Integer[] testCase03= {2,3,10};
		assertEquals(Day14_02.queue_time(testCase03, 2),12);
	}

}
