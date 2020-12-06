package Day15.project;

public class Day15_01 {
	// 몇 사람이 두 팀으로 나뉘어 줄지어 서 있다. 첫 번째 사람은 1팀, 두 번째 사람은 2팀, 세 번째 사람은 1팀으로 간다.
	// 양의 정수(인간의 체중)를 배열한 경우, 두 개의 정수 중 새로운 배열/튜플을 반환하십시오. 
	// 첫 번째 배열은 1팀의 총 체중이고 두 번째 배열은 2팀의 총 체중이다.
	// 배열 크기는 최소 1이다.
	// 모든 숫자는 양수일 것이다.
	public static Integer[] rowWeights(Integer[] inputArray) {
		Integer[] returnValue = new Integer[2];
		returnValue[0] = 0;
		returnValue[1] = 0;
		
		for(int i=0; i<inputArray.length; i++) {
			if(i%2 == 0) {
				returnValue[0] = returnValue[0] + inputArray[i];
			}else {
				returnValue[1] = returnValue[1] + inputArray[i];
			}
		}
		
		return returnValue;
	}
}
