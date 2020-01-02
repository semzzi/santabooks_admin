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
	
	@RequestMapping(value = "/admin/novel", method = RequestMethod.POST)
	public String novelCheckDelete(Novel novel, String[] checkRow) {
		
	
		
		for(int i=0; i<checkRow.length; i++) {
			logger.info("야 나와라 진짜 : " + checkRow[i]);
			novel.setNovelNo(Integer.parseInt(checkRow[i]));
			adminService.deleteNovel(novel);
			
			
		}
	return "redirect:/admin/novel";
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
	
	@RequestMapping(value = "/admin/review", method = RequestMethod.POST)
	public String reviewList(ReviewSns reviewSns, String[] checkRow) {
		

		for(int i=0; i<checkRow.length; i++) {
			logger.info("이거슨 피드넘버 받아오는것 ! : " + checkRow[i]);
			reviewSns.setFeedNo((Integer.parseInt(checkRow[i])));
			adminService.deleteNovel(reviewSns);
			
			}
		return "redirect:/admin/review";
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
	
	@RequestMapping(value = "/admin/comment", method = RequestMethod.POST)
	public String commentDelete(Comment comment, String[] checkRow) {
		
		for(int i=0; i<checkRow.length; i++) {
			logger.info("이거슨 코멘트넘 받아오는것 ! : " + checkRow[i]);
			comment.setCommentNo((Integer.parseInt(checkRow[i])));
			adminService.deleteComment(comment);
			
			}
		return "redirect:/admin/comment";
				
	}
}
