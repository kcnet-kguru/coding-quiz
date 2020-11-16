package Day04.project;

public class Day04_01 {
	// � �� ������ ���� $2000 �Դϴ�. �װ� ��� �;� �ϴ� ���� $8000 �Դϴ�. 
	// �״� �Ŵ� $ 1000�� ���� �� �� �ִٰ� ���������� ���� ������ ���� �� ���� ������ �� �޿� 1.5 % �϶��մϴ�. 
	// ������ �ս� ������ 2 �������� 0.5 % �� �����մϴ�. �츮 ���ڴ��� ��� ������ϱⰡ ��ƴٴ� ���� �˰� �ֽ��ϴ�
	// �װ� ���ϴ� ���� �� ��������ŭ�� ���� �������� �� ���� �ɸ��� �װ� ���� ���� �󸶳� �ɱ��?
	
	public static void main(String[] args) {
		nbMonths(2000, 8000, 1000, 1.5);
	}
	
	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
	    int month = 0;
	    int savingMoney = 0;
	    double dstartPriceOld = (double)startPriceOld;
	    double dstartPriceNew = (double)startPriceNew;
	    
	    while(dstartPriceNew > (savingMoney + dstartPriceOld)) {
	    	month ++;
	    	savingMoney = savingMoney + savingperMonth;
	    	
	    	if(month % 2 == 0) percentLossByMonth = percentLossByMonth + 0.5;
	    	dstartPriceOld = dstartPriceOld - (dstartPriceOld * 0.01 * percentLossByMonth);
	    	dstartPriceNew =  dstartPriceNew - (dstartPriceNew * 0.01 * percentLossByMonth);
	    }
	    
	    int[] returnValue = new int[]{month, (int)(savingMoney+dstartPriceOld-dstartPriceNew)};
	    System.out.println(returnValue[0] + "," + returnValue[1]);
	    
		return returnValue;
	}
}
