package Day13.project;

import java.util.ArrayList;
import java.util.List;

public class Day13_01 {
	// "codewarriors" �ܾ��� ���� ���ڿ��� o,e,a,i,o�̴�.
	// �̰͵� �� ���� ����� ���̰� 2�̴�.
	// ���ĺ� ����(������ ���� ���)�� �ְ� ������ ���� �ҹ��� ���ڿ��� ��� ���� �� ���� ���� ���ڿ��� ���̸� ��ȯ�Ͻʽÿ�.
	// ������ a, e, i, o, u
	public static void main(String[] args) {
		getVowelsLong("suoidea");
	}
	
	public static int getVowelsLong(String inputString) {
		int returnValue = 0;
		
		String[] inputArray = inputString.split("");
		List<String> vowlesList = getVowelsList();
		
		int cnt = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(i+cnt < inputArray.length) {
				while(vowlesList.contains(inputArray[i+cnt])) {
					if(i+cnt == inputArray.length -1) break;
					else cnt++;
				}
				if(vowlesList.contains(inputArray[i+cnt]) && cnt > 0) cnt = cnt + 1;
				if(returnValue < cnt) returnValue = cnt;
				cnt = 0;
			}
		}
		return returnValue;
	}
	
	public static List<String> getVowelsList(){
		List<String> vowlesList = new ArrayList();
		
		vowlesList.add("a");
		vowlesList.add("e");
		vowlesList.add("i");
		vowlesList.add("o");
		vowlesList.add("u");
		
		return vowlesList;
	}
}
