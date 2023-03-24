package ch6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TvEx2 {

	public static void main(String[] args) {
		//객체 배열 : 많은 수의 객체를 다뤄야 할 때 배열로 처리
		//타입 [] 배열명 = new 타입[개수];
		
		//int형 배열
		//주소말고 값이 나오게 하려면 Arrays.toString(변수명)
		int[] arr=new int[3];
		System.out.println(Arrays.toString(arr));
		
		//초기화
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		System.out.println(Arrays.toString(arr));
		
		//더 간단하게
		int arr2[]= {25,35,45};
		System.out.println(Arrays.toString(arr2));
		
		//객체(클래스) 담아보자
		//참조타입 [] 배열명 = new 타입[개수];
		Tv[] tvArr=new Tv[3];
		System.out.println(tvArr[0]); //null
		System.out.println(tvArr[1]); //null
		System.out.println(tvArr[2]); //null
		
		//초기화
		tvArr[0]=new Tv();
		tvArr[1]=new Tv();
		tvArr[2]=new Tv();
		System.out.println(tvArr[0]);
		System.out.println(tvArr[1]);
		System.out.println(tvArr[2]); 
		
		//간단하게
		//int arr2[]={23.35,45}
		Tv tvArr2[] = {new Tv(),new Tv(), new Tv()};
		System.out.println(tvArr[0].channel);
	}
}