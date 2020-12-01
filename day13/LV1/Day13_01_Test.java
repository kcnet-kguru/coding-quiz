package Day13.project;

import static org.junit.Assert.*;

import org.junit.Test;

import Day11.project.Day11_01;

public class Day13_01_Test {

	@Test
	public void test() {
		assertEquals(Day13_01.getVowelsLong("ultrarevolutionariees"),3);
		assertEquals(Day13_01.getVowelsLong("codewarriors"),2);
		assertEquals(Day13_01.getVowelsLong("suoidea"),3);
		assertEquals(Day13_01.getVowelsLong("strengthlessnesses"),1);
		assertEquals(Day13_01.getVowelsLong("mnopqriouaeiopqrstuvwxyuaeiouaeiou"),11);
	}

}
