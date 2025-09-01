/*
 *  람복 api를 사용한 데이터 저장빈 클래스 BoardDTO.java를 활용한 예제)
 */

import net.daum.dto.BoardDTO;

public class BoardMain {
	public static void main(String[] args) {

		BoardDTO board = new BoardDTO("홍길동","게시판 제목입니다.","게시판 내용입니다.");//전달인자 3개짜리 오버로딩 된 생성자를 호출
		
		System.out.println("글쓴이 : "+board.getWriter());
		System.out.println("글제목 : "+board.getTitle());
		System.out.println("글내용 : "+board.getContent());
	}
}
