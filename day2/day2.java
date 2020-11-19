package quiz;

import java.util.Scanner;

public class day2 {
	public static void main(String[] args) {
		/*
		시작번호와 끝번호를 인수로 받아 시작번호 부터 끝번호까지 숫자 중에서 5 가 포함된 수를 뺀 나머지 수의 갯수를 반환하는 함수를 작성하세요.
		시작 번호는 항상 끝 번호보다 작습니다. 두 숫자 모두 음수 일 수도 있습니다!

		Test Case
		1,9 -> 1,2,3,4,6,7,8,9 -> Result 8
		4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> Result 12 
		-5,-10 -> -10, -8, -7, -6 -> 4
		*/
		
		int start = 0;
		int end = 0;
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력 : ");
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
