package ch6;

public class Member {

	//아이디 userid Ex)hong123
	//비밀번호 password Ex)hong123@!
	//비밀번호확인 confirmPassword Ex)hong123@!
	//전화번호 hp Ex)01012341234
	//주소 address ex)서울
	
	String userid;
	String password;
	String confirmPassword;
	String hp;
	String address;
	
	
	public Member(String userid, String password, String confirmPassword, String hp, String address) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}

	
	 public Member(String userid, String password, String confirmPassword, String hp) {
		super();
		this.userid = userid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}

	 boolean passwordAndConfirmPasswordEquals() {
		 return password.equals(confirmPassword);
	 }

	
}
			

