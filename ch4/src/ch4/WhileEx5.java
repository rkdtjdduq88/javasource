package ch4;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0; //잔액변수
		Scanner sc=new Scanner(System.in);
		int amount=0; //금액변수
		
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 |2.출금|3.잔액|4.종료");
			System.out.println("-----------------------");
			System.out.println("메뉴 선택 >>");
			
			
			int menu= Integer.parseInt(sc.next());
			
			switch (menu) {
			case 1:
				//예금액 입력 받기
//				System.out.println("예금액 : ");
//				 amount= Integer.parseInt(sc.next());
				//잔액=잔액+예금액
//				balance+=amount;
				
				balance=balance+Integer.parseInt(sc.next());
				
				break;
			case 2:
				//출금액 입력받기
				System.out.println("출금액 : ");
				amount= Integer.parseInt(sc.next());
				//잔액=-잔액-출금액
				balance=balance-amount;

				break;
			case 3:
				//현재 잔액 출력
				System.out.println("잔액: "+balance);
				break;
			case 4:
				run=false;
				break;
				
			default:
				break;
			}
		}

		
		}
}
