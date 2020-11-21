package Day08.project;

import java.util.List;

public class Day08_01 {
	//입력 된 세 문자열의 모든 문자를 그룹으로 결합하는 문자열을 반환하는 함수를 만듭니다. 모든 입력의 첫 글자를 가져 와서 서로 그룹화합니다. 
	//모든 편지에 대해이 작업을 수행하십시오.
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
