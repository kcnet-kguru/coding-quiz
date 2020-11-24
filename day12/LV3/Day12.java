public class Day12{

	public static String orderWeight(String str) {
		String[] splitStr = str.split(" ");
		String orderedWeightResult="";
		for (int i = 0 ; i < splitStr.length ; i++) {
			int sum = 0;
			
			for (int j = 0 ; j < splitStr.length ; j++) {
				sum=getSplitStrSum(splitStr[i]);
				int compareSum = getSplitStrSum(splitStr[j]);
				if (sum < compareSum) {
					splitStr = swapSplitStrArray(splitStr,i,j);
				} else if (sum == compareSum) {
					
					if (splitStr[i].compareTo(splitStr[j])<0) {
						swapSplitStrArray(splitStr,i,j);
					}
				}
			}
		}
		
		for (int i = 0 ; i < splitStr.length ; i++) {
			if (i < splitStr.length -1) {
				orderedWeightResult += splitStr[i]+" ";
			} else {
				orderedWeightResult += splitStr[i];
			}
		}
		return orderedWeightResult;
	}

	private static int getSplitStrSum(String str) {
		int sum=0;
		for (int i = 0 ; i < str.length() ; i++) {
			sum += Integer.parseInt(str.charAt(i)+"");
		}
		return sum;
	}
	private static String[] swapSplitStrArray(String[] arr, int i, int j) {
		String temp=arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	

}
