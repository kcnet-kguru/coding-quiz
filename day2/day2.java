package quiz;

import java.util.Scanner;

public class day2 {
	public static void main(String[] args) {
		/*
		���۹�ȣ�� ����ȣ�� �μ��� �޾� ���۹�ȣ ���� ����ȣ���� ���� �߿��� 5 �� ���Ե� ���� �� ������ ���� ������ ��ȯ�ϴ� �Լ��� �ۼ��ϼ���.
		���� ��ȣ�� �׻� �� ��ȣ���� �۽��ϴ�. �� ���� ��� ���� �� ���� �ֽ��ϴ�!

		Test Case
		1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
		4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12 
		-5,-10 -> -10, -8, -7, -6 -> 4
		*/
		
		int start = 0;
		int end = 0;
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է� : ");
		start = scan.nextInt();
		end = scan.nextInt();
		
		if(start > end) {
			int tmp = 0;
			tmp = start;
			start = end;
			end = tmp;
		}
		
		for(int i=start; i<=end; i++) {
			if(Math.abs(i)%10 != 5) {
				cnt++;
			}
		}
		System.out.println("Result " + cnt);
	}
}
