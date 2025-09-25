package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {//중간 데이터 저장빈 클래스 DTO -> tbl_board 테이블의 컬럼명(필드명)과 DTO빈 클래스 맴버 변수명을 일치시킨다.
	private int bno;
	private String bname;
	private String btitle;
	private String bcont;
	private String bdate;
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcont() {
		return bcont;
	}
	public void setBcont(String bcont) {
		this.bcont = bcont;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
}
