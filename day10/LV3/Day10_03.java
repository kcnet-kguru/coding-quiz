package Day10.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Day10_03 {
	// 두 문자열 s1과 s2가 주어지면 두 문자열이 얼마나 다른지 시각화하려고 합니다. 소문자 (a ~ z) 만 고려합니다. 먼저 s1과 s2에있는 각 소문자의 빈도를 세어 보겠습니다.
	// 따라서 s1과 s2의 'a'에 대한 최대 값은 s1의 4입니다. 'b'의 최대 값은 s2에서 3입니다. 다음에서는 최대 발생 횟수가 1보다 작거나 같은 경우 문자를 고려하지 않습니다.
	// 다음 문자열에서 s1과 s2의 차이를 다시 시작할 수 있습니다. "1 : aaaa / 2 : bbb" 여기서 1 : aaaa의 1은 a의 최대 값이 4이므로 문자열 s1 및 aaaa를 나타냅니다. 같은 방식으로 2 : bbb는 b의 최대 값이 3이므로 문자열 s2 및 bbb를 나타냅니다.
	// 작업은 이 최대 값이 1보다 크면 s1 또는 s2의 각 소문자가 최대 값만큼 여러 번 나타나는 문자열을 생성하는 것입니다. 이 문자는 최대 값 및 :와 함께 나타나는 문자열 번호가 접두사로 붙습니다. 최대 값이 s1과 s2에있는 경우 접두사는 = :입니다.
	// 결과적으로 하위 문자열 (ex. 2 : nnnnn 또는 1 : hhh , 접두사 포함)은 길이의 내림차순이되고 사전 사전 순서 (문자 및 숫자-더보기)로 정렬 된 길이가 같을 때 코드 포인트별로 정확하게 정렬 됨. 다른 그룹은 '/'로 구분됩니다.
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
