package poly;

public class Audio extends Product{
    public Audio() {
    	super(50); ////부모의 매개변수를 받는 생성자 호출
    }
    
    @Override
    public String toString() { //toString 을 쓰면 주소가 아닌 값이 나옴 p
    	return "Audio";
    }
}
