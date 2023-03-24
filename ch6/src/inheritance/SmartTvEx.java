package inheritance;

public class SmartTvEx {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		//상속여부 확인
		stv.channel = 10;
		stv.channelup();
		System.out.println("현재 채널 "+stv.channel);
		
		stv.power();
		System.out.println("전원상태 "+stv.power);
		
		stv.displayCaption("Hello World");//기본값 false라서 출력하면 안보임
		stv.caption = true; //버튼누름
		stv.displayCaption("Hello World");//true로 변경되어서 출력하면 보임

	}

}
