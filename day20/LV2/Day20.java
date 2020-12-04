import java.util.HashSet;
import java.util.regex.Pattern;

public class Day20{

	public static boolean pangramCheck(String str) {
		HashSet<String> alphabetList = new HashSet<String>();
		str = str.toUpperCase();
		String alphabetPattern = "^[A-Z]*$";
		for (int i = 0 ; i < str.length() ; i++) {
			boolean isAlphabet = Pattern.matches(alphabetPattern, str.charAt(i)+"");
			if (isAlphabet) {
				alphabetList.add(str.charAt(i)+"");
			}
		}
		
		
		return alphabetList.size() == 26;
	}
	
}
