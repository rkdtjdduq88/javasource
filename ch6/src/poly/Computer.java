package poly;

public class Computer extends Product{
    public Computer() {
    	super(200); ////부모의 매개변수를 받는 생성자 호출
    }
    
    @Override
    public String toString() { //toString 을 쓰면 주소가 아닌 값이 나옴 p
    	return "Computer";
    }
}
