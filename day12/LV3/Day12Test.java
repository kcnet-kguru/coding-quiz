
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day12Test {
	
	@Test
	public void testCase1(){
		String result=Day12.orderWeight("103 123 4444 99 2000");
		
		assertEquals(result,"2000 103 123 4444 99");
		
	}
	@Test
	public void testCase2(){
		String result=Day12.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123");
		
		assertEquals(result,"11 11 2000 10003 22 123 1234000 44444444 9999");
		
	}

}
