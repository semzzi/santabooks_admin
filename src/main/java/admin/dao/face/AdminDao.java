package admin.dao.face;

import java.util.List;

import admin.dto.Admin;
import admin.dto.Book;
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
	 * @param keyword - 검색 입력
	 * @param searchType - 검색 타입
	 * @return int - 회원가입 되어있는 사용자 수
	 */
	public int selectMemberCntAll(Paging paging);
	
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

	/**
	 * 웹소설 전체 리스트 가져오기
	 * 
	 * @param paging - 페이징 객체
	 * @return Novel - 웹소설 DTO
	 */
	public List<Novel> selectNovelList(Paging paging);

	/**
	 * 리뷰 전체 리스트 가져오기
	 * 
	 * @param paging - 페이징 객체
	 * @return Novel - 리뷰 DTO
	 */
	public List<ReviewSns> selectReviewList(Paging paging);

	/**
	 * 댓글 전체 리스트 가져오기
	 * 
	 * @param paging - 페이징 객체
	 * @return Comment - 댓글 DTO
	 */
	public List<Comment> selectCommentList(Paging paging);

	/**
	 * 웹소설 리스트 불러오기 위한 웹소설 전체 count하기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * @return int - 등록된 웹소설 수
	 */
	public int selectNovelCntAll(Paging paging);
	
	/**
	 * 리뷰 리스트 불러오기 위한 리뷰 전체 count하기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * @return int - 등록된 리뷰 수
	 */
	public int selectReviewCntAll(Paging paging);

	/**
	 * 댓글 리스트 불러오기 위한 리뷰 전체 count하기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * @return int - 등록된 댓글 수
	 */
	public int selectCommentCntAll(Paging paging);

	/**
	 * 멤버 삭제를 위한 delete 메소드
	 * @param member - 멤버 DTO
	 */
	public void deleteMember(Member member);

	/**
	 * 웹소설 삭제를 위한 delete 메소드
	 * @param novel - 웹소설 DTO
	 */
	public void deleteNovel(Novel novel);

	/**
	 * 리뷰 삭제를 위한 delete 메소드
	 * @param reviewSns - 리뷰 DTO
	 */
	public void deleteReview(ReviewSns reviewSns);

	/**
	 * 댓글 삭제를 위한 delete 메소드
	 * @param comment - 댓글 DTO
	 */
	public void deleteComment(Comment comment);

	/**
	 * 도서 리스트 얻어오기 위한 select
	 * @param paging - 페이징 객체
	 * @return Book - 도서 DTO
	 */
	public List<Book> selectBookAll(Paging paging);

	/**
	 * 도서관리 리스트 불러오기 위한 리뷰 전체 count하기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * @return int - 등록된 도서 수
	 */
	public int selectBookCntAll(Paging paging);

	/**
	 * 도서번호로 책 정보 select 해오기
	 * @param book - bookNo이 저장된 book DTO 객체 
	 * @return Book - 정보저장할 book DTO
	 */
	public Book selectBookByNo(Book book);

	/**
	 * 도서 정보 작성시 장르 띄워주기위해 select
	 * @return Book - Book DTO
	 */
	public List<Book> selectBookName();


}
