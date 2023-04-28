package service;

import persistence.MemberDAO;

public class MemberRegisterService {
	public boolean memberInsert(String userid, String password, String name, String gender, String email) {
		MemberDAO dao = new MemberDAO();
		return dao.register(userid, password, name, gender, email);
	}
}
