package Day02.project;

import java.util.Scanner;

public class Day02_01 {
	//���۹�ȣ�� ����ȣ�� �μ��� �޾� ���۹�ȣ ���� ����ȣ���� ���� �߿��� 5 �� ���Ե� ���� �� ������ ���� ������ ��ȯ�ϴ� �Լ��� �ۼ��ϼ���.
	//���� ��ȣ�� �׻� �� ��ȣ���� �۽��ϴ�. �� ���� ��� ���� �� ���� �ֽ��ϴ�!
	
	public static void main(String[] args) {
		returnValue(1,9);
		returnValue(4,17);
	}
	
	public static int returnValue(int start, int end) {
		int cnt = 0;
		
		for(int i = start; i <= end; i++) {
			if(!(Integer.toString(i).contains("5"))) {cnt++;}
		}
		
		System.out.println(cnt);
		
		return cnt;
	}
}
