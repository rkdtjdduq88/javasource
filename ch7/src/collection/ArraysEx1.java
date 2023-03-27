package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  Arrays 클래스
 *  - 배열을 다루는 데 유용한 메소드가 정의되어 있음
 *  - 모든 메소드는 static 임
 *  
 */


public class ArraysEx1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		// toString() : 배열의 요소를 문자열로 출력
		System.out.println(arr); // [I@4361bd48
		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
		
	    // deepToString() : 2차원 배열의 요소를 문자열로 출력
		int arr2[][] = {{11,12},{21,22}};
		System.out.println(arr2); // [[I@762efe5d
		System.out.println(Arrays.toString(arr2)); // [[I@5d22bbb7, [I@41a4555e]
		System.out.println(Arrays.deepToString(arr2)); // [[11, 12], [21, 22]]
		
		// equals() : 값비교(두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false)
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"aaa","bbb"};
		System.out.println(Arrays.equals(str1, str2)); //true
		
		// deepEquals() : 2차원 배열 값 비교
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //true
		
		int arr3[] = new int[5];
		// arr 배열을 arr3 복사
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr3)); // [1, 2, 3, 4, 5]
		
		// copyOf(원본배열,복사할 요소 개수)
		int arr4[] = Arrays.copyOf(arr,arr.length); 
		System.out.println(Arrays.toString(arr4)); // [1, 2, 3, 4, 5]
		
		int arr5[] = Arrays.copyOf(arr,3);
		System.out.println(Arrays.toString(arr5)); // [1, 2, 3]
		
		// copyOfRange() : 범위를 정해서 뽑기
		int arr6[] = Arrays.copyOfRange(arr,2,4);
		System.out.println(Arrays.toString(arr6)); // [3, 4]
		
		// fill() : 배열의 모든 요소를 지정된 값으로 채우기
		int arr7[] = new int[5];
		Arrays.fill(arr7, 5); // void 가 return 일 때 메소드 호출만 함.
		System.out.println("arr7 "+Arrays.toString(arr7));
		
		// sort() : 정렬(오름차순 기본임)
		int arr8[] = {3,2,0,1,4};
		Arrays.sort(arr8);
		System.out.println("arr8 "+Arrays.toString(arr8));
		
		// binarySearch() : 이진검색
		// 검색 : 
		// 순차검색 - 차례대로 검색하는 방식
		// 이진검색 - 검색할 범위를 반복적으로 절반씩 줄여나가면서 검색하는 방식
		//         정렬이 필수
		
		// 찾게되면 요소의 위치를 돌려줌
		System.out.println(Arrays.binarySearch(arr8,4)); // 4 (요소의 위치)
		System.out.println(Arrays.binarySearch(arr8,5)); // -6
		
		//asList(T... a) : 배열을 List로 변환
		// T... : 가변인수
		// T : 기본타입이 아니어야 함
		List<Integer> list2 = Arrays.asList(1,2,3,5,6,8);
		//List<Integer> list = Arrays.asList(arr8); //Type mismatch: cannot convert from List<int[]> to List<Integer>
		
		Integer[] arr9 = {15,16,17,18};
		List<Integer> list = Arrays.asList(arr9);
		System.out.println(list);
		//list.add(19); // java.lang.UnsupportedOperationException
		
		// list 크기 변경을 원할 때
		list = new ArrayList<>(Arrays.asList(arr9));
		
	}

}