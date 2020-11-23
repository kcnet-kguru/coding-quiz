import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Day11{

	public static String[] removeNb(int num) {
		int targetNum=1;
		List<String> resultList = new ArrayList<String>();
		while (targetNum<=num) {
			
			for (int i = 1 ; i <= num ; i++) {
				int count = 0;
				for (int j = 1 ; j <= num ; j++) {
					
					if (j != i && j != targetNum && i != targetNum) {
						count+=j;
					}
				}
				if (count == targetNum * i) {
					resultList.add("("+ targetNum+"," + i + ")");
				}
			}
			targetNum++;
		}
		String[] resultArray = new String[resultList.size()]; 
		for (int i = 0 ; i < resultList.size(); i++) {
			resultArray[i]=resultList.get(i);
		}
		if (resultArray.length > 0 ){
			return resultArray;
		} else {
			return null;			
		}
		
	}

}
