package Day15.project;

public class Day15_02 {
	// 모험가를 환영한다. 당신의 목표는 미로를 탐색하여 어떠한 벽도 건드리지 않고 결승점에 도달하는 것이다. 그렇게 하면 즉시 죽을 것이다!
	// 미로의 2D 배열과 길의 배열이 주어질 것이다. 너의 임무는 주어진 지시를 따르는 것이다. 모든 이동이 끝나기 전에 종료 지점에 도달하면 마침을 반환하십시오. 
	// 만약 어떤 벽에 부딪히거나 미로 경계선 밖으로 나간다면, 당신은 데드로 돌아가야 한다. 모든 동작을 다 써놓고도 여전히 미로 속에 있는 자신을 발견한다면 로스트를 돌려보내야 한다.
	public static String maze_runner(Integer[][] maze, String[] path) {
		String returnValue = "";
		int x = 0;
		int y = 0;
		
		// find start path
		for(int i=0; i<maze.length; i++) {
			for(int j=0;j<maze.length; j++) {
				if(maze[i][j].equals(2)) {
					x = i;
					y = j;
				}
			}
		}
		
		// path move
		for(int i=0; i<path.length; i++) {
			if("N".equals(path[i])) {
				x=x-1;
			}else if("E".equals(path[i])) {
				y=y+1;
			}else if("W".equals(path[i])) {
				y=y-1;
			}else if("S".equals(path[i])){
				x=x+1;
			}
		}
		
		int finalPath = maze[x][y];
		
		if(finalPath == 3) returnValue = "Finish";
		else returnValue = "return";
		
		return returnValue;
	}
}
