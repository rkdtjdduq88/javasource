/*
 * 자바는 객체지향언어
 *  장점:코드의 재사용성 높다
 *  	코드 관리가 용이
 *  	신뢰성 높은 프로그래밍 가능
 *  
 *  자바는 무조건 클래스를 만들어야함(클래스 기준)
 *  클래스 : 객체를 정의해 놓은 것  * 레고의 설계도 같은
 *  클래스 용도 : 객체를 생성하는 데 사용
 *  객체 : 실제로 존재하는 것, 사물or개념
 */

//클래스 만들어보기
package ch6;

public class Tv {
	
	// 출력하면 이전에 했던게 들어옴, 단독으로 안되고, 컴파일로만 저장됨
	//tv에 대한 설명서 만듦
	//속성(property) ==> 멤버변수 라고 함
		//크기,길이,높이,색상 ...
		//ex)색상의 경우 '문자' 로 색상 옴
		String color; //색상
		int channel; //채널
		boolean power; //전원상태
	//기능(function) ==> 메서드 라고 함
		//켜기, 끄기, 볼륨 높이기, 낮추기, 채널 변경...
		
	
		void power() {
			power=!power;
		}
		
		void channelUp() {
			channel++;
		}
		void channelDown() {
			channel--;
		}
}







