package Day11.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11_02 {
	// ���� �迭�� �ֽ��ϴ�.
	// ����� �ӹ��� Ȧ�� ��°(1 base index) ���ڸ� ������������ �����ϴ� �������� ¦���� �� �ڸ��� �־���մϴ�.
	// 0�� Ȧ���� �ƴϹǷ� �̵��� �ʿ䰡 �����ϴ�. 
	// �� �迭�� ��� ��迭�� ��ȯ�ؾ��մϴ�.
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
