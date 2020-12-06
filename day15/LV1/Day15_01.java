package Day15.project;

public class Day15_01 {
	// �� ����� �� ������ ������ ������ �� �ִ�. ù ��° ����� 1��, �� ��° ����� 2��, �� ��° ����� 1������ ����.
	// ���� ����(�ΰ��� ü��)�� �迭�� ���, �� ���� ���� �� ���ο� �迭/Ʃ���� ��ȯ�Ͻʽÿ�. 
	// ù ��° �迭�� 1���� �� ü���̰� �� ��° �迭�� 2���� �� ü���̴�.
	// �迭 ũ��� �ּ� 1�̴�.
	// ��� ���ڴ� ����� ���̴�.
	public static Integer[] rowWeights(Integer[] inputArray) {
		Integer[] returnValue = new Integer[2];
		returnValue[0] = 0;
		returnValue[1] = 0;
		
		for(int i=0; i<inputArray.length; i++) {
			if(i%2 == 0) {
				returnValue[0] = returnValue[0] + inputArray[i];
			}else {
				returnValue[1] = returnValue[1] + inputArray[i];
			}
		}
		
		return returnValue;
	}
}
