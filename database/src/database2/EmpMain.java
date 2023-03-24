package database2;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAO();
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("--------------------------------");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("--------------------------------");
			System.out.print("메뉴입력 >> ");
			
		//메뉴번호 입력받기
		int menu = sc.nextInt();	
		//switch 작성		
		switch (menu) {
		case 1: 
						
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			//empno 입력받기
			System.out.print("사번 >> ");
			int empno = sc.nextInt();
			EmpDTO row = empDAO.getRow(empno);
			System.out.println(row);
			// 출력
			break;
		case 5:
			
			break;
		case 6:
			flag = false;
			break;
		default:
			System.out.println("메뉴 번호 확인");
			break;
			}
			
		}
	}

}
