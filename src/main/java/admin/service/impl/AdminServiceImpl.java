package admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin.dao.face.AdminDao;
import admin.dto.Admin;
import admin.dto.Book;
import admin.dto.Comment;
import admin.dto.Episode;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.dto.Subscription;
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
	public int selectCntAll(Paging paging) {
		return adminDao.selectMemberCntAll(paging);
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

	@Override
	public List<Novel> novelList(Paging paging) {
		return adminDao.selectNovelList(paging);
	}

	@Override
	public List<ReviewSns> reviewList(Paging paging) {
		return adminDao.selectReviewList(paging);
	}

	@Override
	public List<Comment> commentList(Paging paging) {
		return adminDao.selectCommentList(paging);
	}

	@Override
	public int novelCntAll(Paging paging) {
		return adminDao.selectNovelCntAll(paging);
	}

	@Override
	public int reviewCntAll(Paging paging) {
		return adminDao.selectReviewCntAll(paging);
	}

	@Override
	public int commentCntAll(Paging paging) {
		return adminDao.selectCommentCntAll(paging);
	}

	@Override
	public void withDrawalMember(Member member) {
		adminDao.deleteMember(member);
	}

	@Override
	public void deleteNovel(Novel novel) {
		adminDao.deleteNovel(novel);
		
	}

	@Override
	public void deleteNovel(ReviewSns reviewSns) {
		adminDao.deleteReview(reviewSns);
		
	}

	@Override
	public void deleteComment(Comment comment) {
		adminDao.deleteComment(comment);
		
	}

	@Override
	public List<Book> bookList(Paging paging) {
		return adminDao.selectBookAll(paging);
	}

	@Override
	public int bookCntAll(Paging paging) {
		return adminDao.selectBookCntAll(paging);
	}

	@Override
	public Book getBookInfo(Book book) {
		return adminDao.selectBookByNo(book);
	}

	@Override
	public List<Book> getGenreName() {
		return adminDao.selectBookName();
	}

	@Override
	public void bookWrite(Book book) {
		adminDao.insertBook(book);
	}

	@Override
	public void bookUpdate(Book book) {
		adminDao.updateBook(book);
		
	}

	@Override
	public void bookDelete(Book book) {
		adminDao.deleteBook(book);
		
	}

	@Override
	public void bookCheckDelete(Book book) {
		adminDao.deleteCheckBook(book);
		
	}

	@Override
	public List<Episode> episodeList(Paging paging) {
		return adminDao.selectEpisodeList(paging);
	}

	@Override
	public Novel novelInfoByNovelNo(Novel novel) {
		return adminDao.selectNovelByNovelNo(novel);
	}

	@Override
	public int episodeCntAll(Paging paging) {
		return adminDao.selectEpisodeCntAll(paging);
	}

	@Override
	public Episode episodeInfo(Episode episode) {
		return adminDao.selectEpisodeInfo(episode);
	}

	@Override
	public void episodeDelete(Episode episode) {
		adminDao.deleteEpisode(episode);
		
	}

	@Override
	public Episode novelNoByEpisodeNo(Episode episode) {
		return adminDao.selectNovelNoByEpisodeNo(episode);
	}

	@Override
	public void deleteCheckEpisode(Episode episode) {
		adminDao.deleteEpisode(episode);
		
	}

	@Override
	public Episode getEpisodeInfo(Episode episode) {
		return adminDao.selectEpisodeInfo(episode);
	}

	@Override
	public void episodeUpdate(Episode episode) {
		adminDao.updateEpisode(episode);
		
	}

	@Override
	public int subMemberCntAll(Paging paging) {
		return adminDao.selectSubMemberCntAll(paging);
	}

	@Override
	public List<Subscription> subMember(Paging paging2) {
		return adminDao.selectSubMemberAll(paging2);
	}

	@Override
	public List<Member> latestMember() {
		return adminDao.selectLatestMember();
	}

	@Override
	public List<Book> latestBook() {
		return adminDao.selectLatestBook();
	}

	@Override
	public List<Novel> latestNovel() {
		return adminDao.selectLatestNovel();
	}

	@Override
	public List<Comment> latestComment() {
		return adminDao.selectLatestComment();
	}

	@Override
	public List<ReviewSns> latestReview() {
		return adminDao.selectLatestReview();
	}
}
