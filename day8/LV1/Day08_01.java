package Day08.project;

import java.util.List;

public class Day08_01 {
	//�Է� �� �� ���ڿ��� ��� ���ڸ� �׷����� �����ϴ� ���ڿ��� ��ȯ�ϴ� �Լ��� ����ϴ�. ��� �Է��� ù ���ڸ� ���� �ͼ� ���� �׷�ȭ�մϴ�. 
	//��� ������ ������ �۾��� �����Ͻʽÿ�.
	public static void main(String[] args) {
		tripleTrouble("this","test","lock");
		tripleTrouble("aa","bb","cc");
		tripleTrouble("Bm", "aa", "tn");
		tripleTrouble("LLh","euo","xtr");
	}
	
	public static String tripleTrouble(String one, String two, String three) {
		String returnValue = "";
		
		String[] oneWordList = one.split("");
		String[] twoWordList = two.split("");
		String[] threeWordList = three.split("");
	
		for(int i=0; i<oneWordList.length;i++) {
			returnValue = returnValue + oneWordList[i] + twoWordList[i] + threeWordList[i];
		}
		System.out.println(returnValue);
		return returnValue;
	}
}
