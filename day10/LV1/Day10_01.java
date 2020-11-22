package Day10.project;

public class Day10_01 {
	// ATM 기계는 4 자리 또는 6 자리 PIN 코드를 허용하며 PIN 코드는 정확히 4 자리 또는 정확히 6 자리를 포함 할 수 없습니다.
	// 함수에 유효한 PIN 문자열이 전달되면 true를 반환하고 그렇지 않으면 false를 반환합니다.
	public static void main(String[] args) {
		isAvailablePin("1234");
		isAvailablePin("12345");
		isAvailablePin("a234");
		isAvailablePin("0000");
		isAvailablePin("1111");
		isAvailablePin("123456");
		isAvailablePin("098765");
		isAvailablePin("000000");
		isAvailablePin("090909");
	}
	
	public static boolean isAvailablePin(String inputValue) {
		boolean returnValue = true;
		
		if(inputValue.length() == 4 || inputValue.length() == 6) {
			char check;
			for(int i=0; i<inputValue.length(); i++) {
				check = inputValue.charAt(i);
				if(check < 48 || check > 58) returnValue = false;
			}
		}else {
			returnValue = false;
		}
		
		System.out.println(returnValue);
		return returnValue;
	}
}
