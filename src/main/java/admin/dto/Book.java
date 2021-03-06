package admin.dto;

public class Book {
	private int bookNo;
	private int genreNo;
	private String bookName;
	private String bookWriter;
	private String bookPublisher;
	private String publishingYear;
	private String bookContent;
	private String genreName;
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", genreNo=" + genreNo + ", bookName=" + bookName + ", bookWriter="
				+ bookWriter + ", bookPublisher=" + bookPublisher + ", publishingYear=" + publishingYear
				+ ", bookContent=" + bookContent + ", genreName=" + genreName + "]";
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public int getGenreNo() {
		return genreNo;
	}

	public void setGenreNo(int genreNo) {
		this.genreNo = genreNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(String publishingYear) {
		this.publishingYear = publishingYear;
	}

	public String getBookContent() {
		return bookContent;
	}

	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	} 
	
}
