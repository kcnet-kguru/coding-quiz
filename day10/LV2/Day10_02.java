package Day10.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day10_02 {
	// �Է� ���ڿ��� �����˴ϴ�. ���ڿ��� �� ��ȣ�� ù ��° ���� �� ��� '1'�� �ٲٰ�, �׷��� ������ �̹� �� Ƚ���� �ٲٽʽÿ�.
	// �ڵ��� ���ɿ� �����ؼ� �ۼ��ϼ���.
	public static void main(String[] args) {
		change("Hello, World!");
		change("aaaaaaaaaaaa");
		change("Hello, World! It's me, JomoPipi!");
		change("hello hello");
	}
	
	public static String change(String sentence) {
		String returnValue = "";
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer,Integer> tempMap = new HashMap<Integer,Integer>();
		
		for(int i=0; i<sentence.length(); i++) {
			list.add((int) sentence.charAt(i));
		}
		
		for(int i=0; i<list.size(); i++) {
			if(tempMap.containsKey(list.get(i))) {
				tempMap.put(list.get(i), tempMap.get(list.get(i)) + 1);
				returnValue = returnValue + tempMap.get(list.get(i));
			}else {
				tempMap.put(list.get(i), 1);
				returnValue = returnValue + 1;
			}
		}
		
		System.out.println(returnValue);
		return returnValue;
	}
	
}
