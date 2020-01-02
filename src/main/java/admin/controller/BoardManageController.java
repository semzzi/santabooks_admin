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

import admin.dto.Comment;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.service.face.AdminService;
import admin.util.Paging;

@Controller
public class BoardManageController {
	
	@Autowired AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardManageController.class);
	
	@RequestMapping(value = "/admin/novel", method = RequestMethod.GET)
	public void novelList(Member member, Model model, Paging paging,
			@RequestParam(defaultValue = "title") String searchType,
			@RequestParam(defaultValue = "") String keyword) {
			
		
		int totalCount = adminService.novelCntAll(paging);
			
		logger.info("토탈카운트 : "+totalCount);
			
		Paging paging2 = new Paging(totalCount, paging.getCurPage());
		paging2.setKeyword(keyword);
		paging2.setSearchType(searchType);
//		logger.info("@@@keyword : " + paging2.getKeyword());
//		logger.info("@@@searchType : " + paging2.getSearchType());
		List<Novel> novelList = adminService.novelList(paging2);

			
//		logger.info("페이징2  : "+paging2);
		logger.info("노벨리스트!!  : "+novelList);
			
		model.addAttribute("paging", paging2);
		model.addAttribute("list", novelList);		
	}
	
	@RequestMapping(value = "/admin/review", method = RequestMethod.GET)
	public void reviewList(Member member, Model model, Paging paging,
			@RequestParam(defaultValue = "title") String searchType,
			@RequestParam(defaultValue = "") String keyword) {
			
		
		int totalCount = adminService.reviewCntAll(paging);
			
		logger.info("토탈카운트 : "+totalCount);
			
		Paging paging2 = new Paging(totalCount, paging.getCurPage());
		paging2.setKeyword(keyword);
		paging2.setSearchType(searchType);
//		logger.info("@@@keyword : " + paging2.getKeyword());
//		logger.info("@@@searchType : " + paging2.getSearchType());
		List<ReviewSns> reviewList = adminService.reviewList(paging2);

			
//		logger.info("페이징2  : "+paging2);
		logger.info("노벨리스트!!  : "+reviewList);
		
		model.addAttribute("paging", paging2);
		model.addAttribute("list", reviewList);		
		}
	
	
	@RequestMapping(value = "/admin/comment", method = RequestMethod.GET)
	public void commentList(Member member, Model model, Paging paging,
			@RequestParam(defaultValue = "title") String searchType,
			@RequestParam(defaultValue = "") String keyword) {
		
		
		int totalCount = adminService.commentCntAll(paging);
		
		logger.info("토탈카운트 : "+totalCount);
		
		Paging paging2 = new Paging(totalCount, paging.getCurPage());
		paging2.setKeyword(keyword);
		paging2.setSearchType(searchType);
//		logger.info("@@@keyword : " + paging2.getKeyword());
//		logger.info("@@@searchType : " + paging2.getSearchType());
		List<Comment> commentList = adminService.commentList(paging2);
		
		
//		logger.info("페이징2  : "+paging2);
		logger.info("노벨리스트!!  : "+commentList);
		
		model.addAttribute("paging", paging2);
		model.addAttribute("list", commentList);		
	}
}
