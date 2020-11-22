package kguru;

import java.util.ArrayList;
import java.util.List;

public class Quiz7 {
	/*Sum of Pairs
	정수 목록과 단일 합계 값이 주어지면 처음 두 값 (왼쪽에서 구문 분석)을 더하여 s를 형성하는 순서대로 반환합니다.

	sum_pairs([11, 3, 7, 5],         10)
	#              ^--^      3 + 7 = 10
	== [3, 7]

	sum_pairs([4, 3, 2, 3, 4],         6)
	#          ^-----^         4 + 2 = 6, indices: 0, 2 *
	#             ^-----^      3 + 3 = 6, indices: 1, 3
	#                ^-----^   2 + 4 = 6, indices: 2, 4
	#  * entire pair is earlier, and therefore is the correct answer
	== [4, 2]

	sum_pairs([0, 0, -2, 3], 2)
	#  there are no pairs of values that can be added to produce 2.
	== None/nil/undefined (Based on the language)

	sum_pairs([10, 5, 2, 3, 7, 5],         10)
	#              ^-----------^   5 + 5 = 10, indices: 1, 5
	#                    ^--^      3 + 7 = 10, indices: 3, 4 *
	#  * entire pair is earlier, and therefore is the correct answer
	== [3, 7]


	음수와 중복 번호가 나타날 수 있습니다.
*/
	public static void main(String[] args) {
		int[] arr1 = {11, 3, 7, 5};
		int[] arr2 = {4, 3, 2, 3, 4};
		int[] arr3 = {0, 0, -2, 3};
		int[] arr4 = {10, 5, 2, 3, 7, 5};
		
		int r1 = 10;
		int r2 = 6;
		int r3 = 2;
		int r4 = 10;
		
		sum_pairs(arr1, r1);
		sum_pairs(arr2, r2);
		sum_pairs(arr3, r3);
		sum_pairs(arr4, r4);
	}

	private static void sum_pairs(int[] arr, int r) {
		List list = new ArrayList();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == r && !list.contains(arr[i]) && !list.contains(arr[j]) && arr[i] != arr[j]) {
					list.add(arr[i]);
					list.add(arr[j]);
				}
			}
		}
		if (list.size() == 0) {
			list.add("없음");
		}
		System.out.println(list);
	}
	
}


















