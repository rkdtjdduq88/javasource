package ch6;

import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		// Student2 인스턴스 생성
		// 사용자로부터 입력을 받은 정보를 가지고 생성
		
		Scanner sc = new Scanner(System.in);
		
//		// 이름,반,번호,국어,영어,수학 점수 입력받기
//		System.out.print("이름 >> ");
//		String name = sc.nextLine();
//		
//		System.out.println("반 >> ");
//		int ban = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("번호 >> ");
//		int no = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("국어 >> ");
//		int kor = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("영어 >> ");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("수학 >> ");
//		int math = Integer.parseInt(sc.nextLine());
//				
//				
//		
//		Student2 student = new Student2(name, ban, no, kor, eng, math);		
//		//주소 ==> 인스턴스변수가 가지고 있는 값으로 출력(toString())
//		System.out.println(student);
		
		// 입력값으로 Student2 인스턴스를 3개 생성
        Student2 student[] = new Student2[3];
        
        for (int i = 0; i < student.length; i++) {
        	System.out.print("이름 >> ");
    		String name = sc.nextLine();
    		
    		System.out.println("반 >> ");
    		int ban = Integer.parseInt(sc.nextLine());
    		
    		System.out.println("번호 >> ");
    		int no = Integer.parseInt(sc.nextLine());
    		
    		System.out.println("국어 >> ");
    		int kor = Integer.parseInt(sc.nextLine());
    		
    		System.out.println("영어 >> ");
    		int eng = Integer.parseInt(sc.nextLine());
    		
    		System.out.println("수학 >> ");
    		int math = Integer.parseInt(sc.nextLine());
    				
    		student[i] = new Student2(name, ban, no, kor, eng, math);
    		System.out.println("-------------------------------------------");
		}
        
        for (int i = 0; i < student.length; i++) {
        	System.out.println(student[i]);
			
		}
        //향상된 for문 적용
        for(Student2 stu:student) {
        	System.out.println(stu);
        }
        //향상된 for
        int arr[] = new int[3];
        for(int num:arr) { //arr[i]를 꺼내올 때 num이라는 변수에 담아줌
        	System.out.println(num);
        	
        }
	}

}
