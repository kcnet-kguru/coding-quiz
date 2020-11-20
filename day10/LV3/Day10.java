import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Day10{

	public static String mix(String s1, String s2) {
		HashSet<String> s1HashSet = new HashSet<String>();
		HashSet<String> s2HashSet = new HashSet<String>();
		HashSet<String> param = new HashSet<String>();
		List<String> saveList1  = new ArrayList<String>();
		List<String> saveList2  = new ArrayList<String>();
		List<String> paramLst  = new ArrayList<String>();
		
		String s1Trim = s1.replace(" " , "");
		String s2Trim = s2.replace(" " , "");
		
		s1HashSet=getStrList(s1Trim);
		s2HashSet=getStrList(s2Trim);
		
		saveList1.addAll(s1HashSet);
		saveList2.addAll(s2HashSet);
		
		param.addAll(saveList1);
		param.addAll(saveList2);
		paramLst.addAll(param);
		
 		int arr1[]=new int[paramLst.size()];
		int arr2[]=new int[paramLst.size()];
		
		arr1=countStr(paramLst,s1Trim);
		arr2=countStr(paramLst,s2Trim);
		
		String rslt=getResultStr(arr1,arr2,paramLst);

		
		return rslt;
	}
	
	private static String getResultStr(int[] arr1, int[] arr2, List<String> saveList1) {
		String result="";
		List<String> makeStr = new ArrayList<String>();
		for (int i = 0 ; i < saveList1.size() ; i++) {
			if (arr1[i] > 1 || arr2[i] > 1) {
				if (arr1[i] > arr2[i]) {
					makeStr.add("1:"+arr1[i]+""+saveList1.get(i)); //큰 쪽 + 개수 + 문자열
				} else if (arr1[i]<arr2[i]) {
					makeStr.add("2:"+arr2[i]+""+saveList1.get(i));	
				} else if (arr1[i] == arr2[i]) {
					makeStr.add("3:"+arr2[i]+""+saveList1.get(i));	
				}
			}
		}
		
		
		
		String[] strArr = new String[makeStr.size()];
		
		for (int i = 0; i < strArr.length ; i++) {
			strArr[i]=makeStr.get(i);
		}
		
		int startNum=strArr[0].charAt(2);
		
		String temp="";
		for (int i = 0; i < strArr.length; i++) { 
			for (int j = i+1; j < strArr.length ; j++) {
				if (strArr[i].charAt(2) < strArr[j].charAt(2)) {
					temp = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = temp;
				}
			}
		}
		
		while (startNum>=2) {
			
			temp = "";
			for (int i = 0; i < strArr.length; i++) { 
				for (int j = i+1; j < strArr.length ; j++) {
					if (strArr[i].charAt(0) >strArr[j].charAt(0) && strArr[i].charAt(2) == strArr[j].charAt(2)) { //개수같은 문자열(s1, s2, = ) 순 정렬 
						temp = strArr[i];
						strArr[i] = strArr[j];
						strArr[j] = temp;
					}
				}
			}
			
			for (int i = 0; i < strArr.length; i++) { 
				for (int j = i+1; j < strArr.length ; j++) { // 개수 같은 요소들 중 s1 에서 나온 것들, s2에서 나온것들 =인 것들의 문자열 사전 오름차순 정렬
					if (strArr[i].charAt(3) > strArr[j].charAt(3) && strArr[i].charAt(2) == strArr[j].charAt(2) && strArr[i].charAt(0)==strArr[j].charAt(0)) {
						temp = strArr[i];
						strArr[i] = strArr[j];
						strArr[j] = temp;
					}
				}
			}
			
			for (int i = 0; i < strArr.length; i++) { 
				for (int j = i+1; j < strArr.length ; j++) { // 개수가 같은 문자의 사전 오름차, s1 s2 = 순으로 정렬 
					if (strArr[i].charAt(3) > strArr[j].charAt(3) && strArr[i].charAt(2) == strArr[j].charAt(2) && strArr[i].charAt(0) > strArr[j].charAt(0)) {
						temp = strArr[i];
						strArr[i] = strArr[j];
						strArr[j] = temp;
					}
				}
			}
			
			
			if (startNum==2) { // = 를 마지막으로 보내기
				for (int i = 0; i < strArr.length; i++) { 
					for (int j = i+1; j < strArr.length ; j++) {
						if (strArr[i].charAt(0) > strArr[j].charAt(0) &&  strArr[i].charAt(2)=='2') {
							temp = strArr[i];
							strArr[i] = strArr[j];
							strArr[j] = temp;
						}
					}
				}
				
				
			}
			startNum -- ;
			
		}
		
		
		
		
		for (int i = 0; i < strArr.length ; i++) {
			result+=String.valueOf(strArr[i].charAt(0) == '3' ? '=' : strArr[i].charAt(0))+String.valueOf(strArr[i].charAt(1));
			for (int j = 0; j < Integer.parseInt(strArr[i].charAt(2)+"");j++) {
				result+=strArr[i].charAt(3);
			}
			if (i <strArr.length-1) {
				result+="/";
			}
			
		}
		
		return result;
	}

	public static HashSet<String> getStrList(String str) {
		HashSet<String> data = new HashSet<String>();
		
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp >=97 && temp <=122) {
				data.add(temp+"");
			}
		}
		
		return data;
	}
	
	public static int[] countStr(List<String> list, String str) {
		int rslt[]=new int[list.size()];
		
		for (int i=0;i<rslt.length;i++) {
			rslt[i]=0;
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0 ; j < str.length() ; j++) {
				if (list.get(i).equals(str.charAt(j)+"")) {
					rslt[i]++;
				}
			}
		}
		return rslt;
	}

}
