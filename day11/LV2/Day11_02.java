package Day11.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11_02 {
	// 숫자 배열이 있습니다.
	// 당신의 임무는 홀수 번째(1 base index) 숫자를 오름차순으로 정렬하는 것이지만 짝수는 그 자리에 있어야합니다.
	// 0은 홀수가 아니므로 이동할 필요가 없습니다. 
	// 빈 배열일 경우 빈배열을 반환해야합니다.
	public static Integer[] sortArray(Integer[] inputArray) {
		Integer[] returnArray = new Integer[inputArray.length];
		
		ArrayList<Integer> sortInputList = new ArrayList<>(Arrays.asList(inputArray));
		sortInputList.sort(null);
		for(int i=0;i<sortInputList.size();i++) {
			if(sortInputList.get(i)%2 == 0) sortInputList.remove(i);
		}
		
		int cnt = 0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]%2==0) {
				returnArray[i] = inputArray[i];
			}else {
				returnArray[i] = sortInputList.get(cnt);
				cnt ++;
			}
		}
		
		return returnArray;
	}
}
