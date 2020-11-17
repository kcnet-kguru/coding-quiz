package Day07.project;

import java.util.List;

public class Day07_01 {
	// 정수를 인수(파라미터)로 사용하고 짝수 인 경우 "Even"을 반환하고 홀수 인 경우 "Odd"를 반환하는 함수를 만드세요
	public static void main(String args[]) {
		returnValue(3);
		returnValue(8);
	}
	
	public static String returnValue(int num) {
		String returnValue = "Even";
		if(num%2!=0) returnValue = "Odd";
		System.out.println(returnValue);
		return returnValue;
	}
}
