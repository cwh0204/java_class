package net.daum.dto;

import lombok.Data;
@Data
public class GuestBookDTO {
	private int gno;
	private String gname;
	private String gtitle;
	private String gcont;
	private String gdate;
}
