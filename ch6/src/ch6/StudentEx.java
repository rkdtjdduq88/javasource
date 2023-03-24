package ch6;

public class StudentEx {
	public static void main(String[] args) {
		Student stu=new Student("홍길동",1,1,100,60,76);
		
		String msg=stu.info();
		System.out.println(msg);
		//msg 출력시
		//홍길동,1,1,100,60,76, 점수합계, 평균
		
		System.out.println("stu "+stu); //ch6.Student@5aaa6d82 (주소)
		//generate toString 하면
		//Student [name=홍길동, ban=1, no=1, kor=100, eng=60, math=76]
		
		//Student2 객체 생성
		Student2 stu2=new Student2("성춘향",1,2,78,89,65);
		
		
		System.out.println("이름:"+stu2.name);
		System.out.println("총점:"+stu2.getTotal());
		System.out.println("평균:"+stu2.getAverage());
		
		System.out.println("stu2 "+stu2);
		}

}
