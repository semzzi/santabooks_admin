package admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.dao.face.AdminDao;
import admin.dto.Admin;
import admin.dto.Comment;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.service.face.AdminService;
import admin.util.Paging;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminDao adminDao;

	// 관리자 로그인 서비스 ---------------------------------
	@Override
	public boolean login(Admin admin) {
	if(adminDao.selectLoginCnt(admin) >= 1) {
		return true;
	}
		return false;
	}
	
	// 멤버 관리 서비스 -------------------------------------

	@Override
	public int selectCntAll() {
		return adminDao.selectMemberCntAll();
	}

	@Override
	public List<Member> getList(Paging paging) {
		return adminDao.selectMemberAll(paging);
	}

	@Override
	public Member memberInfo(Member member) {
		return adminDao.selectMemberInfo(member);
	}

	@Override
	public List<Novel> novelInfo(Novel novel) {
		return adminDao.selectNovelInfo(novel);
	}

	@Override
	public List<ReviewSns> reviewInfo(ReviewSns review) {
		return adminDao.selectReviewInfo(review);
	}

	@Override
	public List<Comment> commentInfo(Comment comment) {
		return adminDao.selectCommentInfo(comment);
	}
}
