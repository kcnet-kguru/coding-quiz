package Day07.project;

import java.util.List;

public class Day07_01 {
	// ������ �μ�(�Ķ����)�� ����ϰ� ¦�� �� ��� "Even"�� ��ȯ�ϰ� Ȧ�� �� ��� "Odd"�� ��ȯ�ϴ� �Լ��� ���弼��
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
