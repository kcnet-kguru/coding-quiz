import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day19{
	public static String findMostSimilar(String word, String[] dictionary) {
		List<String> answerList = new ArrayList<String>();
		int wordLength = word.length();
		List<int[]> countWordSimilar = new ArrayList<int[]>();
		for (int i = 0; i < dictionary.length ; i++) {
			if (word.equals(dictionary[i])) {
				return dictionary[i];
			}
			else {
				int countWord = getCountWordSimilar(word, dictionary[i]);	
				countWordSimilar.add(new int[] {i, dictionary[i].length() - countWord});
			}
		}
		int firstData[] = countWordSimilar.get(0);
		int minWordSimilarGap=firstData[1] + 1;
		for (int i = 0 ; i < countWordSimilar.size() ; i++ ) {
			int temp[] = countWordSimilar.get(i);
			minWordSimilarGap = Integer.min(minWordSimilarGap, temp[1]);			
		}
				
		String result = getResultDictionary(countWordSimilar, minWordSimilarGap, dictionary);
		
		return result;
	}
	
	public static int getCountWordSimilar(String word, String dictionaryWord) {

		int count = 0;
		
		List<String> sortWordList = new ArrayList<String>();
		List<String> sortDictionaryWordList = new ArrayList<String>();
		
		for (int i = 0 ; i < word.length() ; i++) {
			sortWordList.add(word.charAt(i)+"");
		}
		Collections.sort(sortWordList);
		
		for (int i = 0 ; i < sortWordList.size() ; i++) {
			if (dictionaryWord.contains(sortWordList.get(i))) {
				count++;
			}
		}
		
		return count;
	}
	
	public static String getResultDictionary(List<int[]> countWordSimilar, int minWordSimilarGap, String[] dictionary) {
		int resultCheck=0;
		int returnData=0;
		List<Integer> returnIndex = new ArrayList<Integer>(); 
		for (int i = 0 ; i < countWordSimilar.size() ; i++) {
			int temp[]=countWordSimilar.get(i);
			
			if (minWordSimilarGap == temp[1] ) {
				resultCheck++;
				returnIndex.add(i);
			}
		}
		
		if (resultCheck == 1) {
			return dictionary[returnIndex.get(0)];
		}
		else {
			int max=0;
			SortedSet<String> compareDic = new TreeSet<String>();
			for (int i = 0 ; i < dictionary[returnIndex.get(0)].length() ; i++) {
				compareDic.add(dictionary[returnIndex.get(0)].charAt(i)+"");
			}
			max = compareDic.size();
			returnData = returnIndex.get(0);
			for (int i = 0 ; i < returnIndex.size() ; i++) {
				SortedSet<String> compareDic1 = new TreeSet<String>();
				for (int j = 0 ; j < dictionary[returnIndex.get(i)].length() ; j++) {
					compareDic1.add(dictionary[returnIndex.get(i)].charAt(j)+"");
				}
				int dicMax = compareDic1.size();
				if (dicMax > max) {
					returnData = i;
				}
			}
			
			
			return dictionary[returnData];
		}
	}

}
