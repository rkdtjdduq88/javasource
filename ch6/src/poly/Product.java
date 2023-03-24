package poly;

public class Product {
	int price;
	int bonuspoint;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	// buyer.buy(tv1); 실행한다면
	// Product p = tv1 이 넘어옴
	public Product(int price) {
		super();
		this.price = price;
		bonuspoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
}
