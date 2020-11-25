package Day12.project;

import static org.junit.Assert.*;

import org.junit.Test;

import Day11.project.Day11_02;

public class Day12_02_Test {

	@Test
	public void test() {
		Integer[] testCase01= {1,4,4,4,0,4,3,3,1};
		Integer[] returnVale01= {1,12,0,4,6,1};
		assertEquals(Day12_02.SingleList(testCase01),returnVale01);
		
		Integer[] testCase02= {1,1,7,7,3};
		Integer[] returnVale02= {2,14,3};
		assertEquals(Day12_02.SingleList(testCase02),returnVale02);
		
		Integer[] testCase03= {-5,-5,7,7,12,0};
		Integer[] returnVale03= {-10,14,12,0};
		assertEquals(Day12_02.SingleList(testCase03),returnVale03);
	}

}
