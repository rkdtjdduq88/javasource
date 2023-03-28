package shop2;

//상수, 모든 메소드는 추상
public interface IShop {
	//public static abstract 자동으로 붙어있음
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();
}
