package service;

import java.util.List;

import domain.BookDTO;
import persistence.BookDAO;

public class BookSearchService {
	public List<BookDTO> list(String criteria, String keyword) {
		BookDAO dao = new BookDAO();
		//return dao.getSearchList(writer, title);
		List<BookDTO> list = dao.getSearchList(criteria, keyword);
		return list;
	}
}
