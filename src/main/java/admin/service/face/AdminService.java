package admin.service.face;


import java.util.List;

import admin.dto.Admin;
import admin.dto.Book;
import admin.dto.Comment;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.util.Paging;

public interface AdminService {
	
	/**
	 * 로그인 아이디, 패스워드 일치 여부 확인
	 * 
	 * @param admin - 요청받은 admin 객체
	 * @return boolean : true - 아이디 패스워드 일치, false - 아이디 패스워드 불일치
	 */
	public boolean login(Admin admin);

	/**
	 * 페이징 처리를 위한 페이지 totalCount 가져오기
	 * @param keyword - 검색 조건
	 * @param searchType - 검색 타입
	 * 
	 * @return int - totalCount 수
	 */
	public int selectCntAll(Paging paging);

	/**
	 * Paging을 이용한 memberList 가져오기, searchType:검색조건 keword:검색어
	 * 
	 * @param paging- 페이징 객체
	 * @return List<Board> - Member테이블 리스트
	 */
	public List<Member> getList(Paging paging);

	/**
	 * memberNo을 이용한 멤버 정보 가져오기
	 * 
	 * @param member - memberNo정보가 들어있는 객체
	 * @return Member - member정보가 저장될 객체
	 */
	public Member memberInfo(Member member);
	
	/**
	 * memberNo을 이용한 작성한 웹소설 가져오기
	 * 
	 * @param paging2 - memberNo정보가 들어있는 객체
	 * @return List<Novel> - 가져온 정보를 리스트로 저장할 novel객체
	 */
	public List<Novel> novelInfo(Novel novel);

	/**
	 * memberNo을 이용한 작성한 리뷰 가져오기
	 * 
	 * @param paging2 - memberNo정보가 들어있는 객체
	 * @return List<ReviewSns> - 가져온 정보를 리스트로 저장할 ReviewSns객체
	 */
	public List<ReviewSns> reviewInfo(ReviewSns review);

	/**
	 * memberNo을 이용한 작성한 댓글 가져오기
	 * 
	 * @param comment memberNo정보가 들어있는 객체
	 * @return List<Comment> - 가져온 정보를 리스트로 저장할 Comment객체
	 */
	public List<Comment> commentInfo(Comment comment);

	/**
	 * Paging을 이용한 NovelList 가져오기
	 * 
	 * @param paging- 페이징 객체
	 * @return Novel - Novel테이블 리스트
	 */
	public List<Novel> novelList(Paging paging);

	/**
	 * Paging을 이용한 reviewList 가져오기
	 * 
	 * @param paging- 페이징 객체
	 * @return ReviewSns - ReviewSns테이블 리스트
	 */
	public List<ReviewSns> reviewList(Paging paging);

	/**
	 * Paging을 이용한 commentList 가져오기
	 * 
	 * @param paging- 페이징 객체
	 * @return Comment - comment테이블 리스트
	 */
	public List<Comment> commentList(Paging paging);

	/**
	 * 웹소설관리 페이징 처리를 위한 페이지 totalCount 가져오기
	 * @param Paging - 검색 조건 전달 , searchType:검색조건 keword:검색어
	 * 
	 * @return int - totalCount 수
	 */
	public int novelCntAll(Paging paging);

	/**
	 * 리뷰관리 페이징 처리를 위한 페이지 totalCount 가져오기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * 
	 * @return int - totalCount 수
	 */
	public int reviewCntAll(Paging paging);

	/**
	 * 댓글관리 페이징 처리를 위한 페이지 totalCount 가져오기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * 
	 * @return int - totalCount 수
	 */
	public int commentCntAll(Paging paging);

	/**
	 * 회원 탈퇴를 위한 메소드
	 * @param member - 멤버 DTO
	 */
	public void withDrawalMember(Member member);

	/**
	 * 웹소설 삭제를 위한 메소드
	 * @param novel - novelNo이 담겨있는 DTO
	 */
	public void deleteNovel(Novel novel);

	/**
	 * 리뷰 삭제를 위한 메소드
	 * @param ReviewSns - feedNo이 담겨있는 DTO
	 */
	public void deleteNovel(ReviewSns reviewSns);

	/**
	 * 댓글 삭제를 위한 메소드
	 * 
	 * @param comment - commentNo이 담겨있는 DTO
	 */
	public void deleteComment(Comment comment);

	/**
	 * 도서 관리를 위한 리스트 가져오기
	 * @param paging - 페이징 객체
	 * @return Book - 도서 DTO
	 */
	public List<Book> bookList(Paging paging);

	/**
	 * 도서관리 페이징 처리를 위한 페이지 totalCount 가져오기
	 * @param Paging - 검색 조건 전달, searchType:검색조건 keword:검색어
	 * 
	 * @return int - totalCount 수
	 */
	public int bookCntAll(Paging paging);

	/**
	 * 도서번호로 상세페이지에 나올 정보들 가져오기 
	 * @param book - bookNo이 담겨있는 book DTO
	 * @return Book - 정보를 저장할 book DTO
	 */
	public Book getBookInfo(Book book);

	/**
	 * 장르 이름 가져오기
	 * @return Book - book DTO
	 */
	public List<Book> getGenreName();

	
}
