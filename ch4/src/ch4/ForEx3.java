package ch4;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		//팩토리얼
		//4!=4*3*2*1
		
		// 숫자 입력받기
		//팩토리얼 구한 후 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("팩토리얼 숫자를 입력하세요");
		int num=Integer.parseInt(sc.nextLine());
		int fact=1;
		//fact=fact*4;
		//fact=fact*3;
		for (int i = num; i >0; i--) {
			fact=fact*i;
		}
		System.out.printf("%d!=%d",num,fact);
	}

}
