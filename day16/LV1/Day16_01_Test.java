package Day16.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day16_01_Test {

	@Test
	public void test() {
		Integer[] testCase01= {4, 8, 6};
		assertEquals(Day16_01.requiredNumCnt(testCase01),2);
		
		Integer[] testCase02= {1, 2, 3, 4};
		assertEquals(Day16_01.requiredNumCnt(testCase02),0);
		
		Integer[] testCase03= {};
		assertEquals(Day16_01.requiredNumCnt(testCase03),0);
		
		Integer[] testCase04= {1};
		assertEquals(Day16_01.requiredNumCnt(testCase04),0);
	}

}
