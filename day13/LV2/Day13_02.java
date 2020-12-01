package Day13.project;

import java.util.ArrayList;
import java.util.List;

public class Day13_02 {
	// �־��� ������ �迭�� �߰� x-time���� ���� ����� ��� �Ѵ�.
	// ���ôٽ��� ������ ������ Ȧ���� ��� �߰����� �״�� ���´�. �׷��� ������ ���� ���� �߰��� ���̿� �����Ƿ� ��� ���ڴ� � ������ �߰��� ���̴�
	// �迭�� �׻� ���ڸ� �����ϸ� null�� ���� �ʴ´�. �Ű����� ���� �׻� 0���� ū ���� �����̸�, �޼��尡 �󸶳� ���� ���� ���� �����ؾ� �ϴ��� �˷��ش�.
	// �ϳ��� ��Ұ� �ִ� �迭�� ������ ������ �迭�� �����ȴ�.
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
