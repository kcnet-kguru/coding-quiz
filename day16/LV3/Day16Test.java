
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day16Test {
	
	@Test
	public void testCase1(){
		int[] answer = Day16.partsSums(new int[] {1, 2, 3, 4, 5, 6});
		assertArrayEquals(answer, new int[] {21, 20, 18, 15, 11, 6, 0});
	}
	@Test
	public void testCase2(){
		int[] answer = Day16.partsSums(new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358});
		assertArrayEquals(answer, new int[] {10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});
	}
}
