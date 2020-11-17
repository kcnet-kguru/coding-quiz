package Day07.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day07_03 {
	// Count the number of Duplicates
	// �Է� ���ڿ����� �� �� �̻� ��Ÿ���� ���� �� ��� ���ڸ� �������� �ʴ� ���ĺ� ���ڿ� ������ ������ ��ȯ�ϴ� �Լ��� �ۼ��մϴ�. �Է� ���ڿ��� ���ĺ� (�빮�ڿ� �ҹ��� ���)�� ���� �� �����Ѵٰ� ���� �� �� �ֽ��ϴ�.
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
