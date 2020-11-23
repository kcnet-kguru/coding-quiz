package Day11.project;

import java.util.List;

public class Day11_01 {
	// 매개 변수로받은 list (lst)에서 가장 큰 값과 가장 작은 값의 차이를 반환하는 함수 maxDiff를 구현해야합니다.
	// list (lst)에는 정수가 포함되어 있으므로 음수가 포함될 수 있습니다.
	// 목록이 비어 있거나 단일 요소를 포함하는 경우 0을 반환합니다.
	// 목록 (lst)은 정렬되지 않습니다.
	
	public static int maxDiff(List<Integer> inputList) {
		int returnValue = 0;
		int ListSize = inputList.size();
		int max = 0;
		int min = 0;
		
		if(ListSize > 1) {
			inputList.sort(null);
			max = inputList.get(ListSize-1);
			min = inputList.get(0);
			returnValue = max - min;
		}
		
		return returnValue;
	}
}
