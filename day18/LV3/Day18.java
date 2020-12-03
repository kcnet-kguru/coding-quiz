import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day18{
	public static int[] decompose(int data) {
		boolean[] isChecked = new boolean[data];
		int firstPow = (int)Math.pow(data, 2);
		List<Integer> result = new ArrayList<Integer>();
		result = getResult(data-1, isChecked ,firstPow, result);
		if (result.size() == 0 ) {
			return null;
		}
		int resultArr[] = new int[result.size()];
		
		
		for (int i = 0 ; i < resultArr.length ; i++) {
			resultArr[i] = result.get(i);
		}
		
		Arrays.sort(resultArr);
		return resultArr;
	}
	public static List<Integer> getResult(int data , boolean[] isChecked, int compareNum , List<Integer> result) {
	
		if (compareNum == 0) {
			for (int i = 0 ; i < isChecked.length ; i++) {
				if (isChecked[i]) {
					result.add(i);
				}
			}
			return result;
		}
	
		
		for (int i = data ; i > 0 ; i --) {
			
			if (!result.isEmpty()) {
				return result;
			}
			
			int powNum = (int)Math.pow(i, 2);
			if (!isChecked[i] && powNum <= compareNum) {
				isChecked[i]=true;
				result = getResult(i-1, isChecked, compareNum - powNum, result);
				isChecked[i]=false;
			}
			
		}
		return result;
	}
	

}
