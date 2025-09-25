package net.daum.dto;

import lombok.Data;

@Data
public class CustomerDTO { //중간 데이터 저장빈 클래스 => customer테이블의 컬럼명과 빈클래스 맴버변수명(속성)을 같게 한다. 이유는 mybatis 프
	//레임워크 등을 사용할 때 코드 라인을 줄어들게 해주기 때문이다.
	
	private int cus_no;
	private String cus_name;
	private String cus_phone;
	private String cus_email;
	private String cus_date;
	public int getCus_no() {
		return cus_no;
	}
	public void setCus_no(int cus_no) {
		this.cus_no = cus_no;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getCus_phone() {
		return cus_phone;
	}
	public void setCus_phone(String cus_phone) {
		this.cus_phone = cus_phone;
	}
	public String getCus_email() {
		return cus_email;
	}
	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}
	public String getCus_date() {
		return cus_date;
	}
	public void setCus_date(String cus_date) {
		this.cus_date = cus_date;
	}
	
	
}
