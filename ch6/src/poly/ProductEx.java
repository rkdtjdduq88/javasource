package poly;

public class ProductEx {

	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer = new Buyer();
		
		// Tv 구매하다
//		Tv1 tv1 = new Tv1();
//		buyer.buy(tv1);
		
		buyer.buy(new Tv1()); //위 두줄을 줄여서 이렇게 씀 (왼쪽(Tv1)과 오른쪽(Tv1)이 같고, tv1. 등등 접근을 안할거라면)
		
		// Computer 구매하다
//		Computer computer = new Computer();
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+buyer.money+" 만원입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bonuspoint+" 점입니다.");
	}

}
