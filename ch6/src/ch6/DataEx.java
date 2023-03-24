package ch6;

public class DataEx {

	public static void main(String[] args) { //JVM에서 main을 가장 먼저 호출)
	
		Data data=new Data();
		
		//초기화
		data.x=10;
		System.out.println("1main():x="+data.x);

		//값이 넘어감 (.찍어서 할때)
		change(data.x);
		System.out.println("2After change(data.x)");
		System.out.println("3main():x="+data.x);
	
		//주소가 넘어감
		change2(data);
		System.out.println("After change2(data.x)");
		System.out.println("main():x="+data.x);
		
	}
	//기본형 매개변수 일 때는 값만 받게 됨
	//int x : x가 갖고 있는 값만 받음
	static void change(int x) { //로컬변수 x=1000은 끝나면 없어짐
		x=1000;
		System.out.println("4change():x="+x);
	}		//change():x=1000

	//참조형 매개변수 : 값을 읽고 수정 가능
	static void change2(Data d) { 
		d.x=1000;
		System.out.println("5change():x="+d.x);
	}		//
}



//스택 : 입/출구가 같음==>처음에 들어간게 마지막에 나옴
