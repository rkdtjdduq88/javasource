package inheritance;

// Math.random() : static 메소드
// Math.PI : final static double PI=3.1415950000 (상수일때는 final을 붙임)

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
    	System.out.println("Computer 객체의 areaCircle 실행");
    	return Math.PI * r * r;  // 객체 생성을 안했음에도 메소드 호출이 가능한 이유는 static
    }
}
