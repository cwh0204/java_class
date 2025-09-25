package net.daum.controller;
/*
 * 게시판 수정폼)
 * 	  게시판 번호를 스케너로 부터 입력받아서 tbl_board테이블로 부터 검색한 다음 해당 번호가 있으면 수정할 글쓴이, 글제목 글내용을 입력받아서 번호를 기준으로
 * 	  수정되게 하고 해당 번호가 없다면 유효성 검증(Validate) 메시지인 "게시판 번호가 없어서 수정못합니다!"라고 출력되게 한다.
 */

import java.util.Scanner;

import net.daum.dao.BoardDAOImpl;
import net.daum.dto.BoardDTO;

public class Board_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAOImpl bdao = new BoardDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("###### 게시판 수정 ######");
		System.out.println("기준이 되는 게시판 번호 입력>>");
		int bno = Integer.parseInt(scan.nextLine());
		
		BoardDTO find_bno = bdao.getFindNo(bno);
		
		if(find_bno != null) {
			System.out.print("수정할 글쓴이 입력>>");
			String bname = scan.nextLine();
			System.out.print("수정할 글 제목 입력>>");
			String btitle = scan.nextLine();
			System.out.print("수정할 글 제목 입력>>");
			String bcont = scan.nextLine();
			
			BoardDTO eb = new BoardDTO();
			eb.setBno(bno);
			eb.setBname(bname);
			eb.setBtitle(btitle);
			eb.setBcont(bcont);
			
			int re = bdao.updateBoard(eb);
			
			if(re == 1)
				System.out.println("게시판 수정에 성공했습니다");
		}else {
			System.out.println("게시판 번호가 없어서 수정못합니다!");
		}
	}

}
