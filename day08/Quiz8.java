package kguru;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quiz8 {
	/*
	 	음이 아닌 정수 (초)를 입력으로 사용하고 사람이 읽을 수있는 형식 (HH : MM : SS)으로 시간을 반환하는 함수를 작성합니다.

		HH = hours, padded to 2 digits, range: 00 - 99
		MM = minutes, padded to 2 digits, range: 00 - 59
		SS = seconds, padded to 2 digits, range: 00 - 59
		최대 시간은 359999 (99:59:59) 를 초과하지 않습니다.
		
		You can find some examples in the test fixtures.
		humanReadable(seconds)
		
		Test
		humanReadable(0) => '00:00:00'
		humanReadable(5) => '00:00:05'
		humanReadable(60) => '00:01:00'
		humanReadable(86399) => '23:59:59'
		humanReadable(359999) => '99:59:59'  
	*/
	public static void main(String[] args) {
		humanReadable(0);
		humanReadable(5);
		humanReadable(60);
		humanReadable(86399);
		humanReadable(359999);
	}

	private static void humanReadable(int sec) {
		
		int h = sec/(60*60);
		int m = (sec%(60*60))/60;
		int s = (sec%(60*60))%60;
		
		String hh = Integer.toString(h);
		String mm = Integer.toString(m);
		String ss = Integer.toString(s);
		
		if (h < 10) {
			hh = "0" + hh;
		}
		if (m < 10) {
			mm = "0" + mm;
		}
		if (s < 10) {
			ss = "0" + ss;
		}
		System.out.println("humanReadable("+ sec + ")' => " + hh + ":" + mm + ":" + ss + "'");

	}

	

}
