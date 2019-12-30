package admin.dto;

public class ReviewSns {
	
	private int feedNo;
	private int memberNo;
	private int bookNo;
	private String review;
	private int privacy;
	private String reviewDate;
	private String bookName;
	 
	@Override
	public String toString() {
		return "review_sns [bookNo=" + bookNo + ", feedNo=" + feedNo + ", memberNo=" + memberNo + ", privacy=" + privacy
				+ ", review=" + review + ", reviewDate=" + reviewDate + ", bookName=" + bookName + "]";
	}

	public int getFeedNo() {
		return feedNo;
	}

	public void setFeedNo(int feedNo) {
		this.feedNo = feedNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getPrivacy() {
		return privacy;
	}

	public void setPrivacy(int privacy) {
		this.privacy = privacy;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
