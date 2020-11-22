package Day09.project;

public class Day09_01 {
	// 주어진 문자열 src를 정확히 카운트 횟수 반복하는 repeat_str이라는 함수를 작성하십시오.
	public static void main(String[] args) {
		repeatStr(6, "I");
		repeatStr(5, "Hello");
	}
	
	public static String repeatStr(int cnt, String word) {
		String returnValue = "";
		
		for(int i=0; i<cnt; i++) {
			returnValue = returnValue + word;
		}
		
		System.out.println(returnValue);
		return returnValue;
	}
}
