package Day13.project;

import static org.junit.Assert.*;

import org.junit.Test;

import Day12.project.Day12_02;

public class Day13_02_Test {

	@Test
	public void test() {
		Integer[] testCase01= {1, 2, 3, 4, 5};
		Integer[] returnVale01= {6, 6, 3};
		assertEquals(Day13_02.foldArray(testCase01, 1),returnVale01);
		
		Integer[] testCase02= {1, 2, 3, 4, 5};
		Integer[] returnVale02= {9, 6};
		assertEquals(Day13_02.foldArray(testCase02, 2),returnVale02);
		
		Integer[] testCase03= {1, 2, 3, 4, 5};
		Integer[] returnVale03= {15};
		assertEquals(Day13_02.foldArray(testCase03, 3),returnVale03);
		
		Integer[] testCase04= {-9, 9, -8, 8, 66, 23};
		Integer[] returnVale04= {14, 75, 0};
		assertEquals(Day13_02.foldArray(testCase04, 1),returnVale04);
	}

}
