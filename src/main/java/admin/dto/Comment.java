package admin.dto;

public class Comment {
	
	private int commentNo;
	private int memberNo;
	private String content;
	private String addDate;
	
	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", memberNo=" + memberNo + ", content=" + content + ", addDate="
				+ addDate + "]";
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
	
	
}
