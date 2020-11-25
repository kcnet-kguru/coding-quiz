package Day12.project;

import java.util.ArrayList;
import java.util.List;

public class Day12_02 {
	// ��(��� �� ����)�� ���Ե� ���/�迭�� ������ ����� ���� ���� ���ڿ� ���ӵ� ���ڸ� ���ϴ� ���̴�. ����� �ϳ��� ����̾�� �Ѵ�.
	// ���/�迭�� ��� ���� ������ �׻� ������ ���� ���̶�� ������ �� �ִ�.
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
