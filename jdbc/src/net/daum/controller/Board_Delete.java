package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.BoardDAOImpl;
import net.daum.dto.BoardDTO;

public class Board_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BoardDAOImpl bdao = new BoardDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("##### 게시판 삭제 #####");
		System.out.println("기준이 되는 게시판 번호 입력>>");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		BoardDTO find_Bno = bdao.getFindNo(bno);
		
		if(find_Bno == null) {
			System.out.println("해당 게시판 번호가 없어서 삭제못합니다! 올바른 번호값을 입력하세요!");	
		}else {
			bdao.deleteBoard(bno);
			System.out.println("삭제완료!");
		}
	}

}
