package exam;

public abstract class Calc { //자식클래스들이 다 하는일이 다르면 추상클래스를 사용하는게 낫다
	                         //일반클래스로하려면 자식클래스에 오버라이딩을 하고 다른 자식클래스에 또 오버라이딩을 해야하는 번거로움
	int a,b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
    
	
	
}
//철수 학생은 다음 2개의 필드와 메소드를 가진 4개의 클래스 Add,Sub,Mul,Div를 작성하려고 한다
//생각해보니 Add,Sub,Mul,Div 클래스에 공통된 필드와 메소드가 존재하므로 새로운 추상클래스 Calc를 작성하고
//Calc를 상속받아 만들면 되겠다고 생각했다. 그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를
//입력받은 후, Add,Sub,Mul,Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 setValue()와 calculate()
//를 호출하여 그 결과값을 화면에 출력하면 된다고 생각하였다. 철수처럼 프로그램을 작성하라.

// int 타입의 a,b 필드 : 2개의 피연산자
// 피연산자 값을 객체 내에 void setValue(int a, int b): 저장한다.
// int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.