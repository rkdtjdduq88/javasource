package ch3;

import java.util.Scanner;

/* 조건문
 * 조건식과 실행될 하나의 문장 또는 블럭으로 구성됨
 * 종류 : if(주로 사용), swirch
 * 
 * 
 * 1. if
 * 1) if
 * 2) if~else
 * 3) if~else if
 * 
 */
public class IfEx2 {

	public static void main(String[] args) {
        
				
		int jumsu=70;
		//지역변수 초기화 후 사용
		char grade=' ';         // char : 무조건 문자 한개
		if(jumsu>=90) {
			grade='A';
		}else if(jumsu>=80) {
			grade='B';
		}else if(jumsu>=70) {
			grade='C';
		}else if(jumsu>=60) {
			grade='D';
		}else if(jumsu>=50) {
			grade='E';
		}else { //0~49
			grade='f';
		}
		System.out.printf("점수 : %d, 등급 : %c\n",jumsu,grade);
		

	
	}
}
