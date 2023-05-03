package board.service;

import board.persistence.BoardDAO;

public class BoardDeleteService {
	public boolean delete(int bno, String password) {
		return new BoardDAO().deleteArticle(bno,password);
	}
}
