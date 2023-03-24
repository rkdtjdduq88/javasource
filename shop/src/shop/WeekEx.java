package shop;

public class WeekEx {

	public static void main(String[] args) {
		// enum을 쓰는 이유 : 요일명은 고정이고 변경되지 않는 형태이기 때문에
		// 상수 형태로 선언이 가능하기 때문
		Week week1 = Week.FRIDAY;
		System.out.println(week1);
	}

}
