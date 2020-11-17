/*어떤 한 남자의 차는 $2000 입니다. 그가 사고 싶어 하는 차는 $8000 입니다. 
그는 매달 $ 1000를 절약 할 수 있다고 생각하지만 그의 오래된 차와 새 차의 가격은 한 달에 1.5 % 하락합니다. 또한이 손실 비율은 2 개월마다 0.5 % 씩 증가합니다.

우리 남자는이 모든 계산을하기가 어렵다는 것을 알고 있습니다

그가 원하는 차를 살 수있을만큼의 돈을 모으려면 몇 달이 걸리고 그가 남는 돈은 얼마나 될까요?*/


public class Day4 {

	public static void main(String[] args) {
		
		int startPriceOld = 2000; 	// 오래된 차
		int startPriceNew = 8000;	// 새로살 차
		int savingperMonth = 1000;		// 매달 저축할 돈의 액수
		float percentLossByMonth = 1.5f;	// 하락율
		
		nbMonths(startPriceOld, startPriceNew, savingperMonth, percentLossByMonth);
		
	}

	
	public static void nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, float percentLossByMonth) {
		int month = 0;
		int money = 0;
		int oldCar = startPriceOld;
		int newCar = startPriceNew;
		int save = savingperMonth;
		
		float percentLoss = percentLossByMonth*0.01f;	// 매월 하락율
		
		
		// 첫달 1.5 둘째달2.0 셋째달 2.0 넷째달 2.5 다섯째달 2.5 여섯째달 3.0 
		// 짝수일때 +0.5 해주면 됨
		
		while(money < newCar) {
			month++;
			if(month != 1 && month%2 ==0) {
				percentLoss = percentLoss + 0.005f;		// 2, 4, 6개울차에 0.5%하락율 증가
				oldCar = oldCar - (int) (oldCar * percentLoss);
				newCar = newCar - (int) (newCar * percentLoss);
				money = oldCar + (save * month);
			} else {
				oldCar = oldCar - (int) (oldCar * percentLoss);
				newCar = newCar - (int) (newCar * percentLoss);
				money = oldCar + (save * month);
			}
		}
		
		money = money -newCar;		// 차를 구입하고 남은 돈 계산
		System.out.println("차를 구입하는데 걸린 개월 수 : " + month + "\n 남은 돈 : " + money);
		
		
	} 
	
}
