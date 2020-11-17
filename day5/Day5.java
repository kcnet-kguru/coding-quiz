/*
정수 배열이 주어질 것입니다.
당신의 임무는 그 배열을 가져 와서 N의 왼쪽에있는 정수의 합이
N의 오른쪽에있는 정수의 합과 같은 인덱스 N을 찾는 것입니다.
이런 일을 할 수있는 인덱스가 없다면,- 1을 반환합니다.
*/
public class Day5 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 3, 2, 1 };
		int[] b = { 20, 10, -80, 10, 10, 15, 35 };

		System.out.println("결과 : " + findIndex(a));
		System.out.println("결과 : " + findIndex(b));
	}

	public static int findIndex(int[] a) {
		int result = 0; // 리턴할 변수

		int left = 0; // 기준으로부터 왼쪽
		int right = 0; // 기즌으로부터 오른쪽

		int[] arr = a;

		for (int i = 0; i < arr.length; i++) {
			// 만약 0번째 인덱스일 경우에는 왼쪽의 합이 0 오른쪽의 합은 나머지 다 더한값이 0인지 확인
			// 만약 맞을경우 0 반환 없을경우 그 다음 로직 진행
			if (i == 0) {		// 0번째 인덱스일 경우
				left = 0;
				for (int j = 1; j < arr.length; j++) {
					right += a[j];
				}
				if (left == right) {
					result = 0;
					return result;
				} else {
					right = 0;
				}
			} else if (i == arr.length - 1) { // 마지막 인덱스일 경우
				right = 0;
				for (int n = 0; n < arr.length; n++) {
					left += a[n];
				}
				if (left == right) {
					result = 0;
					return result;
				} else {
					left = 0;
				}
			} else {
				// n을 기준으로 왼쪽
				for (int k = 0; k < i; k++) {
					left += a[k];
				}

				// n을 기준으로 오른쪽
				for (int b = i; b < arr.length; b++) {
					right += a[b];
				}
				right = right - a[i]; // n번째 값을 빼준다.

				if (left == right) {
					result = i;
					return result;
				} else {
					left = 0;
					right = 0;
					result = -1;
				}
			}
		}
		return result;

	}

}
