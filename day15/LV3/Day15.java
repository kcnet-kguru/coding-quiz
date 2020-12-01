public class Day15{

	public static int bestSum(int maximum, int count, int[] arr) {
		boolean sumStatus[] = new boolean[arr.length];
		int[] saveArr = new int[arr.length]; 
		int currentSum=-1;
		if (count > arr.length) {
			return -1;
		}
		return sumDistance(arr,sumStatus,maximum,count,0,saveArr,currentSum);
	}
	public static int sumDistance(int arr[],boolean[] sumStatus, int maximum, int count, int depth,int[] saveArr, int currentSum) {
		int temp=0;
		if (depth == count) {
			int result=0;
			for (int i = 0; i < count ; i++) {
				result += saveArr[i];
			}
			
			if (maximum >= result) {
				return Integer.max(result, currentSum);				
			} else {
				return currentSum;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (sumStatus[i]==false) {
				sumStatus[i]=true;
				saveArr[depth]=arr[i];
				currentSum = sumDistance(arr,sumStatus,maximum,count,depth+1,saveArr,currentSum);
				saveArr[depth]=0;
				sumStatus[i]=false;
			}
		}
		return currentSum;
	}
	

}
