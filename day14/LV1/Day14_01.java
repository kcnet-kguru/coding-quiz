package Day14.project;

public class Day14_01 {
	// 우리는 0부터 시작해서 정해진 숫자까지 시리즈를 계산하는 함수를 생성하고자 한다.
	public static String serize(int inputNum) {
		int sum = 0;
		String returnValue = "";
		
		if(inputNum > 0) {
			for(int i=0; i<=inputNum; i++) {
				sum = i + sum;
				if(i == inputNum) {
					returnValue = returnValue + i + "=" + sum;
				}else {
					returnValue = returnValue + i + "+";
				}
			}
		}else if(inputNum < 0) {
			returnValue = inputNum + "<0";
		}else {
			returnValue=inputNum + "=0";
		}
		
		return returnValue;
	}
}
