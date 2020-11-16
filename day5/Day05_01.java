package Day05.project;

public class Day05_01 {
	//���� �迭�� �־��� ���Դϴ�.
	//����� �ӹ��� �� �迭�� ���� �ͼ� N�� ���ʿ��ִ� ������ ����
	//N�� �����ʿ��ִ� ������ �հ� ���� �ε��� N�� ã�� ���Դϴ�.
	//�̷� ���� �� ���ִ� �ε����� ���ٸ�,- 1�� ��ȯ�մϴ�.
	
	//Input
	//�ۼ��� �Լ��� �Ű������� 0 < arr < 1000 �� ���� �迭�Դϴ�.

	//Output
	//N�� ������ N�� �����ʰ� ���� ���� ���� �ε��� N�Դϴ�.
	//�̷��� ��Ģ�� �´� �ε����� ã�� ���ϸ� -1�� ��ȯ�մϴ�.
	
	public static void main(String[] args) {
		int returnValue1[] = {1,2,3,4,3,2,1};
		findSumIndex(returnValue1);
		
		int returnValue2[] = {10, -80,10,10,15,35};
		findSumIndex(returnValue2);
	}
	
	public static int findSumIndex(int arr[]) {
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			int leftSum = leftSum(arr, i);
			int rightSum = rightSum(arr,i);
			if(leftSum == rightSum) index = i;
		}
		System.out.println(index);
		return index;
	}
	
	public static int leftSum(int arr[], int index) {
		int leftSum = 0;
		for(int i=0; i<index; i++) {
			leftSum = leftSum + arr[i];
		}
		return leftSum;
	}
	
	public static int rightSum(int arr[], int index) {
		int rightSum = 0;
		for(int i=arr.length -1; i>index; i--) {
			rightSum = rightSum + arr[i];
		}
		return rightSum;
	}
}
