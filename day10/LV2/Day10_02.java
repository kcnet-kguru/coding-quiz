package Day10.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day10_02 {
	// 입력 문자열이 제공됩니다. 문자열의 각 기호가 첫 번째 문자 인 경우 '1'로 바꾸고, 그렇지 않으면 이미 본 횟수로 바꾸십시오.
	// 코드의 성능에 유의해서 작성하세요.
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
