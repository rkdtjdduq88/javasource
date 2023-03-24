package ch4;

import java.util.Iterator;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 때 사용
 * 종류 : for(주로사용됨), while, do-while
 * 
 */
public class ForEx1 {
	public static void main(String[] args) {
		// ① int i = 0; 실행 : 초기화 구문
		// ② i<10; 실행 : 조건식 구문 (**false일때 반복문이 종료됨**)
		// ③ 조건이 true일 때, 블럭 안으로 진입
		// ④ i++ 실행 : 증감식, i=1
		// ⑤ 다시 조건식 검사, i=1, i<10 이기에 true
		// ⑥ 조건식이 true일 때 블럭안으로 진입 : 출력문 실행
		// 이런식으로 저긴식이 거짓이 될때까지 반복하게 됨
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		// 지역변수는 for 블럭안에서 만 불러올수 있음
//		System.out.println(i);  ==> 안됨
		
		System.out.println();
		
		for (int i = 10; i >= 1;  i--) {
			System.out.print(i+" ");

		}
		
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		
		
		// 1 3 5 7 9
		
		// i=i+2; 를 i+=2 로 쓸수 있음
		// i=i+3; => i+=3
		System.out.println();
		for (int i = 1; i <= 10; i+=2) {
			System.out.print(i+" ");
		}
		
		// hellow 인사말 세번 출력하고 싶음
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("Hello ");
		}

		System.out.println();
		for (int i = 1; i <= 100; i+=2) {
			System.out.print(i+" ");
		
		}
		
		//1에서 10까지 덧셈 결과 출력
		//sum=1;
		//sum=sum+2
		
		System.out.println();
		int sum=0;
		for (int i = 1; i <=10; i++) {
			sum=sum+i;
//			sum+=1; 로도 표현가능
		}
		System.out.println("1~10 합 " +sum);
		
	}

}
