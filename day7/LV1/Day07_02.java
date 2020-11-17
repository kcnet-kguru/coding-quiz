package Day07.project;

import java.util.List;

public class Day07_02 {
	// 인수로 단어를 받아 홀수의 경우 단어의 중간 글자를 반환하고, 짝수의 경우 중간의 2글자를 반환하는 함수를 작성하세요
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
