package inter;

// implements : 구현(클래스가 인터페이스를 구현할 때 사용)
// extends 와 implements 는 같이 쓸 수 있다.

public class Fighter extends Unit implements Fightable { //Fighter 클래스가 Fightable 클래스를 구현했다. 라고 정의

	@Override
	public void attack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

}
