public class Day4{
	public static int[] nbMonths(float startPriceOld, float startPriceNew, float savingperMonth,float percentLossByMonth) {
		int resultArray[] = null; // ���� Array
		int month = 1;
		int money = 0;
		float result=0; //����� ��
		float percentLossByMonthTmp=(float) (percentLossByMonth * 0.01); //�޿� �������� ����
		float startPriceOldTmp = (float)(startPriceOld - (startPriceOld * percentLossByMonthTmp)); // ���� �� ���(���� ����)
		float startPriceNewTmp = (float)(startPriceNew - (startPriceNew * percentLossByMonthTmp)); // �� �� ���(���� ����)
		while (true) {
			if (month % 2 == 0)  {// 2���� ���� üũ
				percentLossByMonthTmp += 0.005;
			}
			if (month>1) {
				startPriceOldTmp = (float)(startPriceOldTmp - (startPriceOldTmp * percentLossByMonthTmp));
				startPriceNewTmp = (float)(startPriceNewTmp - (startPriceNewTmp * percentLossByMonthTmp));				
			}
			result = (float)((startPriceOldTmp + savingperMonth * month) - startPriceNewTmp); // ���� �� + (����ݾ� * �� ) - ���� 
			if (result > 0) {
				money = (int) result;
				break;
			}
			else {
				month++;	
			}
		}
		resultArray = new int[]{ month , money };
		return resultArray;
	}
}
