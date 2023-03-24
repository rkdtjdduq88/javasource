package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		//배열을 이용한 최대값과 최소값 구하기
		
		int score[]= {79,88,91,33,100,55,95};
		
		//최대값과 최소값
		
		int max=score[0];
		int min=score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대:"+max);
		System.out.println("최소:"+min);
	}
}