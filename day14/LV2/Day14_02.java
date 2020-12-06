package Day14.project;

import java.util.ArrayList;
import java.util.List;

public class Day14_02 {
	// 슈퍼마켓에 셀프 체크아웃용 틸이 줄지어 있다. 모든 고객이 체크아웃하는 데 필요한 총 시간을 계산하는 기능을 작성하십시오!
	// 고객: 대기열을 나타내는 일련의 양의 정수 각각의 정수는 고객을 나타내며, 그 값은 그들이 체크아웃하는 데 필요한 시간이다.
	// n: 양의 정수, 체크아웃 틸 수입니다.
	// 함수는 필요한 총 시간인 정수를 반환해야 한다.
	public static int queue_time(Integer[] customer, int checkoutTeal) {
		int totalTime = 0;
		int remainCustomerCnt = 0;
		Integer[] checkoutTealArray = new Integer[checkoutTeal];
		
		for(int i=0; i<checkoutTeal; i++) {
			checkoutTealArray[i] = customer[i];
		}		
		
		remainCustomerCnt = customer.length - checkoutTeal;
		
		for(int i=0; i<remainCustomerCnt; i++) {
			int LowIndex = findMinIndex(checkoutTealArray)[0];
			checkoutTealArray[LowIndex] = checkoutTealArray[LowIndex] + customer[i+checkoutTeal];
		}
		
		totalTime = findMaxValue(checkoutTealArray)[1];

		return totalTime;
	}
	
	public static Integer[] findMinIndex(Integer[] Array) {
		Integer[] minArray = new Integer[2];
		minArray[0] = 0;
		minArray[1] = Array[0];
		
		for(int i=0;i<Array.length;i++) {
			if(minArray[1] > Array[i]) {
				minArray[0] = i;
				minArray[1] = Array[i];
			}
		}
		
		return minArray;
	}
	
	public static Integer[] findMaxValue(Integer[] Array) {
		Integer[] maxArray = new Integer[2];
		maxArray[0] = 0;
		maxArray[1] = Array[0];
		
		for(int i=0; i<Array.length; i++) {
			if(maxArray[1] < Array[i]) {
				maxArray[0] = i;
				maxArray[1] = Array[i];
			}
		}
		
		return maxArray;
	}
}
