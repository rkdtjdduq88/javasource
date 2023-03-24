package inheritance.code;

//클래스 앞에 final이 붙으면 상속 금지
public final class FinalTest {
    
	final int MAX_SIZE=10; //상수 (초기화 이후에는 값을 변경 불가능)
	
	static final int MIN_SIZE=0; //공유(공통)상수 - final static으로 위치 변경해도 됨
	
	
	//메소드 앞에 final이 붙으면 오버라이딩 금지
	final void getMaxSize() {
		final int LV = MAX_SIZE; //상수
		
	}
}
