package shop;

public class ShopMain {

	public static void main(String[] args) {
		IShop shop = new MyShop(); //왼쪽은 부모 오른쪽은 자식
		
		
		// shop 이름 지정
		shop.setTitle("MyShop");
		// user 생성
		shop.genUser();
		System.out.println();
		// product 생성
		shop.genProduct();
		// shop 시작
		shop.start();
		
	}

}
