import java.util.Arrays;

public class Day16{

	public static int[] partsSums(int[] arr) {
		int[] result=new int[arr.length+1];
		for (int i = 0; i < arr.length ; i++) {
			int sum=arr[i];
			for (int j = i+1; j < arr.length ; j++) {
				sum+=arr[j];
			}
			result[i]=sum;
		}
		result[arr.length]=0;
		System.out.println(Arrays.toString(result));
		return result;
	}


}
