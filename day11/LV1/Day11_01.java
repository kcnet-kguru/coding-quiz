package Day11.project;

import java.util.List;

public class Day11_01 {
	// �Ű� �����ι��� list (lst)���� ���� ū ���� ���� ���� ���� ���̸� ��ȯ�ϴ� �Լ� maxDiff�� �����ؾ��մϴ�.
	// list (lst)���� ������ ���ԵǾ� �����Ƿ� ������ ���Ե� �� �ֽ��ϴ�.
	// ����� ��� �ְų� ���� ��Ҹ� �����ϴ� ��� 0�� ��ȯ�մϴ�.
	// ��� (lst)�� ���ĵ��� �ʽ��ϴ�.
	
	public static int maxDiff(List<Integer> inputList) {
		int returnValue = 0;
		int ListSize = inputList.size();
		int max = 0;
		int min = 0;
		
		if(ListSize > 1) {
			inputList.sort(null);
			max = inputList.get(ListSize-1);
			min = inputList.get(0);
			returnValue = max - min;
		}
		
		return returnValue;
	}
}
