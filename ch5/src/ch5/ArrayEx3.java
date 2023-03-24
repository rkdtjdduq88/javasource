package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {

		//대괄호 위치는 타입다음 또는 배열명 다음에 와도 된다
		//대괄호 하나는 [] : 1차원 배열
		//대괄호 두개는 [][] : 2차원 배열 (행, 열)
		int[] score= {100,88,100,100,90}; 
		
		//배열 총합과 평균
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		// int/int 는 몫만 나오는 연산이 됨==>478/5=95
		// 478/5.0=95.6
		average=sum/(float)score.length;
		
		System.out.println("총합:"+sum);
		System.out.println("평균:"+average);

	
	
	}

}

















