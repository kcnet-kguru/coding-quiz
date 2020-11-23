package Day11.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day11_02_Test {

	@Test
	public void test() {
		Integer[] testCase01= {5, 3, 2, 8, 1, 4};
		Integer[] returnVale01= {1, 3, 2, 8, 5, 4};
		assertEquals(Day11_02.sortArray(testCase01),returnVale01);
		
		Integer[] testCase02= {5, 3, 1, 8, 0};
		Integer[] returnVale02= {1, 3, 5, 8, 0};
		assertEquals(Day11_02.sortArray(testCase02),returnVale02);
	}

}
