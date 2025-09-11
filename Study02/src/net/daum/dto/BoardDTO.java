package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter //setter()메서드 자동생성
@Getter //getter()메서드 자동생성
public class BoardDTO {//게시판 데이터 저장빈 클래스
	private String writer;//글쓴이
	private String title;//글제목
	private String content;//글내용
}
