package Day14.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day14_01_Test {

	@Test
	public void test() {
		assertEquals(Day14_01.serize(6),"0+1+2+3+4+5+6=21");
		assertEquals(Day14_01.serize(-15),"-15<0");
		assertEquals(Day14_01.serize(0),"0=0");
	}

}
