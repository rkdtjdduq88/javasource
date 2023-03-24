package poly;

public class CarEx {

	public static void main(String[] args) {
//		Car car1 = new FireEngine();
//		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; // Car car = new FireEngine();
		
		fireEngine2 = (FireEngine) car; //강제형변환(캐스팅)
		fireEngine2.water(); //강제형변환을 통해서 자식클래스에서는 호출할 수 없었던 멤버를 호출할 수 있음
		
		//java.lang.ClassCastException
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();
		
		//FireEngine fe = new Ambulance(); 형제관계는 없음

	}

}
