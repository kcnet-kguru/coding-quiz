package Day09.project;

public class Day09_01 {
	// �־��� ���ڿ� src�� ��Ȯ�� ī��Ʈ Ƚ�� �ݺ��ϴ� repeat_str�̶�� �Լ��� �ۼ��Ͻʽÿ�.
	public static void main(String[] args) {
		repeatStr(6, "I");
		repeatStr(5, "Hello");
	}
	
	public static String repeatStr(int cnt, String word) {
		String returnValue = "";
		
		for(int i=0; i<cnt; i++) {
			returnValue = returnValue + word;
		}
		
		System.out.println(returnValue);
		return returnValue;
	}
}
