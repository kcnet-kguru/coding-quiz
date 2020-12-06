package Day15.project;

public class Day15_02 {
	// ���谡�� ȯ���Ѵ�. ����� ��ǥ�� �̷θ� Ž���Ͽ� ��� ���� �ǵ帮�� �ʰ� ������� �����ϴ� ���̴�. �׷��� �ϸ� ��� ���� ���̴�!
	// �̷��� 2D �迭�� ���� �迭�� �־��� ���̴�. ���� �ӹ��� �־��� ���ø� ������ ���̴�. ��� �̵��� ������ ���� ���� ������ �����ϸ� ��ħ�� ��ȯ�Ͻʽÿ�. 
	// ���� � ���� �ε����ų� �̷� ��輱 ������ �����ٸ�, ����� ����� ���ư��� �Ѵ�. ��� ������ �� ����� ������ �̷� �ӿ� �ִ� �ڽ��� �߰��Ѵٸ� �ν�Ʈ�� ���������� �Ѵ�.
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
