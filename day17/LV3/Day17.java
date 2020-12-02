import java.util.Arrays;

public class Day17{

	public static int ticTacToe(int[][] map) {
		return checkEndGame(map);
	}
	
	public static int checkEndGame(int[][] map) {
		
		int[] playerStatus =  new int[map.length];
		
		for (int i = 0; i < map.length ; i++) {
			for (int j = 0; j < map[i].length ; j++) {
				if (map[i][j] == 0) {
					return -1;
				}
			}
		}
		int rowCheck = rowCheck(map);
		
		if (rowCheck == 1 ) {
			return 1;
		}
		else if (rowCheck == 2 ) {
			return 2;
		}
		
		int colCheck = colCheck(map);
		
		if (colCheck == 1 ) {
			return 1;
		}
		else if (colCheck == 2 ) {
			return 2;
		}
		
		int leftCrossCheck = leftCrossCheck(map);
		
		if (leftCrossCheck == 1 ) {
			return 1;
		}
		else if (leftCrossCheck == 2 ) {
			return 2;
		}

	
		int rightCrossCheck = rightCrossCheck(map);
		
		if (rightCrossCheck == 1 ) {
			return 1;
		}
		else if (rightCrossCheck == 2 ) {
			return 2;
		}
		
		
		
		return 0;
	}
	public static int rowCheck(int map[][]) {
		int[] playerStatus =  new int[map.length];
		for (int i = 0; i < map.length ; i++) {
			Arrays.fill(playerStatus, 0);
			for (int j = 0 ; j < map[i].length ; j++) {
				if (map[i][j]==1) {
					playerStatus[0]++;
				} else if (map[i][j]==2) {
					playerStatus[1]++;
				}
			}
			if (playerStatus[0]==3) {
				return 1;
			} else if (playerStatus[1]==3) {
				return 2;
			}
		}
		return 0;
	}
	public static int colCheck(int map[][]) {
		int[] playerStatus =  new int[map.length];
		for (int i = 0; i < map.length ; i++) {
			Arrays.fill(playerStatus, 0);
			for (int j = 0 ; j < map[i].length ; j++) {
				if (map[j][i]==1) {
					playerStatus[0]++;
				} else if (map[j][i]==2) {
					playerStatus[1]++;
				}
			}
			if (playerStatus[0]==3) {
				return 1;
			} else if (playerStatus[1]==3) {
				return 2;
			}
		}
		return 0;
	}
	public static int leftCrossCheck(int map[][]) {
		int[] playerStatus =  new int[map.length];
		for (int i = 0 ; i < map.length ; i++) {
			if (map[i][i] == 1) {
				playerStatus[0]++;
			} else if (map[i][i]==2) {
				playerStatus[1]++;
			}
		}
		if (playerStatus[0]==3) {
			return 1;
		} else if (playerStatus[1]==3) {
			return 2;
		}
		return 0;
	}
	public static int rightCrossCheck(int map[][]) {
		int[] playerStatus =  new int[map.length];
		int check = 0;
		while (check < 3) {
			int data = map[0 + check][2 - check];
			if (data == 1) {
				playerStatus[0]++;
			} else if (data == 2) {
				playerStatus[1]++;
			}
			check++;
		}
		
		if (playerStatus[0]==3) {
			return 1;
		} else if (playerStatus[1]==3) {
			return 2;
		}
		return 0;
	}
}
