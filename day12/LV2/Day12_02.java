package Day12.project;

import java.util.ArrayList;
import java.util.List;

public class Day12_02 {
	// 수(양수 및 음수)만 포함된 목록/배열이 제공됨 당신의 일은 같은 숫자와 연속된 숫자만 합하는 것이다. 결과는 하나의 목록이어야 한다.
	// 목록/배열이 비어 있지 않으며 항상 정수가 있을 것이라고 가정할 수 있다.
	public static Integer[] SingleList(Integer[] inputArray) {
		List<Integer> returnList = new ArrayList<Integer>();
		
		for(int i=0; i<inputArray.length; i++) {
			int cnt = 1;
			int arrayValue = inputArray[i];

			if(i+cnt < inputArray.length) {
				while(inputArray[i] == inputArray[i+cnt]) {
					cnt ++;
				}
			}
			arrayValue = arrayValue*cnt;
			returnList.add(arrayValue);
			if(cnt != 1) i = (i+cnt-1);
		}
		
		Integer[] returnArray = new Integer[returnList.size()];
	
		for(int i=0; i<returnList.size(); i++) {
			returnArray[i] = returnList.get(i);
		}
		
		return returnArray;
	}
}
