package poly;

public class SmartTvEx {

	public static void main(String[] args) {
		
		//참조변수와 인스턴스 타입이 일치
		SmartTv smartTv = new SmartTv();
		
		//다형성의 예
		//조상타입 참조변수로 자손타입 인스턴스 참조한다.
		//부모 = new 자식 (왼쪽은 무조건 부모클래스, 오른쪽은 자식클래스)
		Tv tv = new SmartTv();
	    
		//참조변수의 타입에 따라 사용할 수 있는 멤버의 개수는 달라짐
		//tv와 smartTv로 접근할 수 있는 범위의 차이가 생김
		//tv보다 smartTv가 불러올 수 있는 멤버가 더 많음
		
		//SmartTv smartTv2 = new Tv(); 부모클래스가 오른쪽에 오면 에러남
		
		
		
	}

}
