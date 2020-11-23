
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day11Test {
	
	@Test
	public void testCase1(){
		String[] result=Day11.removeNb(26);
		
		assertArrayEquals(result,new String[] {"(15,21)","(21,15)"});
		
	}


	
}
