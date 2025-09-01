package net.daum.dto;//package 예약어로 net패키지 폴더 하위에 daum폴더 하위에 dto패키지 폴더가 생성된다.

public class MemberDTO {//회원 관리 데이터 저장빈 클래스

	private String mem_id;//회원 아이디
	private String mem_pwd;//비밀번호
	private String mem_name;//회원이름
	private String mem_email;//멜주소
	private String mem_phone;//폰번호
	
	//기본 생성자가 생략
	
	public String getMem_id() {//값 반환 getter() 메서드
		return mem_id;
	}
	public void setMem_id(String mem_id) {//값 저장 setter()메서드
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}	
}
