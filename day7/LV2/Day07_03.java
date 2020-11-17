package Day07.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day07_03 {
	// Count the number of Duplicates
	// 입력 문자열에서 두 번 이상 나타나는 고유 한 대소 문자를 구분하지 않는 알파벳 문자와 숫자의 개수를 반환하는 함수를 작성합니다. 입력 문자열은 알파벳 (대문자와 소문자 모두)과 숫자 만 포함한다고 가정 할 수 있습니다.
	public static void main(String args[]) {
		duplicateCnt("abcde");
		duplicateCnt("aabbcde");
		duplicateCnt("aabBcde");
		duplicateCnt("indivisibility");
		duplicateCnt("Indivisibilities");
		duplicateCnt("aA11");
		duplicateCnt("ABBA");
	}
	
	public static int duplicateCnt(String word) {
		int cnt = 0;
		
		String[] wordList = word.toUpperCase().split("");
		HashMap<String,Integer> sortMap = sortingMap(wordList);
		List<String> keyList = new ArrayList<>(sortMap.keySet());
		
		for(int i=0; i<sortMap.size(); i++) {
			if(sortMap.get(keyList.get(i)) > 1) cnt++;
		}
		
		System.out.println(cnt);
		return cnt;
	}
	
	public static HashMap<String,Integer> sortingMap(String wordList[]){
		HashMap<String,Integer> sortMap =new HashMap<String,Integer>();
		
		for(int i=0;i<wordList.length;i++) {
			if(sortMap.containsKey(wordList[i])) {
				sortMap.put(wordList[i], sortMap.get(wordList[i]) + 1);
			}else {
				sortMap.put(wordList[i], 1);
			}
		}
		
		return sortMap;
	}
}
