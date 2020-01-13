package admin.dto;

public class Shipment {
	private String shipmentDate;
	private int shipNo;
	private int memberNo;
	private int bookNo;
	private int subNo;
	private int checkShipment;
	private String subDate;
	private String subTel;
	private String subTerm;
	private String subPay;
	private String postCode;
	private String roadAddress;
	private String jibunAddress;
	private String detailAddress;
	private String extraAddress;
	private String bookName;
	private String memberName;
	
	@Override
	public String toString() {
		return "Shipment [shipmentDate=" + shipmentDate + ", shipNo=" + shipNo + ", memberNo=" + memberNo + ", bookNo="
				+ bookNo + ", subNo=" + subNo + ", checkShipment=" + checkShipment + ", subDate=" + subDate
				+ ", subTel=" + subTel + ", subTerm=" + subTerm + ", subPay=" + subPay + ", postCode=" + postCode
				+ ", roadAddress=" + roadAddress + ", jibunAddress=" + jibunAddress + ", detailAddress=" + detailAddress
				+ ", extraAddress=" + extraAddress + ", bookName=" + bookName + ",memberName" + memberName + "]";
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public int getShipNo() {
		return shipNo;
	}

	public void setShipNo(int shipNo) {
		this.shipNo = shipNo;
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

	public int getSubNo() {
		return subNo;
	}

	public void setSubNo(int subNo) {
		this.subNo = subNo;
	}

	public int getCheckShipment() {
		return checkShipment;
	}

	public void setCheckShipment(int checkShipment) {
		this.checkShipment = checkShipment;
	}

	public String getSubDate() {
		return subDate;
	}

	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}

	public String getSubTel() {
		return subTel;
	}

	public void setSubTel(String subTel) {
		this.subTel = subTel;
	}

	public String getSubTerm() {
		return subTerm;
	}

	public void setSubTerm(String subTerm) {
		this.subTerm = subTerm;
	}

	public String getSubPay() {
		return subPay;
	}

	public void setSubPay(String subPay) {
		this.subPay = subPay;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getRoadAddress() {
		return roadAddress;
	}

	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}

	public String getJibunAddress() {
		return jibunAddress;
	}

	public void setJibunAddress(String jibunAddress) {
		this.jibunAddress = jibunAddress;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getExtraAddress() {
		return extraAddress;
	}

	public void setExtraAddress(String extraAddress) {
		this.extraAddress = extraAddress;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
