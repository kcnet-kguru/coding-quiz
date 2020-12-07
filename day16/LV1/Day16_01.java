package Day16.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Day16_01 {
	//정수의 배열을 취하고 arr의 내용을 가장 낮은 수에서 가장 높은 수로 연속하는 데 필요한 최소 정수 수를 반환하는 함수 연속(arr)을 만든다.
	//예를 들면 다음과 같다.
	//arr이 [4, 8, 6]을 포함하는 경우, 4에서 8까지의 연속적인 숫자 배열을 만들려면 배열(5, 7)에 두 개의 숫자를 추가해야 하기 때문에 출력은 2가 되어야 한다. arr의 숫자는 유니크 할 것이다.
	public static int requiredNumCnt(Integer[] inputArr) {
		int returnValue = 0;
		Integer[] sortingInputArr = sortingArray(inputArr);
		
		if(inputArr.length > 0) {
			int ArrayCount = 0;
			for(int i=inputArr[0]; i<=sortingInputArr[(inputArr.length)-1]; i++) {
				if(sortingInputArr[ArrayCount] == i) {
					ArrayCount ++;
				}else {
					returnValue++;
				}
			}
		}
		
		return returnValue;
	}
	
	public static Integer[] sortingArray(Integer[] inputArr) {
		Integer[] returnArray = new Integer[inputArr.length];
		ArrayList<Integer> inputArrList= new ArrayList<Integer>();
		
		for(int i=0; i<inputArr.length; i++) {
			inputArrList.add(inputArr[i]);
		}
		
		inputArrList.sort(null);
		for(int i=0; i<inputArrList.size(); i++) {
			returnArray[i] = inputArrList.get(i);
		}
		
		return returnArray;
	}
}
