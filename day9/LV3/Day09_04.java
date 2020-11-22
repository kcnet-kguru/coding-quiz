package Day09.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day09_04 {
	// ������ ���� ���� �� ������ u�� ����Ͻʽÿ�
	// ���� u (0) = 1�� u���� ù ��°�Դϴ�.
	// u�� �� x�� ���� y = 2 * x + 1 �� z = 3 * x + 1�� u�� �־���մϴ�.
	// u���� �ٸ� ���ڰ� �����ϴ�.
	// u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]
	public static void main(String[] args) {
		dbl_linear(10);
		dbl_linear(20);
		dbl_linear(30);
		dbl_linear(50);
	}
	
	public static int dbl_linear(int num) {
		int returnValue = 0;
		ArrayList<Integer> templist = new ArrayList<Integer>();
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		
		templist.add(1);
		templist.addAll(yList(1));
		
		int temp = 0;
		
		for(int i=0;i<num/3;i++) {
			for(int j=0;j<3;j++) {
				if((j+temp) != 0) templist.addAll(yList(templist.get(j+temp)));
			}
			temp = temp+3;
		}

		for(int i : templist) {
			if(!returnList.contains(i)) returnList.add(i);
		}
		
		returnList.sort(null);
		returnValue = returnList.get(num);
		
		System.out.println(returnValue);
		return returnValue;
	}
	
	public static ArrayList<Integer> yList(int num){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(2*num+1);
		arr.add(3*num+1);
		
		return arr;
	}
}
