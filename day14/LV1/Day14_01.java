package Day14.project;

public class Day14_01 {
	// �츮�� 0���� �����ؼ� ������ ���ڱ��� �ø�� ����ϴ� �Լ��� �����ϰ��� �Ѵ�.
	public static String serize(int inputNum) {
		int sum = 0;
		String returnValue = "";
		
		if(inputNum > 0) {
			for(int i=0; i<=inputNum; i++) {
				sum = i + sum;
				if(i == inputNum) {
					returnValue = returnValue + i + "=" + sum;
				}else {
					returnValue = returnValue + i + "+";
				}
			}
		}else if(inputNum < 0) {
			returnValue = inputNum + "<0";
		}else {
			returnValue=inputNum + "=0";
		}
		
		return returnValue;
	}
}
