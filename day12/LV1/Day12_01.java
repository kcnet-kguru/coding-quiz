package Day12.project;

public class Day12_01 {
	// ���п��� n!���� ǥ�õ� �� ���� ���� n�� ����� n���� �۰ų� ���� ��� ���� ������ �깰�̴�.
	public static int factorial(int inputNum) {
		int returnValue = 1;
		
		if(inputNum == 1) returnValue = 0;
		else {
			for(int i=1; i<=inputNum; i++) {
				returnValue = returnValue * i;
			}
		}
		
		return returnValue;
	}
}
