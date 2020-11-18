
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day8Test {
	@Test
	public void testCase1(){
		String result=Day8.humanReadable(0);
		String answer = "00:00:00";
		
		assertEquals(result,answer);
	}
	
	@Test
	public void testCase2(){
		String result=Day8.humanReadable(5);
		String answer = "00:00:05";
		
		assertEquals(result,answer);
	}
	
	@Test
	public void testCase3(){
		String result=Day8.humanReadable(60);
		String answer = "00:01:00";
		
		assertEquals(result,answer);
	}
	
	@Test
	public void testCase4(){
		String result=Day8.humanReadable(86399);
		String answer = "23:59:59";
		
		assertEquals(result,answer);
	}
	
	@Test
	public void testCase5(){
		String result=Day8.humanReadable(359999);
		String answer = "99:59:59";
		
		assertEquals(result,answer);
	}

}
