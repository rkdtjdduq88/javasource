package inter;

public class FighterEx {

	public static void main(String[] args) {
		//인터페이스는 인스턴스 생성 불가
		//인터페이스를 구현하는 클래스가 존재해야 의미가 있음
		//Attackable attackable = new Attackable(); //구현(implements)하는 클래스가 없어서 불가능
		
		//다형성 개념 적용
		Fightable fightable = new Fighter(); //구현(implements)하는 클래스가 있어서 가능
		

	}

}
