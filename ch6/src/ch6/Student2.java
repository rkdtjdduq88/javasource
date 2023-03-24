package ch6;

public class Student2 {
	//학생이름 name 홍길동
	//반 ban 1.2.3.4
	//번호 no 1.2.3.4
	//국어점수 kor 78
	//영어점수 eng 65
	//수학점수 math 65

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
		
	
	public Student2(String name, int ban, int no) {
		super();
	
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		
		this(name,ban,no);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal(){
		//총계
		return this.kor+this.eng+this.math;
		
	}
	
	double getAverage(){
		//평균
		return getTotal() / 3.0;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
	
//	String info(){
//		//국어+영어+수학
//		int sum=kor+eng+this.math;
//		double avg=(double)sum/3;
//		
//		return name+","+ban+","+no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//	}

}
