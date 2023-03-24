package ch3;


import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
	  // 근무 시간 입력받기
	  // 8시간 근무시 시간당 9800 일때
	  // 초과근무 시 1.5배를 지급
		
		
		Scanner sc = new Scanner(System.in);
//	    System.out.println("근무시간 입력해주세요");
//	    int hours = Integer.parseInt(sc.nextLine());
//	    int rate=9800; //시간당 pay
//	    int pay=0; // 하루일당
//	    
//	    //  8 * 9800 = 하루일당
//	    // 12 시간 근무시
//	    if(hours>8) {
//	    	pay = (int)((hours-8)*1.5*rate + rate*8);
//	    }else { // hours가 8이하일때
//	    	pay = hours * rate;
//	    }
//	    System.out.println("하루일당 : "+pay);
		
		// 키, 몸무게 입력받기
		// 저체중, 표준, 고체중 출력하는 프로그램 작성
		
		// (키-100)*0.9 < 몸무게 : 과체중
		// (키-100)*0.9 == 몸무게 : 표준
		// (키-100)*0.9 > 몸무게 : 저체중
		// if~else if,  if~else if~else
		
//		System.out.print("키를 입력해주세요");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게를 입력해주세요");
//		
////		int weight = Integer.parseInt(sc.nextLine());
//		double weight = Double.parseDouble(sc.nextLine());
//		double result = (height-100)*0.9;
//				
//		if(result<weight) {
//			System.out.println("과체중");
//		}else if(result == weight) {
//			System.out.println("표준");
//		}else {
//			System.out.println("저체중");
//		}

		
//		//윤년, 평년 구하기
//		int year=2033;
//		//윤년 : 연도를 4로 나눈 나머지가 0 이고,
//		//연도를 100으로 나눈 나머지가 0이 아니거나, 
//		//연도를 400으로 나눈 나머지가 0이면 윤년이 된다.
//		
//		if(year%4==0 && year%100!=0 || year%400 == 0) {
//			System.out.println("윤년");
//		}else {
//			System.out.println("평년");
//		}
		
		
//		// 임의의 숫자3개 입력받기
//		// 입력받은 3개의 숫자 중 가장 작은 수 출력하기
//		System.out.println("첫번째 임의의 숫자를 입력하세요");
//		int x = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 임의의 숫자를 입력하세요");
//		int y = Integer.parseInt(sc.nextLine());
//		System.out.println("세번째 임의의 숫자를 입력하세요");
//		int z = Integer.parseInt(sc.nextLine());
//		
//		int min=x;
//		if(min>y) {
//			min=y;
//		}
//		if(min>z) {
//			min=z;
//		}
//		System.out.println("가장 작은 수 "+min);
		
//      //위와 같은 식
//		if(x<y && x<z) {
//			System.out.println(x);
//		}else if(y<x && y<z) {
//			System.out.println(y);
//		}else {
//			System.out.println("가장 작은 수"+z);
		System.out.println("첫번째 임의의 숫자를 입력하세요");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 임의의 숫자를 입력하세요");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 임의의 숫자를 입력하세요");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int max=num1;
		if(max<num1) {
			max=num2;
		}
		if(max<num3) {
			max=num3;
		}
		System.out.println("가장 큰 수 "+max);
	}

}
