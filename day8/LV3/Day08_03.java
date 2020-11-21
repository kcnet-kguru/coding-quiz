package Day08.project;

public class Day08_03 {
	// 음이 아닌 정수 (초)를 입력으로 사용하고 사람이 읽을 수있는 형식 (HH : MM : SS)으로 시간을 반환하는 함수를 작성합니다.
	public static void main(String[] args) {
		humanReadable(0);
		humanReadable(5);
		humanReadable(60);
		humanReadable(86399);
		humanReadable(359999);
	}
	
	public static String humanReadable(int ss) {
		String humanReadable = "";
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		if(ss > 59) {
			minute = ss / 60;
			second = ss - (minute * 60);
			if(minute > 59) {
				hour = minute / 60;
				minute = minute - (hour * 60);
			}
		}else {
			second = ss;
		}
		
		if(hour < 10) humanReadable = humanReadable + "0" + hour + ":";
		else humanReadable = humanReadable + hour + ":";
		
		if(minute < 10) humanReadable = humanReadable + "0" + minute + ":";
		else humanReadable = humanReadable + minute + ":";
		
		if(second < 10) humanReadable = humanReadable + "0" + second;
		else humanReadable = humanReadable + second;
		
		System.out.println(humanReadable);
		
		return humanReadable;
	}
}
