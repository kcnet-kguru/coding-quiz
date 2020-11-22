package Day10.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Day10_03 {
	// �� ���ڿ� s1�� s2�� �־����� �� ���ڿ��� �󸶳� �ٸ��� �ð�ȭ�Ϸ��� �մϴ�. �ҹ��� (a ~ z) �� ����մϴ�. ���� s1�� s2���ִ� �� �ҹ����� �󵵸� ���� ���ڽ��ϴ�.
	// ���� s1�� s2�� 'a'�� ���� �ִ� ���� s1�� 4�Դϴ�. 'b'�� �ִ� ���� s2���� 3�Դϴ�. ���������� �ִ� �߻� Ƚ���� 1���� �۰ų� ���� ��� ���ڸ� ������� �ʽ��ϴ�.
	// ���� ���ڿ����� s1�� s2�� ���̸� �ٽ� ������ �� �ֽ��ϴ�. "1 : aaaa / 2 : bbb" ���⼭ 1 : aaaa�� 1�� a�� �ִ� ���� 4�̹Ƿ� ���ڿ� s1 �� aaaa�� ��Ÿ���ϴ�. ���� ������� 2 : bbb�� b�� �ִ� ���� 3�̹Ƿ� ���ڿ� s2 �� bbb�� ��Ÿ���ϴ�.
	// �۾��� �� �ִ� ���� 1���� ũ�� s1 �Ǵ� s2�� �� �ҹ��ڰ� �ִ� ����ŭ ���� �� ��Ÿ���� ���ڿ��� �����ϴ� ���Դϴ�. �� ���ڴ� �ִ� �� �� :�� �Բ� ��Ÿ���� ���ڿ� ��ȣ�� ���λ�� �ٽ��ϴ�. �ִ� ���� s1�� s2���ִ� ��� ���λ�� = :�Դϴ�.
	// ��������� ���� ���ڿ� (ex. 2 : nnnnn �Ǵ� 1 : hhh , ���λ� ����)�� ������ ���������̵ǰ� ���� ���� ���� (���� �� ����-������)�� ���� �� ���̰� ���� �� �ڵ� ����Ʈ���� ��Ȯ�ϰ� ���� ��. �ٸ� �׷��� '/'�� ���е˴ϴ�.
	public static void main(String[] args) {
		mix("my&friend&Paul has heavy hats! &","my friend John has many many friends &");
		mix("mmmmm m nnnnn y&friend&Paul has heavy hats! &","my frie n d Joh n has ma n y ma n y frie n ds n&");
		mix("Are the kids at home? aaaaa fffff","Yes they are here! aaaaa fffff");
		mix("Are they here","yes, they are here");
		mix("looping is fun but dangerous","less dangerous than coding");
		mix("In many languages","there's a pair of functions");
	}
	
	public static String mix(String s1, String s2) {
		String returnValue = "";
		
		HashMap<String,Integer> s1Map =  sortingMap(StringReplace(s1).split(""));
		HashMap<String,Integer> s2Map =  sortingMap(StringReplace(s2).split(""));
		
		ArrayList<String> s1Array = returnSortList(1,s1Map);
		ArrayList<String> s2Array = returnSortList(2,s2Map);
		ArrayList<String> sumArray = new ArrayList<String>();
		
		sumArray.addAll(s1Array);
		sumArray.addAll(s2Array);
		sumArray.sort(Collections.reverseOrder());
		
		String tempStr="";
		for(int i=0; i<sumArray.size(); i++) {	
			String str = (sumArray.get(i)).split(":")[1];
			if(!returnValue.contains(str) || tempStr.contains(sumArray.get(i).split(":")[0] + ":" +sumArray.get(i).split(":")[1])){
				if(Integer.parseInt(sumArray.get(i).split(":")[0]) > 1) {
					String alpha = "";
					if(tempStr.contains(sumArray.get(i).split(":")[0] + ":" +sumArray.get(i).split(":")[1])) {
						for(int j=0; j<Integer.parseInt((sumArray.get(i)).split(":")[0]); j++) {
							alpha = alpha + (sumArray.get(i-1)).split(":")[1];
						}
						returnValue = returnValue.replace((sumArray.get(i-1).split(":")[2] + ":" + alpha), "=:" + alpha);
					}else {
						for(int j=0; j<Integer.parseInt((sumArray.get(i)).split(":")[0]); j++) {
							alpha = alpha + (sumArray.get(i)).split(":")[1];
						}
						returnValue = returnValue + (sumArray.get(i)).split(":")[2] + ":" + alpha + "/";
					}
				}
			}
			tempStr = tempStr + sumArray.get(i).split(":")[0] + ":" +sumArray.get(i).split(":")[1] + " ";
		}
		
		if("/".equals(returnValue.substring(returnValue.length()-1))) returnValue = returnValue.substring(0,returnValue.length()-1);
		
		System.out.println("returnValue : " + returnValue);
		return returnValue;
	}
	
	public static String StringReplace(String str){
        String etc = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        str=str.toLowerCase().replaceAll(" ", "").replaceAll(etc, "");
        return str;
	}
	
	public static HashMap<String,Integer> sortingMap(String arr[]){
		HashMap<String,Integer> sortMap =new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(sortMap.containsKey(arr[i])) sortMap.put(arr[i], sortMap.get(arr[i]) + 1);
			else sortMap.put(arr[i], 1);
		}
		
		return sortMap;
	}
	
	public static ArrayList<String> returnSortList(int num, HashMap<String,Integer> map){
		ArrayList<String> returnList= new ArrayList<String>();
		List<String> keyList = new ArrayList<>(map.keySet());
		
		for(int i=0; i<map.size(); i++) {
			returnList.add(map.get(keyList.get(i)) + ":" + keyList.get(i) + ":" + num);
		}
		return returnList;
	}
}
