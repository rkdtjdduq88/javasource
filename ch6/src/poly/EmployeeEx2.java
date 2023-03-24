package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workPrint(employee);
		
		// 다형성 개념
		// 메소드가 오버라이딩이 되었다면 오버라이딩 된 메소드가 실행된다.
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
		workPrint(employee2);
		
		Adminstartor employee3 = new Adminstartor();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);
		

	}
	//Employee employee = new Ceo()
	//Employee employee = new Adminstartor()
	//Employee employee = new PartTime()
	static void workPrint(Employee employee) { //Employee employee 매개변수의 다형성 Employee를 Car로 바꾸면 Adminstaror
		                                       //나 PartTime은 받을 수 없음
		employee.work();
	}

}
