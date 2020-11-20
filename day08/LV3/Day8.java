import java.util.ArrayList;
import java.util.List;

public class Day8{
	public static String humanReadable(int sec) {
		int arr[] = new int[3];
		
		int tmp=sec; 
		for (int i=0;i<3;i++) {
			if (i <2) {
				arr[i]=tmp % 60;
				tmp=tmp/60;
			}
			else {
				arr[i]=tmp;
			}
			
		}
		
		String second = Integer.toString(arr[0]);
		String minute = Integer.toString(arr[1]);
		String hour = Integer.toString(arr[2]);
		
	
		if (second.length()==1) {
			second="0"+second;
		}
		
		if (minute.length()==1) {
			minute="0"+minute;
		}
		
		if (hour.length()==1) {
			hour="0"+hour;
		}
		
		return hour+":"+minute+":"+second;
	}


}
