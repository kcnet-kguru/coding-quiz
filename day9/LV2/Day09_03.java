package Day09.project;

public class Day09_03 {
	// 하나 이상의 단어 문자열을 받아 동일한 문자열을 반환하지만 5 개 이상의 글자 단어가 모두 반전되어 반환하는 함수를 작성합니다.
	// 전달 된 문자열은 문자와 공백으로 만 구성됩니다. 공백은 둘 이상의 단어가있는 경우에만 포함됩니다.
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
