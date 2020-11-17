
public class Day6 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int[] arr2 = { 6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200 };

		missingValues(arr);
		missingValues(arr2);
	}

	// 함수 시작
	public static void missingValues(int[] a) {
		int[] arr = a;
		int temp = 0;

		int x = 0;
		int y = 0;

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (temp == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				y = temp;
			} else if (count == 1) {
				x = temp;
			}
		}
		result = x * x * y;
		System.out.println("결과 :" + result);
	}
}
