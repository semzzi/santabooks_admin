package admin.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import admin.dto.Book;
import admin.service.face.AdminService;
import admin.util.Paging;

@Controller
public class BookManageController {
	
	@Autowired AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(BookManageController.class);
	
	@RequestMapping(value = "/admin/book/list", method=RequestMethod.GET)
	public void bookList(Book book, Paging paging, Model model,
			@RequestParam(defaultValue = "title") String searchType,
			@RequestParam(defaultValue = "") String keyword) {
		
		int totalCount = adminService.bookCntAll(paging);
		
		logger.info("토탈카운트 : "+totalCount);
		
		Paging paging2 = new Paging(totalCount, paging.getCurPage());
		paging2.setKeyword(keyword);
		paging2.setSearchType(searchType);
//		logger.info("@@@keyword : " + paging2.getKeyword());
//		logger.info("@@@searchType : " + paging2.getSearchType());
		List<Book> bookList = adminService.bookList(paging2);
		
		
//		logger.info("페이징2  : "+paging2);
		logger.info("노벨리스트!!  : "+bookList);
		
		model.addAttribute("paging", paging2);
		model.addAttribute("list", bookList);		
		
	}
	
	@RequestMapping(value = "/admin/book/view", method=RequestMethod.GET)
	public void bookList(Book book, Model model) {
		
		
		book = adminService.getBookInfo(book);
		
		logger.info("책!!!! :" + book.toString());
		model.addAttribute("book", book);
	}
	
	@RequestMapping(value = "/admin/book/write", method=RequestMethod.GET)
	public void bookWrite(Book book, Model model) {
	
		List<Book> bookList= adminService.getGenreName();
		
		logger.info("북장르!!!!!!!!!!! :" + bookList);
		model.addAttribute("book", bookList);
	}
	
	@RequestMapping(value = "/admin/book/write", method=RequestMethod.POST)
	public String bookWriteProc(Book book, Model model) {
		
		
		return "redirect:/admin/book/list";
	}

}
