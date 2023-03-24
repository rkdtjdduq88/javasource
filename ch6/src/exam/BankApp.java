package exam;

import java.util.Scanner;
//private : 외부 클래스에서 호출 불가 => 내부에서만 사용하겠음
public class BankApp {
	//인스턴스 변수(초기화 완료)
	private static Account[] accountArray = new Account[10]; //Account 객체 배열 10개 선언,생성
	private static Scanner scanner = new Scanner(System.in); //사용자 입력

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>> ");
		
			// sc.nextLine(); String 타입으로 입력값을 처리
			// scanner.nextInt(); int 타입으로 입력값을 처리
		int selectNo = Integer.parseInt(scanner.nextLine()); //1 엔터
			switch (selectNo) { //1이면 1번꺼 실행, 2이면 2번꺼 실행, 3이면 3번꺼 실행....해서 5번까지 실행
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				//while 문 종료
				run = false;
				break;
			default:
				break;
			}
		}//while문종료

	}//main 종료
	
	private static void createAccount() {
		//계좌생성
		//Account 인스턴스를 생성하기 값을 입력받기
		System.out.print("계좌번호 >> ");
		String ano = scanner.nextLine();
		
		System.out.print("예금주 >> ");
		String owner = scanner.nextLine();
		
		System.out.print("잔액 >> ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		//for문을 돌려 i에 해당하는 배열 초기값이 null 이면  수행
		//한번만 수행되고 빠져 나오도록 해야 함
	    for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano,owner,balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	    
	}
	private static void accountList() {
		//accountArray 에 있는 내용 출력 ==> 생성된 계좌 정보 출력
		//null 이 아닌 경우만 출력
		
		System.out.println();
		System.out.println("계좌목록");
		System.out.println("-------------------");
		
		 for (int i = 0; i < accountArray.length; i++) {
				if(accountArray[i] != null) {
					System.out.printf("%s\t%s\t%d\n",
							accountArray[i].getAno(),
					        accountArray[i].getOwner(),
					        accountArray[i].getBalance());
				}
		 }
		
	}
	private static void deposit() {
		//예금하다 - 계좌번호 입력받기, 예금액 입력받기
		System.out.println("계좌번호 >> ");
		String ano = scanner.nextLine();
		System.out.println("예금액 >> ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		//accountArray에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액 + 예금액
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) { 
				if(accountArray[i].getAno().equals(ano)) {
					//accountArray[i].Balance += amount;
					accountArray[i].setBalance(accountArray[i].getBalance() + amount);
				}
			}
		}//1.accountArray[i]가 null 아니라면(비어있는 공간이 아니라면) if문 발동 
		 //2.getAno 계좌와 찾고싶은 ano계좌가 같다면 (getAno계좌와 찾고싶은 ano계좌가 다르다면 if문이 계속 돔) 
		 //3.getbalance 잔액과 amount 내가 입력한 예금액을 합해서 변경된setBalance 잔액을 구한다.(setBalance는 this.balance=balance이기때문에 값 변경)
		
		
	}
	private static void withdraw() {
		//출금하다 - 계좌번호, 출금액 입력받기
		System.out.println("계좌번호 >> ");
		String ano = scanner.nextLine();
		System.out.println("출금액 >> ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		//accountArray에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액 - 출금액
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]!=null) { 
				if(accountArray[i].getAno().equals(ano)) {
					//accountArray[i].Balance += amount;
					accountArray[i].setBalance(accountArray[i].getBalance() - amount);
				}
			}
		}
	}

}
