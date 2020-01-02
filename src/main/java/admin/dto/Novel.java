package admin.dto;

public class Novel {
	
	private int novelNo;
	private int memberNo;
	private String title;
	private String discription;
	private int score;
	private String addDate;
	private int category;
	private String memberId;
	private String memberName;
	
	@Override
	public String toString() {
		return "Novel [novelNo=" + novelNo + ", memberNo=" + memberNo + ", title=" + title + ", discription="
				+ discription + ", score=" + score + ", addDate=" + addDate + ", category=" + category + ", memberId="
				+ memberId + ", memberName=" + memberName + "]";
	}

	public int getNovelNo() {
		return novelNo;
	}

	public void setNovelNo(int novelNo) {
		this.novelNo = novelNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}