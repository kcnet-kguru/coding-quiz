package Day07.project;

import java.util.List;

public class Day07_02 {
	// �μ��� �ܾ �޾� Ȧ���� ��� �ܾ��� �߰� ���ڸ� ��ȯ�ϰ�, ¦���� ��� �߰��� 2���ڸ� ��ȯ�ϴ� �Լ��� �ۼ��ϼ���
	public static void main(String args[]) {
		middleValue("test");
		middleValue("testing");
		middleValue("middle");
		middleValue("A");
	}
	
	public static String middleValue(String word) {
		String returnValue = "";
		int wordLength = word.length();
		
		if(wordLength%2 == 0) returnValue = word.substring((wordLength/2)-1, (wordLength/2)+1);
		else if(wordLength == 1) returnValue = word.substring(wordLength/2);
		else returnValue = word.substring((wordLength/2), (wordLength/2)+1);
		
		System.out.println(returnValue);
		return returnValue;
	}
}
