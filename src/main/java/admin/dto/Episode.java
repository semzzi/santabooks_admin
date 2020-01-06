package admin.dto;

public class Episode {
	private int episodeNo;
	private int novelNo;
	private String title;
	private String content;
	private int score;
	private String addDate;
	private String memberName;
	
	@Override
	public String toString() {
		return "Episode [episodeNo=" + episodeNo + ", novelNo=" + novelNo + ", title=" + title + ", content=" + content
				+ ", score=" + score + ", addDate=" + addDate + ", memberName=" + memberName + "]";
	}

	public int getEpisodeNo() {
		return episodeNo;
	}

	public void setEpisodeNo(int episodeNo) {
		this.episodeNo = episodeNo;
	}

	public int getNovelNo() {
		return novelNo;
	}

	public void setNovelNo(int novelNo) {
		this.novelNo = novelNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
}
