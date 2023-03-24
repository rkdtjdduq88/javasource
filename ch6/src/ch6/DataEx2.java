package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		//인스턴스 생성
		//참조형타입 변수명 = new 참조형타입 () ;
		Data d=new Data();
		d.x=10;
		Data d2=copy(d); //주소
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
	}
	
	
	static Data copy(Data d) { //temp라는 이름으로 객채 생성
		Data temp=new Data();
		// d.x의 값을 temp.x에 넣어라
		temp.x=d.x;
		
		return temp;
		
	}
}

