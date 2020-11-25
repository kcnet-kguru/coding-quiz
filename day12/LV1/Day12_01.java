package Day12.project;

public class Day12_01 {
	// 수학에서 n!으로 표시된 비 음의 정수 n의 계수는 n보다 작거나 같은 모든 양의 정수의 산물이다.
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
