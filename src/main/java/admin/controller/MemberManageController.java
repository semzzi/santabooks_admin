package admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.dto.Comment;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.service.face.AdminService;
import admin.util.Paging;

@Controller
public class MemberManageController {
	
	@Autowired AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberManageController.class);
	
	@RequestMapping(value = "/admin/member/list", method = RequestMethod.GET)
	public void MemberList(Member member, Model model, Paging paging) {
		
		int totalCount = adminService.selectCntAll();
		
		logger.info("토탈카운트 : "+totalCount);
		
		Paging paging2 = new Paging(totalCount, paging.getCurPage());
		List<Member> boardList = adminService.getList(paging2);
		
		logger.info("페이징  : "+paging2);
		model.addAttribute("paging", paging2);
		model.addAttribute("list", boardList);
		
	}
	
	@RequestMapping(value = "/admin/member/view", method = RequestMethod.GET)
	public void MemberView(Member member, Model model, Novel novel,
						   ReviewSns review, Comment comment) {
		
		member = adminService.memberInfo(member);
		List<Novel> novelList = adminService.novelInfo(novel);
		List<ReviewSns> reviewList = adminService.reviewInfo(review);
		List<Comment> commentList = adminService.commentInfo(comment);
		
		logger.info("멤버넘?? :" + member );
		logger.info("멤버넘?? 모델 :" + model );	
		
		model.addAttribute("member", member);
		model.addAttribute("novelList", novelList);
		model.addAttribute("reviewList", reviewList);
		model.addAttribute("commentList", commentList);
		
		
		
		
	}
}
