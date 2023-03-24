package ch5;

public class ArrayEx7 {

	// String : char배열에 기능을 추가한 개념
	
	
	public static void main(String[] args) {
			
		System.out.println(args[0]);
		
		String name[]=new String[3];
		//String:class, 대문자로 시작, 참조타입
		
//		System.out.println(name[0]); //null
	
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//초기화
		name[0]="kim";
		name[1]="park";
		name[2]="yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));

		String str="ABCDE";
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//문자열(String) 비교시 ==, !=을 사용하지 않고,
		//equals():대소문자 포함 비교, equalsIgnoreCase():대소문자 무시하고 비교
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		//3항연산자
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		//if로 
		if (str.equals("abcde")) {
			System.out.println("일치함");
		} else {
			System.out.println("일치하지않음");

		}
	
	}
}
