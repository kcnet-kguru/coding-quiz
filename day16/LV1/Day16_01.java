package Day16.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Day16_01 {
	//������ �迭�� ���ϰ� arr�� ������ ���� ���� ������ ���� ���� ���� �����ϴ� �� �ʿ��� �ּ� ���� ���� ��ȯ�ϴ� �Լ� ����(arr)�� �����.
	//���� ��� ������ ����.
	//arr�� [4, 8, 6]�� �����ϴ� ���, 4���� 8������ �������� ���� �迭�� ������� �迭(5, 7)�� �� ���� ���ڸ� �߰��ؾ� �ϱ� ������ ����� 2�� �Ǿ�� �Ѵ�. arr�� ���ڴ� ����ũ �� ���̴�.
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
