package quiz;

public class day8 {
	public static void main(String[] args) {
		/*
		�Է� �� �� ���ڿ��� ��� ���ڸ� �׷����� �����ϴ� ���ڿ��� ��ȯ�ϴ� �Լ��� ����ϴ�. ��� �Է��� ù ���ڸ� ���� �ͼ� ���� �׷�ȭ�մϴ�. 
		��� ������ ������ �۾��� �����Ͻʽÿ�. 
		�Ʒ� ���� �����Ͻʽÿ�!

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
