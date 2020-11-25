package Day12.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day12_01_Test {

	@Test
	public void test() {
		assertEquals(Day12_01.factorial(1),0);
		assertEquals(Day12_01.factorial(3),6);
		assertEquals(Day12_01.factorial(5),120);
	}

}
