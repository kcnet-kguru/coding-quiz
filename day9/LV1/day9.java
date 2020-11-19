package quiz;

public class day9 {
	public static void main(String[] args) {
		/*
		[quiz1]
		�־��� ���ڿ� src�� ��Ȯ�� ī��Ʈ Ƚ�� �ݺ��ϴ� repeat_str�̶�� �Լ��� �ۼ��Ͻʽÿ�.

		repeatStr(6, "I") // "IIIIII"
		repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"
		 */
		System.out.println("[quiz1]");
		repeatStr(6, "I");
		repeatStr(5, "Hello");		
		
		System.out.println("\n[quiz2]");
		/*
		���� n�� �� ���� x�� y�� ���� �� �ִ��� Ȯ���ϴ� �Լ��� ����ϴ�. ��� �Է��� 0�� �ƴ� ����Դϴ�.

		Examples:
		1) n =   3, x = 1, y = 3 =>  true because   3 is divisible by 1 and 3
		2) n =  12, x = 2, y = 6 =>  true because  12 is divisible by 2 and 6
		3) n = 100, x = 5, y = 3 => false because 100 is not divisible by 3
		4) n =  12, x = 7, y = 5 => false because  12 is neither divisible by 7 nor 5
		 */
		isdivisible(3, 1, 3);
		isdivisible(12, 2, 6);
		isdivisible(100, 5, 3);
		isdivisible(12, 7, 5);
	}
	
	public static void isdivisible(int n, int x, int y) {
		boolean bool = false;
		if(n%x != 0) {
			if(n%y != 0) {
				System.out.println(bool + " because " + n + " is neither divisible by " + x + " nor " + y);
			}else {
				System.out.println(bool + " because " + n + " is not divisible by " + x);				
			}
		}else {
			if(n%y != 0) {
				System.out.println(bool + " because " + n + " is not divisible by " + y);				
			}else {
				bool = true;
				System.out.println(bool + " because " + n + " is divisible by " + x + " and " + y);				
			}
		}
	}
	
	public static void repeatStr(int n, String str) {
		String tmp = "";
		
		for(int i=0; i<n; i++) {
			tmp += str;
		}
		
		System.out.println(tmp);
	}
}
