package ch6;
/*
 * 인스턴스 매소드 : 인스턴스(객체)를 생성하고 사용해야 함
 * 클래스(static) 매소드 : 인스턴스를 생성하지 않고도 바로 사용이 가능함
 * 						클래스명.매소드명() <-외부에서 부를때
 */
public class Mymath {
	//멤버(인스턴스)변수
	long a, b;
	
	long add() {
		return a+b;
	}
	long subtract() {
		return a-b;
	}
	long multiply() {
		return a*b;
	}
	double divide() {
		return a/b;
	}
	
	//기본형 매개변수(지역변수)를 이용한 사칙연산
//	static long add2() {
		//Cannot make a static reference to the non-static field a
		//static 매서드 안에서는 인스턴스변수를 바로 사용할 수 없음(정해진 개념)
//		return a+b;
//	}
	static long add(long a, long b) {
		return a+b;
	}
	static long subtract(long a, long b) {
		return a-b;
	}
	static long multiply(long a, long b) {
		return a*b;
	}
	static double divide(long a, long b) {
		return a/(double)b;
	}
}
