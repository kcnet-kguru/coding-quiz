public class Day4{
	public static int[] nbMonths(double startPriceOld, double startPriceNew, double savingperMonth,double percentLossByMonth) {
		int resultArray[] = null; // ���� Array
		int month = 0;
		int money = 0;
		double result=0; //����� ��
		double percentLossByMonthTmp= percentLossByMonth * 0.01; //�޿� �������� ����
		result = startPriceOld - startPriceNew; // ���� �� - ����  
		if (result > 0) {
			money = (int)result;
			resultArray = new int[]{ month , money };
			return resultArray;
		}else {
			month++;
			double startPriceOldTmp = startPriceOld - (startPriceOld * percentLossByMonthTmp); // ���� �� ���(���� ����)
			double startPriceNewTmp = startPriceNew - (startPriceNew * percentLossByMonthTmp); // �� �� ���(���� ����)
			while (true) {
				if (month % 2 == 0)  {// 2���� ���� üũ.
					percentLossByMonthTmp += 0.005;
				}
				if (month>1) {
					startPriceOldTmp = startPriceOldTmp - (startPriceOldTmp * percentLossByMonthTmp);
					startPriceNewTmp = startPriceNewTmp - (startPriceNewTmp * percentLossByMonthTmp);				
				}
				result = ((startPriceOldTmp + savingperMonth * month) - startPriceNewTmp); // ���� �� + (����ݾ� * �� ) - ���� 
				if (result > 0) {
					money = (int)result;
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
}
