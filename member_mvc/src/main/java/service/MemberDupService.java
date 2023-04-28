package service;

import persistence.MemberDAO;

public class MemberDupService {
	public boolean dupId(String userid) {
		MemberDAO dao = new MemberDAO();
		return dao.duplicateId(userid);
	}
}
