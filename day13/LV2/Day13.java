import java.util.ArrayList;
import java.util.List;

public class Day13{

	public static int[] foldArray(int[] arr, int foldCount) {
		int count=0;		
		List<Integer> foldTempList = new ArrayList<Integer>();
		
		while (count < foldCount) {
			if (count == 0 ) {
				foldTempList=getFoldArray(arr);				
			} else {
				int tmpArr[] = makeArray(foldTempList);
				foldTempList.clear();
				foldTempList = getFoldArray(tmpArr);
			}
			count++;
		}
		int resultArr[] = new int[foldTempList.size()];
		
		for (int i = 0 ; i < foldTempList.size() ; i++) {
			resultArr[i] = foldTempList.get(i);
		}
		return resultArr;
	}
	public static List<Integer> getFoldArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int count=0;
		List<Integer> result = new ArrayList<Integer>();
		while (start <= end) {
			if (start != end) {
				result.add(arr[start]+arr[end]);
				start++;
				end--;
				count++;
			} else {
				result.add(arr[start]);
				start++;
				end--;
				count++;
			}
			
		}
		return result;	
	}
	public static int[] makeArray(List<Integer> list) {
		int arr[] = new int[list.size()];
		
		for (int i = 0 ; i < list.size() ; i++) {
			arr[i]=list.get(i);
		}
		
		
		return arr;
		
	}
	

}
