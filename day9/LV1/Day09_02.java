package Day09.project;

public class Day09_02 {
	//���� n�� �� ���� x�� y�� ���� �� �ִ��� Ȯ���ϴ� �Լ��� ����ϴ�. ��� �Է��� 0�� �ƴ� ����Դϴ�.
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
