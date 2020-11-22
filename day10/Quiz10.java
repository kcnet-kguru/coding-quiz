package kguru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Quiz10 {
	/*
	 * 🚀 Level 2 🤔 문제 설명 입력 문자열이 제공됩니다. 문자열의 각 기호가 첫 번째 문자 인 경우 '1'로 바꾸고, 그렇지 않으면
	 * 이미 본 횟수로 바꾸십시오. 코드의 성능에 유의해서 작성하세요. Examples:
	 * 
	 * input = "Hello, World!" result = "1112111121311"
	 * 
	 * input = "aaaaaaaaaaaa" result = "123456789101112" 문자열에 ASCII가 아닌 문자가 있을 수
	 * 있습니다. 📌 Note: int 도메인 오버플로가 발생하지 않습니다 (문자 발생 수가 20 억 개 미만).
	 * 
	 * 🎯 TestCase "11121111213112111131224132411122",
	 * "Hello, World! It's me, JomoPipi!" "11121122342", "hello hello"
	 */
	public static void main(String[] args) {
		String input1 = "Hello, World!";
		String input2 = "aaaaaaaaaaaa";
		String input3 = "Hello, World! It's me, JomoPipi!";
		
		test(input1);
		test(input2);
		test(input3);
	}

	private static void test(String input) {
		List list = new ArrayList();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String ss = "";
		int qq = 1;
		for (int i = 0; i < input.length(); i++) {
			String str = Character.toString(input.charAt(i));
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
				System.out.print(map.get(str));
			} else {
				map.put(str, 1);
				System.out.print(map.get(str));
			}
		}
		System.out.println();
	}
}
