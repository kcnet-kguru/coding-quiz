package Day01.project;

import java.util.Scanner;

public class Day01_01 {
	// 1���� n������ ���ڸ� �޾Ƽ� ������ ���� �����ٿ� d�� ���� ����
	public static void main(String[] args) {
		nbDig(25,1);
		nbDig(5750, 0);
		nbDig(11011, 2);
		nbDig(12224, 8);
	}
	
	public static int nbDig(int n, int d) {
		int cnt=0;
		
		int[] doublearray = new int[n];
		
		for(int i=1; i<=n; i++) {
			doublearray[i-1] = i*i;
		}
		
		for(int i=0; i<n; i++) {
			String tempValue = Integer.toString(doublearray[i]);
			for(int j=0; j<tempValue.length(); j++) {
				if(tempValue.charAt(j) == Integer.toString(d).toCharArray()[0]) cnt ++;
			}
		}
		
		System.out.println(cnt);
		
		return cnt;
	}
}
