package admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.dto.Admin;
import admin.dto.Book;
import admin.dto.Episode;
import admin.dto.Member;
import admin.dto.Novel;
import admin.service.face.AdminService;

@Controller
public class AdminLoginController {
	
	@Autowired AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(AdminLoginController.class);
	
	@RequestMapping(value = "/admin/login", method=RequestMethod.GET)
	public void mainLogin() {
		
	}

	@RequestMapping(value = "/admin/login", method=RequestMethod.POST)
	public String mainLoginProc(Admin admin, HttpSession session) {
		
		boolean isLogin = adminService.login(admin);
		
		if(isLogin) {
			//세션에 정보 저장
			session.setAttribute("login", isLogin);
			session.setAttribute("loginid", admin.getAdminId()); 
			return "redirect:/admin/main";
		}
		
		return "redirect:/admin/login";
			
	}
	
	@RequestMapping(value="/admin/logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/admin/login";
	}
	
	@RequestMapping(value = "/admin/main", method=RequestMethod.GET)
	public void main(Model model, Member member, Novel novel, Episode episode, Book book) {
		
		List<Member> topMemberList = adminService.latestMember();
		List<Book> topBookList = adminService.latestBook();
		
		model.addAttribute("memberList", topMemberList);
		model.addAttribute("bookList", topBookList);
	}
}
