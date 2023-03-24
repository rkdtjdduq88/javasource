package ch6;

public class Car2 {
	//클래스 구성요소
	//1. 멤버변수 - 속성
	//2. 메소드 - 기능
	//3. 생성자 - 인스턴스 초기화 담당
	// 1)매개변수가 없는 생성자(기본생성자)
	// 2)매개변수가 있는 생성자(
	
	//속성(property):멤버변수
	  //제조사, 모델,색상,최대속도
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// "생성자(constructor)" 라는 개념 넣기
	//마우스 오른쪽, source, generate constructor using fields..
	
	//기본(default) 생성자 (아래)
	//생성자는 기본적으로 만들때 class이름과 동일해야함(규칙)
	//리턴값이 없음 (없어야함)
	//생성자는 여러개 존재 가능(생성자 오버로딩)
	//목적 : 인스턴스가 생성될 때 호출됨
	//		인스턴스 초기화 담당(or 인스턴스 생성시 수행될 코드)
	
	public Car2() { //기본(default)생성자
		super();
	}
	
	//매개변수가 있는 생성자
	public Car2(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	




	//기능(function):메소드
	  //전진, 후진
	void forward() {
		System.out.println("전진한다.");
	}
	void backward() {
		System.out.println("후진한다.");
	}
	
	
}
