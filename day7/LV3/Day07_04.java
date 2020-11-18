package Day07.project;

import java.util.List;

public class Day07_04 {
	// Sum of Pairs
	// 정수 목록과 단일 합계 값이 주어지면 처음 두 값 (왼쪽에서 구문 분석)을 더하여 s를 형성하는 순서대로 반환합니다.
	public static void main(String args[]) {
		int arr1[] = {11, 3, 7, 5};
		sum_pairs(arr1,10);
		System.out.println();
		
		int arr2[] = {4, 3, 2, 3, 4};
		sum_pairs(arr2,6);
		System.out.println();
		
		int arr3[] = {0, 0, -2, 3};
		sum_pairs(arr3,2);
		System.out.println();
		
		int arr4[] = {10, 5, 2, 3, 7, 5};
		sum_pairs(arr4,10);
	}
	
	public static int[] sum_pairs(int[] arr, int sum) {
		int[] returnArray = new int[2];
		boolean isFirst = true;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((sum == arr[i] + arr[j]) && isFirst && (arr[i] != arr[j])) {
					returnArray[0] = arr[i];
					returnArray[1] = arr[j];
					isFirst = false;
				}
			}
		}
		
		for(int i=0; i<returnArray.length;i++) System.out.print(returnArray[i] + " ");
		return returnArray;
	}
}
