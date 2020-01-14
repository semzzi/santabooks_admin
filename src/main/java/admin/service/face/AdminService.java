package admin.service.face;


import java.util.List;

import admin.dto.Admin;
import admin.dto.Book;
import admin.dto.Comment;
import admin.dto.Episode;
import admin.dto.Member;
import admin.dto.Novel;
import admin.dto.ReviewSns;
import admin.dto.Shipment;
import admin.dto.Subscription;
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

	/**
	 * 입력받은 도서정보 등록하기
	 * @param book - 입력받은 정보
	 */
	public void bookWrite(Book book);

	/**
	 * 도서정보 수정하기
	 * @param book - 입력받은 정보
	 */
	public void bookUpdate(Book book);

	/**
	 * 도서정보 삭제하기
	 * @param book - 전달받은 bookNo이 담긴 객체
	 */
	public void bookDelete(Book book);

	/**
	 * 책 체크삭제
	 * @param book - 전달받은 bookNo
	 */
	public void bookCheckDelete(Book book);

	/**
	 * 웹소설 상세정보에서 에피소드 보이기
	 * @param paging - 페이징 정보를 담은 객체
	 * @return
	 */
	public List<Episode> episodeList(Paging paging);

	/**
	 * novelNo에 맞는 novel 정보 불러오기
	 * @param novel - novelNo이 저장된 DTO
	 * @return Novel - 저장될 DTO
	 */
	public Novel novelInfoByNovelNo(Novel novel);

	/**
	 * 에피소드 카운트
	 * @param paging - 요청정보 전달
	 * @return int - total 수
	 */
	public int episodeCntAll(Paging paging);

	/**
	 * 에피소드 상세정보 불러오기
	 * @param episode - episodeNo을 전달하는 객체
	 * @return Episode - Episode DTO
	 */
	public Episode episodeInfo(Episode episode);

	/**
	 * 에피소드 삭제
	 * @param episode - episodeNo 전달 객체
	 */
	public void episodeDelete(Episode episode);

	/**
	 * 에피소드 넘으로 노벨넘 구하기
	 * @param episode - 에피소드 넘버가 담겨있는 객체
	 * @return Episode - 저장할 객체
	 */
	public Episode novelNoByEpisodeNo(Episode episode);

	/**
	 * 에피소드 체크삭제를 위한 메소드
	 * @param episode - 전달받은 episodeNo이 들어있는 객체
	 */
	public void deleteCheckEpisode(Episode episode);

	/**
	 * episodeNo으로 에피소드 정보 가져오기
	 * @param episode - episodeNo을 전달하는 Episode DTO
	 * @return Episode - 정보를 저장할 DTO
	 */
	public Episode getEpisodeInfo(Episode episode);

	/**
	 * episodeNo으로 에피소드 수정
	 * @param episode - episodeNo
	 */
	public void episodeUpdate(Episode episode);

	/**
	 * subCheck = '구독중'인 member 수 구하기메소드
	 * @param paging - 전달할 변수
	 * @return int - '구독중'인 member 수
	 */
	public int subMemberCntAll(Paging paging);

	/**
	 * 구독중인 멤버 리스트
	 * @param paging2 - 요청값
	 * @return Subscription - Subscription DTO
	 */
	public List<Subscription> subMember(Paging paging2);

	/**
	 * 메인에 내타낼 최신 5개 리스트 (Member)
	 * @return Member - Member DTO
	 */
	public List<Member> latestMember();

	/**
	 * 메인에 나타낼 최신 5개 리스트 (Book)
	 * @return Book - Book DTO
	 */
	public List<Book> latestBook();

	/**
	 * 메인에 나타낼 최신 5개 리스트(Novel)
	 * @return Novel - Novel DTO
	 */
	public List<Novel> latestNovel();

	/**
	 * 메인에 나타낼 최신 5개 리스트(Comment)
	 * @return Comment - Comment DTO
	 */
	public List<Comment> latestComment();

	/**
	 * 메인에 나타낼 최신 5개 리스트(ReviewSns)
	 * @return Comment - ReviewSns DTO
	 */
	public List<ReviewSns> latestReview();

	/**
	 * 배송을 위한 member의 장르 번호 조회
	 * @param member - memberNo이 담겨있는 DTO
	 * @return Member - 멤버 장르 조회 값
	 */
	public Member getGenre(Member member);

	/**
	 * 멤버가 선택한 장르에 맞는 book 조회
	 * @param member - genreNo
	 * @return Book - genre에 맞는 BookNo
	 */
	public Book getBookGenreNo(Member member);

	/**
	 * 배송 정보 삽입
	 * @param shipment - 배송 정보
	 */
	public void insertShipmentInfo(Shipment shipment);

	/**
	 * 배송했는지 확인
	 * 
	 * @param paging
	 * @return
	 */
	public List<Shipment> checkShipment(Paging paging);

	/**
	 * 웹소설 수정
	 * @param novel - novelNo
	 * @return Novel - 
	 */
	public void getNovelInfo(Novel novel);

	/**
	 * 멤버별 배송 정보 조회
	 * @param shipment - memberNo
	 * @return Shipment - 저장 DTO
	 */
	public List<Shipment> shipmentInfo(Shipment shipment);

	/**
	 * 댓글의 답글 리스트 보여주기
	 * @param comment - commentNo
	 * @return Comment - 리스트 
	 */
	public List<Comment> getReply(Comment comment);


}
