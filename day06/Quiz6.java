package kguru;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quiz6 {
	/*
		 	한 번만 나타나는 요소 (x라고합시다)와 두 번만 나타나는 요소 (y라고합시다)를 제외하고 
		 	모든 요소가 세 번 나타나는 양의 정수 배열이 제공됩니다.
			당신의 임무는 x * x * y를 찾는 것입니다.
			
			Example
			For arr=[1, 1, 1, 2, 2, 3], the result should be 18
			3 x 3 x 2 = 18
			
			For arr=[6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200], the result should be 4000000
			200 x 200 x 100 = 4000000
			
			missingValues(arr) { }
	*/
	public static void main(String[] args) {
		int[] arr1 = {1, 1, 1, 2, 2, 3};
		int[] arr2 = {6, 5, 4, 100, 6, 5, 4, 100, 6, 5, 4, 200};
		missingValues(arr1);
		missingValues(arr2);
		
	}

	private static void missingValues(int[] arr) {
		int x = 0;
		int y = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}else {
				map.put(arr[i], 1);
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (map.get(arr[j]) == 1) {
				 x = arr[j];
			}else if (map.get(arr[j]) == 2) {
				y = arr[j];
			}
		}
		
		int z = x * x * y;
		System.out.println("For arr = " + Arrays.toString(arr) + ", the result should be " + z);
		System.out.println(x + " * " + x + " * " + y + " = "+ z);
		
	}
}
