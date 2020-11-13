package day5;

public class Day5 {

	public static int getIndex(int[] arr) {
		int answer=-1;
		int idx=0;
		while (idx<arr.length) {
			int left=0; //���� ��
			int right=0; //������ ��
			if (idx == 0) { // 0�� ��
				for (int i=idx+1;i<arr.length;i++) {
					right+=arr[i];
				}
			}else if (idx==arr.length-1) { //������ ������
				for (int i=arr.length-2;i>=0;i--) {
					left +=arr[i];
				}
			}else {
				for (int i=0;i<idx;i++) { // left ���
					left+=arr[i];
				}
				for (int i=idx+1;i<arr.length;i++) { //right ���
					right+= arr[i];
				}
			}
			if (left == right && (answer == -1 || idx < answer)) {
				answer = idx;
			}
		idx++;
		}
		return answer;
	}

}
