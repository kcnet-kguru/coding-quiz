import java.util.Arrays;

public class Day6{
	public static int missingValues(int[] arr) {
		int one = 0;//�ѹ��� ��Ÿ���� ���
		int two = 0;//�ι��� ��Ÿ���� ���
		
		for (int i = 0; i < arr.length; i++) {
			int temp=arr[i]; //���� ��
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if (temp==arr[j]) { //���ϴ� ���� ���� ��
					count++;
				}
			}
			if (count==2) { //�ι��� ��Ÿ���� ��
				two=temp;
			} else if (count==1) { // �ѹ��� ��Ÿ���� ��
				one=temp;
			}
		}
			
		
		return one * one * two;
	}
}
