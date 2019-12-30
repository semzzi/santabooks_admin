package admin.dao.face;

import java.util.List;

import admin.dto.Admin;
import admin.dto.Comment;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.util.Paging;

public interface AdminDao {


	/**
	 * 로그인 아이디, 패스워드 일치하는 관리자 수 구하기
	 * @param admin - 로그인 아이디, 패스워드
	 * @return int - 일치하는 유저 수
	 */
	public int selectLoginCnt(Admin admin);

	/**
	 * 리스트 불러오기 위한 사용자 전체 count하기
	 * @return int - 회원가입 되어있는 사용자 수
	 */
	public int selectMemberCntAll();
	
	/**
	 * 리스트 불러오기 위한 작성한 웹소설 전체 count하기
	 * @param novel - memberNo으로 조회하기위한 정보가 담겨있는 객체
	 * @return int - 한 회원이 작성한 웹소설 전체 count
	 */
	public int selectNovelCntAll(Novel novel);

	/**
	 * 회원가입 되어있는 모든 사용자의 리스트 불러오기
	 * 
	 * @param paging - Paging 객체
	 * @return List<Member> - 사용자 리스트
	 */
	public List<Member> selectMemberAll(Paging paging);
	
	/**
	 * 회원 상세 정보 가져오기 
	 * @param member - 멤버  넘버 객체 정보
	 * @return Member - SELECT 해 온 회원 정보가 저장될 객체
	 */
	public Member selectMemberInfo(Member member);

	/**
	 * 작성한 웹소설 정보 가져오기
	 * @param paging - 멤버 넘버 정보가 있는 객체
	 * @return List<novel> - SELECT 해 온 웹소설 정보가 저장될 객체
	 */
	public List<Novel> selectNovelInfo(Novel novel);

	/**
	 * 작성한 리뷰 정보 가져오기
	 * @param review - 멤버 넘버 정보가 있는 객체
	 * @return List<ReviewSns> - SELECT 해 온 리뷰 정보가 저장될 객체 
	 */
	public List<ReviewSns> selectReviewInfo(ReviewSns review);

	/**
	 * 작성한 댓글 정보 가져오기
	 * 
	 * @param comment - 멤버 넘버 정보가 있는 객체
	 * @return List<Comment> - 저장할 객체
	 */
	public List<Comment> selectCommentInfo(Comment comment);


}
