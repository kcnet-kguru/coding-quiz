package kguru;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Quiz9 {
	/*
	 	다음과 같이 정의 된 시퀀스 u를 고려하십시오.:

		숫자 u (0) = 1은 u에서 첫 번째입니다.
		u의 각 x에 대해 y = 2 * x + 1 및 z = 3 * x + 1도 u에 있어야합니다.
		u에는 다른 숫자가 없습니다.
		Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]
	                1  1  3  4   3   4  7	9   10   7  13
		1은 3과 4를, 3은 7과 10을, 4는 9와 13을, 7은 15와 22를줍니다.
		
		Task:
		매개 변수 n이 주어지면 함수 dbl_linear (또는 dblLinear ...)는 
		정렬 된 (<) 시퀀스 u의 요소 u (n)을 반환합니다 (따라서 중복이 없음).
		
		Example:
		dbl_linear(10) should return 22
		
		Note:
		효율성에 주의하세요 
	*/
	public static void main(String[] args) {
		dbl_linear(10);		// 22
		dbl_linear(20);		// 57		
		dbl_linear(30);		// 91
		dbl_linear(50);		// 175
	}

	private static void dbl_linear(int aa) {
		int x = 1;
		int i = 0;
		List list = new ArrayList();
		list.add(x);

		while (i < aa) {
			x = (int) list.get(i);
			list.add(2 * x + 1);
			list.add(3 * x + 1);
			i++;
		}
		Collections.sort(list);

		System.out.println(list);
		int bb = aa + (aa / 10) - 1;
		System.out.println(list.get(bb));
	}
}
































