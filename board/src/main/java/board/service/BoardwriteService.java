package board.service;

import board.domain.BoardDTO;
import board.persistence.BoardDAO;

public class BoardwriteService {
	public boolean insert(BoardDTO boardDto) {
//		BoardDAO dao = new BoardDAO();
//		return dao.insertArticle(boardDto);
		
		return new BoardDAO().insertArticle(boardDto);
	}
}
