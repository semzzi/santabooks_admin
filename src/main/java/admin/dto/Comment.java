package admin.dto;

public class Comment {
	
	private int commentNo;
	private int memberNo;
	private String content;
	private String addDate;
	private String memberId;
	private String memberName;
	
	@Override
	public String toString() {
		return "Comment [addDate=" + addDate + ", commentNo=" + commentNo + ", content=" + content + ", memberId="
				+ memberId + ", memberName=" + memberName + ", memberNo=" + memberNo + "]";
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
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
