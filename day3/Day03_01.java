package Day03.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day03_01 {
	// ��ø�� �迭�� �Ű������� �޾� �� ���� �迭���� ��Ȯ�� �ϳ��� ��Ҹ� ������ ���� �迭�� ���� ��ȯ�ϴ� �Լ��� �ۼ��ϼ���.
	// ����): solve([[1,2],[4],[5,6]])�� 4���� �迭�� ���������մϴ�.([1,4,5],[1,4,6],[2,4,5],[2,4,6]).
	// �ߺ��� ī��Ʈ�� �������� �ʽ��ϴ�.
	
	public static void main(String[] args) {
		int arrayCnt = 0;
		int arraySize = 0;
		int result = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Է��� �迭�� ������ �Է��ϼ��� : ");
		arrayCnt = input.nextInt();
		
		for(int i=0; i<arrayCnt; i++) {
			System.out.print("�迭 ����� �Է��ϼ��� : ");
			arraySize = input.nextInt();
			
			System.out.print("�迭�� �Է��ϼ��� : ");
			int array[] = new int[arraySize];
			for(int j=0; j<arraySize; j++) {
				array[j] = input.nextInt();
			}
			
			List<String> list = new ArrayList<String>();
			for(int j=0; j<arraySize; j++) {
				if(!list.contains(Integer.toString(array[j]))) list.add(Integer.toString(array[j]));
			}
			result = result * list.size();
		}
		
		System.out.print(result);
	}
}
