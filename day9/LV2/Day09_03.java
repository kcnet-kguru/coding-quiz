package Day09.project;

public class Day09_03 {
	// �ϳ� �̻��� �ܾ� ���ڿ��� �޾� ������ ���ڿ��� ��ȯ������ 5 �� �̻��� ���� �ܾ ��� �����Ǿ� ��ȯ�ϴ� �Լ��� �ۼ��մϴ�.
	// ���� �� ���ڿ��� ���ڿ� �������� �� �����˴ϴ�. ������ �� �̻��� �ܾ�ִ� ��쿡�� ���Ե˴ϴ�.
	public static void main(String[] args) {
		spinWords( "Hey fellow warriors" );
		spinWords( "This is a test");
		spinWords( "This is another test" );
	}
	
	public static String spinWords(String sentence) {
		String returnValue = "";
		String[] sentenceArray = sentence.split(" ");
		
		for(int i=0; i<sentenceArray.length; i++) {
			String[] wordArray = sentenceArray[i].split("");
			if(wordArray.length>4) {
				for(int j=wordArray.length-1; j>-1;j--) {
					returnValue = returnValue + wordArray[j]; 
				}
			}else {
				returnValue = returnValue + sentenceArray[i];
			}
			if(i != (sentenceArray.length)-1) returnValue = returnValue + " ";
		}
		System.out.println(returnValue);
		return returnValue;
	}
}
