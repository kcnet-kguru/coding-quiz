
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Day10Test {
	
	@Test
	public void testCase1(){
		String s1 = "my&friend&Paul has heavy hats! &";
		String s2 = "my friend John has many many friends &";
		String result=Day10.mix(s1,s2);
		
		assertEquals(result.toString(),"2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss");
	}
	@Test
	public void testCase2(){
		String s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &";
		String s2 = "my frie n d Joh n has ma n y ma n y frie n ds n";
		String result=Day10.mix(s1,s2);
		
		assertEquals(result,"1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss");
	}
	@Test
	public void testCase3(){
		String s1 = "Are the kids at home? aaaaa fffff";
		String s2 = "Yes they are here! aaaaa fffff";
		String result=Day10.mix(s1,s2);
		assertEquals(result,"=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh");
	}
	@Test
	public void testCase4(){
		String s1 = "Are they here";
		String s2 = "yes, they are here";
		String result=Day10.mix(s1,s2);
		
		assertEquals(result,"2:eeeee/2:yy/=:hh/=:rr");
	}
	@Test
	public void testCase5(){
		String s1 = "looping is fun but dangerous";
		String s2 = "less dangerous than coding";
		String result=Day10.mix(s1,s2);
		
		assertEquals(result,"1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg");
	}
	@Test
	public void testCase6(){
		String s1 = " In many languages";
		String s2 = " there's a pair of functions";
		String result=Day10.mix(s1,s2);
		
		assertEquals(result,"1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt");
	}
	
}
