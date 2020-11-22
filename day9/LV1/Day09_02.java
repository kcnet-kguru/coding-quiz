package Day09.project;

public class Day09_02 {
	//숫자 n이 두 숫자 x와 y로 나눌 수 있는지 확인하는 함수를 만듭니다. 모든 입력은 0이 아닌 양수입니다.
	public static void main(String[] args) {
		isAvailability(3,1,3);
		isAvailability(12,2,6);
		isAvailability(100,5,3);
		isAvailability(12,7,5);
	}
	
	public static boolean isAvailability(int num, int one, int two) {
		boolean isAvailability = false;
		
		if(num%one==0 && num%two==0) isAvailability = true;
		
		System.out.println(isAvailability);
		return isAvailability;
	}
}
