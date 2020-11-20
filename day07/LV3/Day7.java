import java.util.ArrayList;
import java.util.List;

public class Day7{
	public static int[] sum_pairs(int[] arr, int sum) {
		List<int[]> list = new ArrayList<int[]>();
		List<int[]> answerArr = new ArrayList<int[]>();
		int min = arr.length;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++ ) {
				
				if (arr[i]+arr[j] == sum) {
					list.add(new int[] {i,j,Math.abs(i-j)});
					if (Math.abs(i-j) < min) {
						min=Math.abs(i-j);
					}
				}
			}
		}
		
		for (int[] tmp : list ) {
			if (tmp[2] == min) {
				answerArr.add(new int[] {tmp[0],tmp[1]});
			}
		}
		
		if (answerArr.size() > 0) { //정답이 존재할 때
			int[] rslt = answerArr.get(0);
			return new int[] {arr[rslt[0]],arr[rslt[1]]};
		} else { //정답이 존재하지 않을 때
			return new int[] {};
		}
		
		
	}
}
