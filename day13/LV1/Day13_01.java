package Day13.project;

import java.util.ArrayList;
import java.util.List;

public class Day13_01 {
	// "codewarriors" 단어의 모음 문자열은 o,e,a,i,o이다.
	// 이것들 중 가장 긴것은 길이가 2이다.
	// 알파벳 문자(모음과 자음 모두)만 있고 공백이 없는 소문자 문자열의 경우 가장 긴 모음 하위 문자열의 길이를 반환하십시오.
	// 모음은 a, e, i, o, u
	public static void main(String[] args) {
		getVowelsLong("suoidea");
	}
	
	public static int getVowelsLong(String inputString) {
		int returnValue = 0;
		
		String[] inputArray = inputString.split("");
		List<String> vowlesList = getVowelsList();
		
		int cnt = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(i+cnt < inputArray.length) {
				while(vowlesList.contains(inputArray[i+cnt])) {
					if(i+cnt == inputArray.length -1) break;
					else cnt++;
				}
				if(vowlesList.contains(inputArray[i+cnt]) && cnt > 0) cnt = cnt + 1;
				if(returnValue < cnt) returnValue = cnt;
				cnt = 0;
			}
		}
		return returnValue;
	}
	
	public static List<String> getVowelsList(){
		List<String> vowlesList = new ArrayList();
		
		vowlesList.add("a");
		vowlesList.add("e");
		vowlesList.add("i");
		vowlesList.add("o");
		vowlesList.add("u");
		
		return vowlesList;
	}
}
