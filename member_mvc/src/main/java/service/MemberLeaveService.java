package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean leave(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		return dao.delect(dto);
	}	
}
