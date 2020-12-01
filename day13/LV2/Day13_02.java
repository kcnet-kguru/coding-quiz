package Day13.project;

import java.util.ArrayList;
import java.util.List;

public class Day13_02 {
	// 주어진 정수의 배열을 중간 x-time으로 접는 방법을 써야 한다.
	// 보시다시피 숫자의 개수가 홀수일 경우 중간수는 그대로 남는다. 그렇지 않으면 접는 점이 중간수 사이에 있으므로 모든 숫자는 어떤 식으로 추가될 것이다
	// 배열은 항상 숫자를 포함하며 null이 되지 않는다. 매개변수 런은 항상 0보다 큰 양의 정수이며, 메서드가 얼마나 많은 폴딩 런을 수행해야 하는지 알려준다.
	// 하나의 요소가 있는 배열을 접으면 동일한 배열로 유지된다.
	public static Integer[] foldArray(Integer[] inputArray, int foldCnt) {
		List<Integer> tempList = new ArrayList<Integer>();
		List<Integer> tempHalfList = new ArrayList<Integer>();
		
		for(int i=0; i<inputArray.length; i++) {
			tempList.add(inputArray[i]);
		}
		
		for(int i=0; i<foldCnt; i++) {
			tempHalfList = getFoldList(tempList);
			tempList = tempHalfList;
		}
		
		Integer[] returnArray = new Integer[tempList.size()];
		for(int i=0; i<tempList.size(); i++) {
			returnArray[i] = tempList.get(i);
		}
		
		return returnArray;
	}
	
	public static List<Integer> getFoldList(List<Integer> inputList){
		List<Integer> ArrayList = new ArrayList<Integer>();
		
		int ListSize = inputList.size();
		int ListHalfSize = inputList.size()/2;
		if(ListSize%2 != 0) ListHalfSize += 1;
		
		for(int i=0; i<ListHalfSize; i++) {
			int ListValue = 0;
			
			if(ListSize%2!=0 && i==ListSize/2) ListValue = inputList.get(i);
			else ListValue = inputList.get(i) + inputList.get((ListSize - 1) - i);
			
			ArrayList.add(ListValue);
		}
		return ArrayList;
	}
}
