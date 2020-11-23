package Day11.project;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Day11_01_Test {

	@Test
	public void test() {
		List<Integer> testCase01 = Arrays.asList(1,2,3,4);
		assertEquals(Day11_01.maxDiff(testCase01),3);
		
		List<Integer> testCase02 = Arrays.asList(1, 2, 3, -4);
		assertEquals(Day11_01.maxDiff(testCase02),7);
		
		List<Integer> testCase03 = Arrays.asList(1, 2, 3, 4, 5, 5, 4);
		assertEquals(Day11_01.maxDiff(testCase03),4);
		
		List<Integer> testCase04 = Arrays.asList(-4, -5, -3, -1, -31);
		assertEquals(Day11_01.maxDiff(testCase04),30);
		
		List<Integer> testCase05 = Arrays.asList(1000000);
		assertEquals(Day11_01.maxDiff(testCase05),0);
		
		List<Integer> testCase06 = Arrays.asList();
		assertEquals(Day11_01.maxDiff(testCase06),0);
	}

}
