package Day14.project;

import java.util.ArrayList;
import java.util.List;

public class Day14_02 {
	// ���۸��Ͽ� ���� üũ�ƿ��� ƿ�� ������ �ִ�. ��� ���� üũ�ƿ��ϴ� �� �ʿ��� �� �ð��� ����ϴ� ����� �ۼ��Ͻʽÿ�!
	// ��: ��⿭�� ��Ÿ���� �Ϸ��� ���� ���� ������ ������ ���� ��Ÿ����, �� ���� �׵��� üũ�ƿ��ϴ� �� �ʿ��� �ð��̴�.
	// n: ���� ����, üũ�ƿ� ƿ ���Դϴ�.
	// �Լ��� �ʿ��� �� �ð��� ������ ��ȯ�ؾ� �Ѵ�.
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
