import java.util.LinkedList;
import java.util.Queue;

public class Day14{

	public static int queue_time(int[] customer, int till) {
		int count=0;
		Queue<Integer> que = new LinkedList<Integer>();
		int[] counter = new int[till];
		
		for (int i = 0 ; i < counter.length ; i++) {
			counter[i] = 0;
		}
		
		for (int i = 0 ; i < customer.length ; i++) {
			que.add(customer[i]);
		}
		
		int firstCustomer = que.poll();
		counter[0] = firstCustomer;
		
		while (!que.isEmpty() || !isEndCheck(counter)) {
			int availableCounterNumber = getCounterNumber(counter);
			if (availableCounterNumber > -1 && !que.isEmpty()) {
				int nextCustomer = que.poll();
				counter[availableCounterNumber] = nextCustomer;
			}
		
			counter = decreaseTime(counter);
			count++;
		}
		return count;
	}
	
	public static boolean isEndCheck(int[] counter) {
		int check = 0;
		for (int i = 0; i < counter.length ; i++) {
			if (counter[i] > 0) {
				check++;
			}
		}
		if (check > 0 ) {
			return false;
		}
		else {
			return true;
		}
	}
	public static int getCounterNumber(int[] counter) {
		for (int i = 0; i < counter.length ; i++) {
			if (counter[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int[] decreaseTime(int[] counter) {
		int[] temp = counter;
		
		for (int i = 0; i < temp.length ; i++) {
			if (temp[i] > 0) {
				temp[i]--;
			}
		}
		return temp;
	}

}
