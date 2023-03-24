package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		// 차원 배열
		
		int [][] score=new int[4][3];
		int[] score2[]=new int[2][3];
		int score3[][]=new int[5][2];
		
		// [행번호][열번호]
		System.out.println(score2[0][0]);
		System.out.println(score2[1][2]);
		
		//2차원일때 길이는 행길이를 뜨함
		System.out.println("길이"+score2.length); //행길이//
		System.out.println("길이"+score2[0].length); //열길이
		
		for (int i = 0; i < score3.length; i++) {
			for (int j = 0; j < score2.length; j++) {
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.println();
		}
			//2차원 배열 선언, 생성, 초기화
			int[] score4[]= {
					{10,11,12},
					{20,21,22}
			};
			//향상된 for 2차원 배열 접근
			for(int arr[]:score4) {
				for(int j:arr) {
					System.out.printf("%d\t",j);
				}
				System.out.println();
			}
		}
	}

