import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day9{

	public static int dbl_linear(int n) {	
		List<Integer> tmp = new ArrayList<Integer>();
		int idx=1;
		int cnt=0;
		tmp.add(idx);
		while (cnt < n) {
			int num = tmp.get(cnt);
			int y = 2 * num + 1;
			int z = 3 * num + 1;
			
			if (checkNum(y,tmp)) {
				tmp.add(y);
			}
			
			if (checkNum(z,tmp)) {
				tmp.add(z);
			}
			Collections.sort(tmp);
			cnt++;
		}
		return tmp.get(n);
	}
	public static boolean checkNum(int num,List<Integer> tmp) {
		for (int i = 0 ;i < tmp.size(); i++) {
			if (tmp.get(i)==num) {
				return false;
			}
		}
		return true;
	}

}
