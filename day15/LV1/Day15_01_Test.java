package Day15.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day15_01_Test {

	@Test
	public void test() {
		Integer[] testCase01= {13, 27, 49};
		Integer[] returnCase01= {62, 27};
		assertEquals(Day15_01.rowWeights(testCase01),returnCase01);
		
		Integer[] testCase02= {50, 60, 70, 80};
		Integer[] returnCase02= {120, 140};
		assertEquals(Day15_01.rowWeights(testCase02),returnCase02);
		
		Integer[] testCase03= {80};
		Integer[] returnCase03= {80, 0};
		assertEquals(Day15_01.rowWeights(testCase03),returnCase03);
	}

}
