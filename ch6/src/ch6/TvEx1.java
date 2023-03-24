package ch6;

public class TvEx1 {

	public static void main(String[] args) {
		// Tv 객체 생성한다고 얘기함
		// 클래스로부터 객체를 만드는 과정 : 인스턴스화
//		Tv tv=new Tv(); // 객체를 생성할 클래스 이름이 앞에 옮 (변수명) = new 클래스이름();
//						// 클래스이름 변수명=new 클래스이름();
		//객체 선언
		Tv tv;   
		//객체 생성
		tv=new Tv();
		
		//객체가 가지고 있는 속성, 메소드를 사용하기 위해서는 .(dot)로 접근
		print(tv); //주소 넘어감
		
		//출력 => 기본값으로 출력됨
//		색상null
//		채널0
//		전원여부false
		
		//멤버변수 초기화
		tv.color="black";
		tv.channel=6;
		tv.power=true;
		
	
		//초기화 후 확인 
		System.out.println();
		print(tv);
		
		//출력 
//		색상black
//		채널6
//		전원여부true
		
		//메소드 호출 : . 찍고 =>메소드 실행
		tv.channelUp();
		//실행됐는지 확인해보자
		System.out.println("채널"+tv.channel);
		//출력 
//		채널7

		tv.power();
		System.out.println("전원여부"+tv.power);

		//화이트 tv만들고 싶어요
		Tv tv2=new Tv(); //두번째 tv
		tv2.color="white";
		tv2.channel=11;
		
		//tv키고 끄고 싶으면, power 부르면 끝, 초기가 false이기 때문에
		tv2.power(); //tv 켜기
		
		//tv2상태 확인하기
		System.out.println();
		print(tv2);
		
		
	}

	static void print(Tv tv) {
		System.out.println("색상"+tv.color);
		System.out.println("채널"+tv.channel);
		System.out.println("전원여부"+tv.power);
	}
}












