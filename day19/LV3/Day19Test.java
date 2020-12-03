
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day19Test {
	
	@Test
	public void testCase1(){
		String answer = Day19.findMostSimilar("strawberry", new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
		assertEquals(answer, "strawberry");
	}
	@Test
	public void testCase2(){
		String answer = Day19.findMostSimilar("berry", new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
		assertEquals(answer, "cherry");
	}
	@Test
	public void testCase3(){
		String answer = Day19.findMostSimilar("heaven",new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
		assertEquals(answer, "java");
	}
	@Test
	public void testCase4(){
		String answer = Day19.findMostSimilar("javascript",new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
		assertEquals(answer, "javascript");
	}

}
