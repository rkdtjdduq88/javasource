package ch6;

public class PersonEx {

	public static void main(String[] args) {
		
		Person p=new Person(); //Person인스턴스가 생성됨
		  //=>Person이 가지고 있는 인스턴스 변수, 메소드 사용 가능
		p.setName("");
		p.print();
		
		Person.print2();
		
	}

}
