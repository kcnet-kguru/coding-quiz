package Day10.project;

public class Day10_01 {
	// ATM ���� 4 �ڸ� �Ǵ� 6 �ڸ� PIN �ڵ带 ����ϸ� PIN �ڵ�� ��Ȯ�� 4 �ڸ� �Ǵ� ��Ȯ�� 6 �ڸ��� ���� �� �� �����ϴ�.
	// �Լ��� ��ȿ�� PIN ���ڿ��� ���޵Ǹ� true�� ��ȯ�ϰ� �׷��� ������ false�� ��ȯ�մϴ�.
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
