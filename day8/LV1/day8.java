package quiz;

public class day8 {
	public static void main(String[] args) {
		/*
		입력 된 세 문자열의 모든 문자를 그룹으로 결합하는 문자열을 반환하는 함수를 만듭니다. 모든 입력의 첫 글자를 가져 와서 서로 그룹화합니다. 
		모든 편지에 대해이 작업을 수행하십시오. 
		아래 예를 참조하십시오!

		E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

		tripleTrouble(one, two, three)
		
		tripleTrouble("this","test","lock"), "ttlheoiscstk"
		tripleTrouble("aa","bb","cc"), "abcabc"
		tripleTrouble("Bm", "aa", "tn"), "Batman"
		tripleTrouble("LLh","euo","xtr"), "LexLuthor" 
		*/
		
		String[] tripleTrouble1 = {"aa", "bb", "cc"};
		String[] tripleTrouble2 = {"Bm", "aa", "tn"};
		String[] tripleTrouble3 = {"LLh","euo","xtr"};
		String result = "";
		
		for(int j=0; j<tripleTrouble3[0].length(); j++) {
			for(int i=0; i<tripleTrouble3.length; i++) {
				result += tripleTrouble3[i].charAt(j);				
			}
		}
		System.out.println(result);
	}
}
