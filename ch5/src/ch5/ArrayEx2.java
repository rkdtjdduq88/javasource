package ch5;

import java.util.Arrays;
import java.util.Iterator;

/* 기본타입-byte,char,short,int,long,float,double,boolean
 * 참조타입-String(클래스),배열
 * 
 */

public class ArrayEx2 {

	public static void main(String[] args) {
		int score[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10;
		}
		
		System.out.println(score);
		System.out.println(Arrays.toString(score)); //단순 확인용
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		System.out.println();
		
		//향상된 for문
		for(int i:score) {
			System.out.println(i);
		}
	
		int iArr2[]=new int[10];
		//1~10임의의 숫자 생성해서 배열에 저장
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
	//출력
		System.out.println(Arrays.toString(iArr2));
		
		char charr[]= {'a','b','가','나','ㅌ'};
		System.out.println(charr);
		String str[]= {"봄","여름","가을","겨울","봄"};
		System.out.println(str);
	}

}












