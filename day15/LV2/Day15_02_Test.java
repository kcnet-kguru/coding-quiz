package Day15.project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Day15_02_Test {

	@Test
	public void test() {
		Integer[][] mazeArray= {
				{1,1,1,1,1,1,1},
				{1,0,0,0,0,0,3},
				{1,0,1,0,1,0,1},
				{0,0,1,0,0,0,1},
				{1,0,1,0,1,0,1},
				{1,0,0,0,0,0,1},
				{1,2,1,0,1,0,1}
		};
		
		String[] testCase01 = {"N","N","N","N","N","E","E","E","E","E"};
		assertEquals(Day15_02.maze_runner(mazeArray, testCase01),"Finish");
		
		String[] testCase02 = {"N","N","N","N","N","E","E","S","S","E","E","N","N","E"};
		assertEquals(Day15_02.maze_runner(mazeArray, testCase02),"Finish");
		
		//String[] testCase03 = {"N","N","N","N","N","E","E","E","E","E","W","W"};
		//assertEquals(Day15_02.maze_runner(mazeArray, testCase03),"Finish");
	}

}
